package 集合.MapTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesTest {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        props.load(fis);
        String name = props.getProperty("name");
        String passWord = props.getProperty("passWord");
        System.out.println(name + " " + passWord);
    }
}
