package Thread.PrintQueue;

public class RunPrintQueue implements Runnable{

    private  PrintQueue printQueue;

    public RunPrintQueue(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.println("Going to print a document " + Thread.currentThread().getName() +"\n");
        printQueue.printQueue(new Object());
        System.out.println("Document has been pulished  " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length ; i++) {
            threads[i] = new Thread(new RunPrintQueue(printQueue),"thread " +i);
        }

        for (int i = 0; i < threads.length ; i++) {
            threads[i].start();
        }
    }
}
