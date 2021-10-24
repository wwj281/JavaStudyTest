package 常用类;

public class stringAndChar {
    public static void main(String[] args) {
        String str = "abcd erf hd";
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.println("+++++");
        char[] c = {'a','b','c'};
        String str1 = new String(c);
        System.out.println(str1);
    }
}
