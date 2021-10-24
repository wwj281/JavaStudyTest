package 多线程.线程池;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {

        //创建线程池，返回的是一个线程池接口
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //该接口的真正实现类
        ThreadPoolExecutor service = (ThreadPoolExecutor) executorService;
        Number1 number1 = new Number1();
        Number2 number2 = new Number2();
        service.execute(number2);
        Future s = service.submit(number1);
        FutureTask t = (FutureTask) s;
        try {
            Object o = t.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}

class Number1 implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum += i;
            }
        }
        return sum;
    }
}

class Number2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


