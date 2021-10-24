package Test;

import java.util.Objects;

public class Student extends Person {
    public String major;
    public String id = "1001";

    public Student() {
        System.out.println("我是学生！");
    }

    public Student(String name, String sex, String id1) {
        setName(name);
        setSex(sex);
        super.setId(id1);
    }

    public Student(String name, String sex, String id1, String major, String id) {
        this(name, sex, id1);
        this.major = major;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void dance(int time) {
        System.out.println("这个学生在跳舞，跳了" + time + "小时");
        super.dance("民族舞");
        System.out.println(id);
    }

    public int dance(String type) {
        System.out.println("这个学生在跳舞,跳的是" + type);
        return 1;
    }

    public void show() {
        System.out.println("学生的姓名是：" + getName());
        System.out.println("学生的性别是：" + getSex());
        System.out.println("学生的专业是：" + major);
        System.out.println("学生的学号是：" + id);
        System.out.println("学生的身份证号是：" + super.id);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("子类的equals");
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getMajor(), student.getMajor()) && Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMajor(), getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", id='" + id + '\'' +
                '}' + " " + super.toString();
    }
}
