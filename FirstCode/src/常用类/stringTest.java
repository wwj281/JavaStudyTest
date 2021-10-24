package 常用类;

import java.util.Locale;

public class stringTest {
    public static void main(String[] args) {
/*        *//*
        * String类初始化方法以及在内存中的存储方式
        * *//*
        //用字面量初始化得到的是字符串常量，存储在方法区的字符串常量池中，常量池中的字符串唯一
        String str1 = "abc";
        String str2 = "abc";
        //用new创建字符串对象，初始化存储在堆中，他有一个char型数组，指向字符串常量池中的一个常量
        String  str3 = new String("abc");
//        System.out.println(str1);
//        System.out.println(str2);
        //intern()返回常量池中的地址
        System.out.println(str3.intern());
        //用char型数组初始化
        char[] c = {'a', 'b', 'c'};
        String str = new String(c,1,2);
        System.out.println(str);*/



        /*
        * String常用方法
        * */
        String str4 = "hello world";
        System.out.println(str4.length());

        //索引
        System.out.println(str4.charAt(1));

        //转换大小写
        System.out.println(str4.toLowerCase(Locale.ROOT));
        System.out.println(str4.toUpperCase(Locale.ROOT));
        System.out.println(str4);

        //去除前后的空格
        String str5 = " hello world ";
        System.out.println("---"+str5.trim()+"---");
        System.out.println("---"+str5+"---");

        //equals()判断值是否相同
        String str6 = "hello";
        String str7 = "Hello";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));

        //concat() == '+'

        //compareTo()
        System.out.println(str6.compareTo(str7));
    }
}
