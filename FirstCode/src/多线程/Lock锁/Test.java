package 多线程.Lock锁;


import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Window myThread3 = new Window();
        Thread thread1 = new Thread(myThread3);
        Thread thread2 = new Thread(myThread3);
        Thread thread3 = new Thread(myThread3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window implements Runnable {
    int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖出" + ticket + "号票");
                    ticket--;
                } else break;
            } finally {
                lock.unlock();
            }
        }
    }
}

