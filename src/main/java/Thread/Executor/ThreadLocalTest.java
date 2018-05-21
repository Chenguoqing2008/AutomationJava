package Thread.Executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        Random random = new Random();

//        @Override
//        protected synchronized Integer initialValue() {
//            return random.nextInt(1000);
//        }
//    };

        @Override
        protected synchronized Integer initialValue(){
            return random.nextInt(1000);
        }
    };

    public static void increment(){
            threadLocal.set(threadLocal.get() + 1);
    }

    public static int get(){
        return  threadLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1; i++) {
            executorService.execute(new Accessortest(i));
        }
        TimeUnit.MILLISECONDS.sleep(300);
        executorService.shutdown();
    }
}

class Accessortest implements  Runnable{
    private final int id;

    public Accessortest(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "#" + id + ":" + ThreadLocalTest.get();
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            ThreadLocalTest.increment();
            System.out.println(this.toString());
            Thread.yield();
        }
    }
}


