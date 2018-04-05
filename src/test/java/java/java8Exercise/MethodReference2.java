package java.java8Exercise;

public class MethodReference2 {

    public static void main(String[] args){
        Thread thread = new Thread(MethodReference2::printMessage);
        thread.start();
    }

    public static void printMessage(){
        System.out.println("Hello reference.");
    }
}
