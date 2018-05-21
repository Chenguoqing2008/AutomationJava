package Thread.ThreadLocalTestExercise;

import Thread.ThreadLocalTest.Accessor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTestExercise {

    private static ThreadLocal<Integer> threadLocalexercise= new ThreadLocal<Integer>(){
        Random random = new Random();

        @Override
        protected synchronized Integer initialValue(){
            return random.nextInt(1000);
        }
    };

    public static void increment(){
        threadLocalexercise.set(threadLocalexercise.get()+1);
    }

    public static int get(){
        return threadLocalexercise.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1 ; i++) {
            executorService.execute(new AccessorExercise(i));
        }
        TimeUnit.MILLISECONDS.sleep(300);
        executorService.shutdown();
    }
}
