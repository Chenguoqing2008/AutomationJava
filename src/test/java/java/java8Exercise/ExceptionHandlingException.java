package java.java8Exercise;

import java.util.function.BiConsumer;

public class ExceptionHandlingException {

    public static void main(String[] args){

        int [] someNumbers = {1,2,3,4};
        int key = 0;

        process(someNumbers,key, wrapperlambda((k,v)-> System.out.println(k/v)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> consumer) {
        for (int i:someNumbers){
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperlambda(BiConsumer<Integer,Integer> consumer){
        return (k,v)-> {
            try {
                consumer.accept(k, v);
            } catch (ArithmeticException e) {
                System.out.println("Exception happened in wapper.");
            }
        };
    }
}
