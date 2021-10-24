package 集合.Test;

import org.junit.Test;

import java.util.*;

public class demo01 {
    public static void main(String[] args) {
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<String> strings2 = new ArrayList<>();
        strings1.add("a");
        strings2.add("a");
        strings1.add("b");
        boolean b = strings1.retainAll(strings2);
        boolean equals = strings1.equals(strings2);
        System.out.println(equals);
        System.out.println(b);
        System.out.println(strings1);
        strings1.add("b");
        strings1.add("c");
        strings1.add("e");
        strings1.add("a");
        System.out.println(strings1);
        System.out.println(strings1);
    }

    @Test
    public void Test(){
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(-1);
        integers.add(-9);
        integers.add(23);
        integers.add(3);
        integers.add(6);
        System.out.println(integers);
        for (Integer i:integers){
            System.out.println(i);
        }
    }

    @Test
    public void  Test1() {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("张三", 18);
        students.put("李四", 11);
        students.put("王五", 10);
        students.put("赵七", 8);
        students.put("刘大", 28);
    }

    @Test
    public void Test2(){
        printMsg("11",11,2.2);
    }

    public static <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("泛型测试"+"t is " + t);
        }
    }
}
