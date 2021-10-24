package 反射;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
    @Test
    public void Test() throws Exception{
        Properties properties = new Properties();
        /*FileInputStream fis = new FileInputStream(new File("jdbc.properties"));
        properties.load(fis);*/
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream ras = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(ras);
        String name = properties.getProperty("name");
        String passWord = properties.getProperty("passWord");
        System.out.println(name);
        System.out.println(passWord);
    }
}
