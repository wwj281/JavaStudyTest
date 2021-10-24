package 单例模式;

public class danlie {
    public static void main(String[] args) {
        Bank b=Bank.getBank();
    }
}

class Bank {
    private static Bank bank = new Bank();

    private Bank() {
        System.out.println("哈哈哈哈");
    }

    public static Bank getBank() {
        return bank;
    }
}
