package Test;

import java.util.Objects;

public class Person {
    private String name;
    private String sex;
    public String id="1002";

    public Person() {
        System.out.println("我又回来了");
    }

    public Person(String name, String sex, String id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void dance(int time) {
        System.out.println("这个人在跳舞,跳了" + time + "分钟。");
    }

    public int dance(String type) {
        System.out.println("这个人在跳舞,跳的是" + type);
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getSex(), person.getSex()) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
