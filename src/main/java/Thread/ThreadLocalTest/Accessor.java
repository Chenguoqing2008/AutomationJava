package Thread.ThreadLocalTest;

import Thread.Executor.ThreadLocalTest;

public class Accessor implements  Runnable{
    private final int id;

    public Accessor(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "#" + id + ":" + ThreadLocalTest.get();
    }

    @Override
    public void run() {
      if(!Thread.currentThread().isInterrupted()){
          ThreadLocalTest.increment();
          System.out.println(this.toString());
          Thread.yield();
      }
    }
}
