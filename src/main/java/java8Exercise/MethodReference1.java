package java8Exercise;

public class MethodReference1{

    public static void main(String[] args){
        Thread thread = new Thread(MethodReference1::printMessage);
        thread.start();
    }

    public static void printMessage(){
        System.out.println("Hello reference.");
    }
}
