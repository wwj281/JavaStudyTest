package HelloWorld;


import java.util.Scanner;
import java.util.Random;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Student s = new Student("小王", "1953281", "男");
    }
}

class Student {
    private String name;
    private String studentNumber;
    private String sex;

    //用this修饰构造器降低代码冗余
    Student() {
        System.out.println("这是一个学生");
    }

    Student(String name) {
        this();
        this.name = name;
    }

    Student(String name, String studentNumber) {
        this(name);
        this.studentNumber = studentNumber;
    }

    Student(String name, String studentNumber, String sex) {
        this(name, studentNumber);
        this.sex = sex;
    }
}

