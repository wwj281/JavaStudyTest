package 常用类;

public class stringBufferAndBuilder {
    public static void main(String[] args) {
        /*String str =new String();
        str = new String("abc");
        System.out.println();*/
        StringBuffer sb = new StringBuffer("abc");
        StringBuilder sb1 = new StringBuilder(12);
        //常用方法
        sb.append("1");
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.setCharAt(1,'w');
        System.out.println(sb);
        sb.replace(0,sb.length(),"wang");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        sb.insert(0,"ssr").append("hhh").delete(1,2);
        System.out.println(sb);
    }
}
