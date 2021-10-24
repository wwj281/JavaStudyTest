package 异常;

import java.util.Arrays;
import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        EcmDef e = new EcmDef();
        Scanner s = new Scanner(System.in);
        String a = s.next();
        EcmDef ecmDef = new EcmDef();
        String b = s.next();
        try {
            int z= e.ecm(a, b);
            System.out.println(z);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException | MyException1 e1) {
            System.out.println(e1.getMessage());
        }
    }

    public int ecm(String a, String b) throws ArrayIndexOutOfBoundsException, NumberFormatException, MyException1, ArithmeticException {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x < 0 || y < 0)
            throw new MyException1("您输入的数中有负数");
        int z = x / y;
        return z;
    }
}

class MyException1 extends Exception {
    static final long serialVersionUID = -3387516993134229958L;

    public MyException1() {

    }

    public MyException1(String message) {
        super(message);
    }
}