package 代码块;

public class Abstract {
}

abstract class Person {
    public String name;
    public String sex;
    private int age;

    Person() {
    }

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public abstract void show();
}

class Student extends Person {
    public void show() {
        System.out.println("哈啊哈");
    }
}
