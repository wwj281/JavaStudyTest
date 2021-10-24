package 多线程.TreadMethodTest;

/*
 * join方法，让调用该方法的线程先执行，在该线程执行完之前，父线程无法执行
 * yield方法：当前线程释放CPU
 * stop方法：强制让当前线程结束
 * sleep方法：让当前线程睡眠，单位是毫秒（ms）
 * isAlive方法：判断当前线程是否存活
 *
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}

class MyThread extends Thread {
    static int ticket = 100;

    public void run() {
        while (true) {
            if (show() == 0)
                break;
        }
    }

    public static synchronized int show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖出" + ticket + "号票");
            ticket--;
            return 1;
        } else return 0;
    }
}
