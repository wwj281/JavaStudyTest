import org.junit.Test;

import java.util.Base64;

public class newTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        String name = stringClass.getSimpleName();
        System.out.println(name);
    }

    @Test
    public void Test(){
        Class<?> aClass = String.class;
        Class<String> bClass = (Class<String>)aClass;
        System.out.println(bClass);
    }
}
