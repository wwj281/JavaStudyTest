package IO流;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStream {
    public static void main(String[] args) {
        File fr = new File("FirstCode\\src\\IO流\\爱情与友情.jpg");
        File fw = new File("FirstCode\\src\\IO流\\友情与爱情1.jpg");
        FileInputStream fileReader = null;
        FileOutputStream fileWriter = null;
        try {
            fileReader = new FileInputStream(fr);
            fileWriter = new FileOutputStream(fw);
            int len;
            byte[] buf = new byte[5];
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
    @Test
    public void Test(){
        System.out.println(1);
    }
}
