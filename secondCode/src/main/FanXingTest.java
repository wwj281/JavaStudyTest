package main;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FanXingTest {
    public static void main(String[] args) {
        Person person = new Person();
        List<String> list = person.getList();
        for (String s :
             list) {
            s.getBytes(StandardCharsets.UTF_8);
        }
        System.out.println(list);
    }
}

class Person<T, E> {
    private T name;

    public Person() {
        T t = (T) new Object();
    }

    public <S> void save(S num){

    }

    public List getList(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        return arrayList;
    }

    public T getNumber() {
        return name;
    }

    ;
}

class Student<T, E> extends Person<T, E> {

}
