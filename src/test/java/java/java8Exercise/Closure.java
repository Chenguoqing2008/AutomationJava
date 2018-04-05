package java.java8Exercise;

public class Closure {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        doProcess(a,i -> System.out.println(i+b));

    }

    public static void doProcess(int a,Process process){
        process.process(a);
    }

    interface  Process{
        void process(int i);
    }
}
