package java.CollectionsExercise;

import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueExercise {

    public static void main(String[] args){

        Deque<Integer> integerDeque = new ConcurrentLinkedDeque<>();
        integerDeque.add(1);
        integerDeque.add(2);
        integerDeque.add(3);

        Queue<Integer> iteratorQueue = Collections.asLifoQueue(integerDeque);
        System.out.println(iteratorQueue.peek());



    }
}
