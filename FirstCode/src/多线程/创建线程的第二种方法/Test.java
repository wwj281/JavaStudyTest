package 多线程.创建线程的第二种方法;

public class Test {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread thread1 = new Thread(mythread);
        Thread thread2 = new Thread(mythread);
        Thread thread3 = new Thread(mythread);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread implements Runnable {
    int ticket = 100;
    final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            if(show()==0)
                break;
        }
    }

    public synchronized int show(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖出" + ticket + "号票");
            ticket--;
            return 1;
        } else return 0;
    }
}
