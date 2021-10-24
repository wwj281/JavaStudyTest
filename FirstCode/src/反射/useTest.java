package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class useTest {
    @Test
    public void useFieldsTest() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name);
        name.set(person, "王文炯");
        String o = (String) name.get(person);
        System.out.println(o);
        Method print = personClass.getDeclaredMethod("show");
        print.invoke(person);
        Method showNation = personClass.getDeclaredMethod("showDesc");
        showNation.setAccessible(true);
        showNation.invoke(person);
        Field sex = personClass.getDeclaredField("sex");
        sex.setAccessible(true);
        Object o1 = sex.get(personClass);
        System.out.println(o1);
    }

    @Test
    public void useConstructorTest() throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
        Person person = constructor.newInstance("王文炯",20);
        System.out.println(person);
    }
}
