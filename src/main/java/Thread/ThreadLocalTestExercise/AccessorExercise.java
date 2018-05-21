package Thread.ThreadLocalTestExercise;

public class AccessorExercise implements Runnable {
    private final int id;

    public AccessorExercise(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "#"+id+":"+ThreadLocalTestExercise.get();
    }

    @Override
    public void run() {
        if(!Thread.currentThread().isInterrupted()){
            ThreadLocalTestExercise.increment();
            System.out.println(this.toString());
            Thread.yield();
        }
    }
}
