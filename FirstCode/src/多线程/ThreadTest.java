package 多线程;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println("main:"+i);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("你好");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
