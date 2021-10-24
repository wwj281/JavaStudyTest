package 多线程.生产者消费者;

public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor1 = new Productor(clerk);
//        Productor productor2 = new Productor(clerk);
//        Productor productor3 = new Productor(clerk);
        Customer customer1 = new Customer(clerk);
//        Customer customer2 = new Customer(clerk);
//        Customer customer3 = new Customer(clerk);
        Thread thread1 = new Thread(productor1);
        Thread thread2 = new Thread(customer1);
//        Thread thread3 = new Thread(productor2);
//        Thread thread4 = new Thread(customer2);
//        Thread thread5 = new Thread(productor3);
//        Thread thread6 = new Thread(customer3);
        thread1.start();
        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
    }
}

class Clerk {
    private Integer product = 0;
    private Integer full = 0;
    private Integer empty = 20;

    public void setProduct(int num) {
        this.product += num;
    }

    public Integer getEmpty() {
        return empty;
    }

    public Integer getFull() {
        return full;
    }

    public Integer getProduct() {
        return product;
    }

    public void setEmpty(int num) {
        this.empty += num;
    }

    public void setFull(int num) {
        this.full += num;
    }


}

class Productor implements Runnable {
    final private Clerk clerk;


    Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (clerk.getFull()) {
                if (clerk.getEmpty() > 0) {
                    synchronized (clerk.getEmpty()) {
                        clerk.setProduct(1);
                        clerk.setFull(1);
                        clerk.setEmpty(-1);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("生产者" + Thread.currentThread().getName() + "生产了一个产品，当前产品数为：" + clerk.getProduct());
                    }
                }
            }
        }
    }
}

class Customer implements Runnable {
    private Clerk clerk;

    Customer() {

    }

    Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (clerk.getFull()) {
                if (clerk.getFull() > 0) {
                    synchronized (clerk.getEmpty()) {
                        clerk.setProduct(-1);
                        clerk.setFull(-1);
                        clerk.setEmpty(1);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("消费者" + Thread.currentThread().getName() + "消费了一个产品，当前产品数为：" + clerk.getProduct());
                    }
                }
            }
        }
    }
}