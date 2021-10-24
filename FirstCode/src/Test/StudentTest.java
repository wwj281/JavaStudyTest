package Test;

public class StudentTest {
    public static void main(String[] args) {
        Person s = new Person("小王", "男", "522127200107040017");
        Person p = new Student("小王", "男", "522127200107040017", "软件", "1953281");
        if (s.equals(p))
            System.out.println("hahaha");
    }
}
