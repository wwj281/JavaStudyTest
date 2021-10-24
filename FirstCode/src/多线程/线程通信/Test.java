package 多线程.线程通信;

public class Test {
    public static void main(String[] args) {
//        Number number = new Number();
//        Thread thread = new Thread(number);
//        Thread thread1 = new Thread(number);
//        thread.start();
//        thread1.start();
        Number1 number1 = new Number1();
        Number1 number2 = new Number1();
        number1.start();
        number2.start();
    }
}

class Number implements Runnable {
    private int number = 1;
    private final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                object.notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                } else {
                    break;
                }
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Number1 extends Thread {
    public static int ticket = 100;

    @Override
    public void run() {
        sellTicket();
    }

    public static synchronized void sellTicket() {
        while(ticket>0){
                System.out.print(Thread.currentThread().getName());
                System.out.println("当前票为："+ticket+"号");
                ticket--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
