package IO流.缓冲流;

import HelloWorld.F;

import java.io.*;

public class BufferInputStreamTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("FirstCode\\src\\IO流\\hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("FirstCode\\src\\IO流\\hi.txt")));
            String str=null;
            while ((str=br.readLine())!=null) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
