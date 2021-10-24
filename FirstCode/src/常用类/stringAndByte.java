package 常用类;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class stringAndByte {
    public static void main(String[] args) {
//        String与char[]
        String str="hello";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        String str1 = new String(chars);
        System.out.println(str1);
//        String与byte[]
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        String str2 = new String(bytes);
        System.out.println(str2);
    }
}
