package 泛型;

import java.util.ArrayList;
import java.util.Objects;

public class User<T> implements Comparable<User>{
    private String name;
    private int age;
    T type;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof 集合.User)) return false;
        集合.User user = (集合.User) o;
        return getAge() == user.getAge() && Objects.equals(getName(), user.getName());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    public void setType(T type) {
        this.type = type;
    }
}
