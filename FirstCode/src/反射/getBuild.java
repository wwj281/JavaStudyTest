package 反射;

import org.junit.Test;

import java.lang.reflect.Field;

public class getBuild {
    @Test
    public void getFieldTest() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
            System.out.println("权限修饰符：" + f.getModifiers());
            Class<?> type = f.getType();
            System.out.println(type);
        }
    }

    @Test
    public void getMethodTest() {
        Class<Person> personClass = Person.class;
    }
}
