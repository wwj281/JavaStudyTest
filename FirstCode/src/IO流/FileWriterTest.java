package IO流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("FirstCode\\src\\IO流\\hi.txt");
        FileWriter fw = new FileWriter(file,true);
        fw.write("I have a dream!\n");
        fw.write("you also have a dream!\n");
        fw.close();
    }
}
