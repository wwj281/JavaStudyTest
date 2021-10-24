package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectionTest {
    @Test
    public void Test() throws Exception{
        Class<Person> personClass = Person.class;
        Class<?> aClass = Class.forName("反射.Person");
        System.out.println(personClass==aClass);
    }
}

class student{
    private int a =10;
}
