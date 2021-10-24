package 多线程.存钱;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        Thread client1 = new Thread(account);
        Thread client2 = new Thread(account);
        client1.setName("客户1");
        client2.setName("客户2");
        client1.start();
        client2.start();
    }
}

class Account implements Runnable {
    int money = 0;
    private final ReentrantLock lock = new ReentrantLock(true);

    @Override
    public synchronized void run() {
        notify();
        for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money += 1000;
                System.out.println(Thread.currentThread().getName() + "存了1000块钱钱，当前余额为:" + money);
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

