package 多线程.创建线程的第三种方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        Number number = new Number();
        FutureTask futureTask = new FutureTask(number);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            Object obj=futureTask.get();
            System.out.println("总和为："+obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class Number implements Callable{
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
