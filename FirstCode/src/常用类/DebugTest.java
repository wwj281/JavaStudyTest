package 常用类;

public class DebugTest {
    public static void main(String[] args) {
        String str = new String("abc");
        String s = new String(str);
        System.out.println(s==str);
    }
}
