package 异常;

public class ExceptionTest {
    public static void main(String[] args) throws NullPointerException{
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            String str = null;
            System.out.println(str.charAt(0));
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

