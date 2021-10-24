package IO流.缓冲流;

import java.io.*;

public class TransformTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("FirstCode\\src\\IO流\\hello.txt")));
        char[] chars = new char[5];
        int len;
        while((len = isr.read(chars))!=-1){
            for(int i=0;i<len;i++){
                System.out.print(chars[i]);
            }
        }
        isr.close();
    }

}
