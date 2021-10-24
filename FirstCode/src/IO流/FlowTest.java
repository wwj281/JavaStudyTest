package IO流;

import java.io.*;

public class FlowTest {
    public static void main(String[] args) {
        File file = new File("FirstCode\\src\\IO流\\hello.txt");
        if (file.exists()) {
            FileReader fis = null;
            try {
                System.out.println("文件存在");
                fis = new FileReader(file);
                int data = fis.read();
                while (data != -1) {
                    System.out.println((char) data);
                    data = fis.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(file!=null){
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
