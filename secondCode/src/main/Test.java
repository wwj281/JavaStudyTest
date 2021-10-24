package main;

public class Test {
    private String name;
    private float balance;
    private Test test = null;

    private Test() {
        this.name = "DEFAULT";
        this.balance = 0;
    }

    public Test getTest() {
        if (test == null) {
            synchronized (test) {
                if (test == null) {
                    test = new Test();
                }
            }
        }
        return test;
    }
}
