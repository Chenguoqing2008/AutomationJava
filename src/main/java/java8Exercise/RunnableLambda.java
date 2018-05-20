package java8Exercise;

public class RunnableLambda {
    public static void main(String[] args){

        Thread mythread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable instance.");
            }
        });

        mythread.run();

        //such interface like thread call functional interface.
        Thread mylambdathread = new Thread(()-> System.out.println("runnable lambda instance."));
        mylambdathread.run();

    }
}
