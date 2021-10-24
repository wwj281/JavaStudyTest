package 集合;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        /*
         * Collection接口中的API
         * 增
         * add()
         * addAll(Collection coll)
         *
         * 删
         * remove()
         *
         * 差集
         * removeAll()
         *
         * 交集
         * retainAll()
         *
         * isEmpty()
         * size()
         * clear()
         * contains()
         * containsAll()
         * toArray()
         * iterator()
         * */

        /*Collection coll = new ArrayList();

        coll.add("qq");
        coll.add("weixin");
        coll.add(123);
        coll.add(new Date());

        System.out.println(coll.size());
        System.out.println(coll);

        Collection coll1 = new ArrayList();
        coll1.addAll(coll);
        System.out.println(coll1.size());
        System.out.println(coll1);
        System.out.println(coll1.isEmpty());
        coll1.clear();
        System.out.println(coll1.isEmpty());*/

        /*Collection coll =new ArrayList();
        Collection coll1 = Arrays.asList(123,456);
        coll.add(789);
        coll.add(new Person("jerry",20));
        coll.add(123);
        coll.add(456);
        System.out.println(coll.contains(new Person("jerry",20)));
        System.out.println(coll.containsAll(coll1));*/

        /*Collection coll =new ArrayList();
        Collection coll1 = Arrays.asList(123,456);
        coll.add(789);
        coll.add(new Person("jerry",20));
        coll.add(123);
        coll.add(456);
        coll.removeAll(coll1);
        System.out.println(coll);*/

        Collection coll = new ArrayList();
        Collection coll1 = Arrays.asList(123, 456);
        coll.add(789);
        coll.add(125);
        coll.add(new Person("jerry", 19));
        coll.add(123);
        coll.add(456);
        Iterator i = coll.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            if (o.equals(new Person("jerry", 19))) {
                i.remove();
            }
        }
        System.out.println("**********");
        for (Object o : coll) {
            System.out.println(o);
        }
    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person Equals");
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            if(this.name.equals(p.name)){
                return Integer.compare(this.age,p.age);
            }else {
                return this.name.compareTo(p.name);
            }
        }
        throw new RuntimeException("传入参数不合法");
    }
}
