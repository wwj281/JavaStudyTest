package 泛型;

import java.util.ArrayList;

public class mainTest {
    public static void main(String[] args) {
        SubUser<Integer> integerSubUser = new SubUser<>();
        ArrayList<? extends Number> users = new ArrayList<Integer>();
    }
}
