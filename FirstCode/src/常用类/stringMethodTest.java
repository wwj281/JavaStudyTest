package 常用类;

public class stringMethodTest {
    public static void main(String[] args) {
        String str = "hello";
        //以指定字符串为结尾
        System.out.println(str.endsWith("lo"));
        //以指定字符串为开始
        System.out.println(str.startsWith("le",2));
        //包含
        System.out.println(str.contains("ll"));
        //返回包含字符串的索引,第一个或者最后一个
        System.out.println(str.indexOf("world"));
        System.out.println(str.lastIndexOf("l"));
    }
}
