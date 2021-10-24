package 多线程.懒汉式;

public class Test {
}

class Bank {
    private static Bank bank;

    private Bank() {
    }

    public static Bank getBank() {
        if (bank == null) {
            synchronized (Bank.class) {
                if (bank == null) {
                    bank = new Bank();
                }
            }
        }
        return bank;
    }
}