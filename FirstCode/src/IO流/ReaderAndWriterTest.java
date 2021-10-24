package IO流;

import java.io.*;

public class ReaderAndWriterTest {
    public static void main(String[] args){
        File fr = new File("FirstCode\\src\\IO流\\爱情与友情.jpg");
        File fw = new File("FirstCode\\src\\IO流\\友情与爱情1.jpg");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(fr);
            fileWriter = new FileWriter(fw);
            int len;
            char[] buf = new char[5];
            while((len = fileReader.read(buf))!=-1){
                fileWriter.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
