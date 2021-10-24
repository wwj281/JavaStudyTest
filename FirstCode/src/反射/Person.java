package 反射;

public class Person {
    private String name;
    public int age;
    private static String sex ="男";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "是一个人");
    }

    private void showNation() {
        System.out.println(name+"是中国人");
    }

    private  static void showDesc() {
        System.out.println("我是一个可爱的中国人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
