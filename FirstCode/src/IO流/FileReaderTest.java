package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("FirstCode\\src\\IO流\\hello.txt");
        if (file.exists()) {
            FileReader fis = null;
            try {
                System.out.println("文件存在");
                fis = new FileReader(file);
                char[] cbuf = new char[5];
                int len;
                while ((len = fis.read(cbuf)) != -1) {
                    System.out.println("while一次");
                    for(int i=0;i<len;i++){
                        System.out.println(len);
                        System.out.println(cbuf[i]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (file != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
