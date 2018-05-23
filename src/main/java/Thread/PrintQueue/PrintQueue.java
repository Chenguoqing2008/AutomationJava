package Thread.PrintQueue;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {

    private final  Lock queuelock = new ReentrantLock();

    public void printQueue(Object document){

        queuelock.lock();

        try {
            long time = (long) (Math.random()*10000);
            System.out.println("Current thread name is: " + Thread.currentThread().getName()
            + " PrintQueue last : " + time/1000 + "seconds");
            Thread.sleep(time);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            queuelock.unlock();
        }
    }
}
