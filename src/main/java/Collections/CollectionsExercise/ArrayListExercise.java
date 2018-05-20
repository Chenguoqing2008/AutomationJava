package Collections.CollectionsExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

    public static void main(String[] args){

        List<String> list1 = new ArrayList<String>();
        list1.add("test1");
        list1.add("test2");

        Collections.addAll(list1,"test2");

        System.out.println(list1.size());

        List<ParentClass> parentClassList = new ArrayList<>();
        parentClassList.add(new ParentClass());

        Collections.addAll(parentClassList,new ChildClass());
        System.out.println(parentClassList.size());

        parentClassList.get(1).callParent();

    }
}
