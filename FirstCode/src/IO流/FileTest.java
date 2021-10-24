package IO流;

import HelloWorld.F;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        /*File file = new File("hello.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file1 = new File("D:\\Java项目\\学习测试\\FirstCode\\src\\IO流\\hello.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file1.getPath());
        System.out.println(file.exists());
        System.out.println(file1.exists());
        System.out.println("+++++");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());*/
        File file = new File("D:\\Java项目\\学习测试\\FirstCode\\src\\IO流");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

