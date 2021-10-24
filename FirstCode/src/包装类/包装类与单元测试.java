package 包装类;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class 包装类与单元测试 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        Vector<Integer> v = new Vector<Integer>();
        int temp = s.nextInt();
        int maxScore = 0;
        while (temp >= 0) {
            v.addElement(temp);
            temp = s.nextInt();
            if (temp > maxScore)
                maxScore = temp;
        }
        for (int i = 0; i < v.size(); i++) {
            int span = maxScore - v.elementAt(i);
            if (span <= 10)
                System.out.println("A");
            else if (span <= 20)
                System.out.println("B");
            else if (span <= 30)
                System.out.println("C");
            else System.out.println("D");
        }
    }
}
