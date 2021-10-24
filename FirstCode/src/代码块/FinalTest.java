package 代码块;

public class FinalTest {
}

class FinalA {
    private static FinalA fa = new FinalA();

    private FinalA(){}

    public static FinalA getFa() {
        return fa;
    }
}


