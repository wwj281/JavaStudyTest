package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class newInstanceTest {
    @Test
    public void Test() throws Exception{
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person p = constructor.newInstance("留下", 22);
        System.out.println(p);

    }

    @Test
    public void Test1(){
       /* teacher teacher = new teacher();
        反射.teacher.address address = teacher.getAddress();
        System.out.println(address.getCity());
        System.out.println(address.getNumber());*/
        teacher teach = new teacher();
        teach.print();

    }
}

class teacher{
    private String name;
    private int age;
    static class address{
        private String city;
        private int number;

        public String getCity() {
            return city;
        }

        public int getNumber() {
            return number;
        }
    }
    public address getAddress(){
        address address = new address();
        return address;
    }

    public void print(){
        System.out.println("哈哈哈哈");
        address address = new address();
        System.out.println(address.city);
    }
}
