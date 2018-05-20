package Collections.CollectionsExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinEmptyExercise {

    public static void main(String[] args){

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        Integer max = Collections.max(integerList);
        System.out.println("max value is:" + max);

        List<String> stringlist = Collections.emptyList();
        System.out.println("String list size is: "+ stringlist.size());




    }
}
