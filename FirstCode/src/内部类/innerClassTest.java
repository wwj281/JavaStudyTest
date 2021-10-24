package 内部类;

import java.sql.SQLOutput;

public class innerClassTest {
}

class Person {
    String name;
    String sex;
    int age;

    static class Dog {
        String type;
        String name;

        public void eat() {
            System.out.println("狗吃狗粮");
            System.out.println(name);
        }
    }

    class Bird {
        String type;
        String name;

        public void eat() {
            System.out.println("鸟吃虫");
            Dog dog = new Dog();

        }
    }

    public void eat() {
        int num = 10;
        System.out.println("人吃饭");
        class Fish {
            public void show(){
                System.out.println(num);
            }
        }
    }
}

interface F1 {
    void show();
}

abstract class C1 implements F1 {

}

class F2 extends C1 {
    public void show() {

    }
}