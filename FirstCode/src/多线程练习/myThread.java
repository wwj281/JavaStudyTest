package 多线程练习;

public class myThread {
    public static void main(String[] args) {
        myThread1 myThread1 = new myThread1();
        myThread1 myThread2 = new myThread1();
        System.out.println(Thread.currentThread().getName());
        try {
            myThread1.start();
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

class myThread1 extends Thread{
    myThread1(){
        super();
    }
    myThread1(String name){
      super(name);
    }
    @Override
    public void run() {
        System.out.println(this.getName());
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
        System.out.println("这是线程1");
    }
}

class myThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
        System.out.println("这是线程2");
    }
}
