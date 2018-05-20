package java.lambdaexercise;

import java8Exercise.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PredictMale {

     @Test
     public void testPredict(){

        Student s1 = new Student("Male", 23,"Hams");
        Student s2 = new Student("Male", 25,"Tomas");
        Student s3 = new Student("Female", 20,"William");
        Student s4 = new Student("Male", 29,"Jane");
        Student s5 = new Student("Male", 26,"Alice");
        Student s6 = new Student("Female", 22,"Robbins");
        Student s7 = new Student("Male", 31,"Rodic");
        Student s8 = new Student("Female", 36,"Sliver");
        Student s9 = new Student("Male", 35,"Right");

        List<Student> studentlist = new ArrayList<Student>();

         studentlist.add(s1);
         studentlist.add(s2);
         studentlist.add(s3);
         studentlist.add(s4);
         studentlist.add(s5);
         studentlist.add(s6);
         studentlist.add(s7);
         studentlist.add(s8);
         studentlist.add(s9);

         List<String> collect1 = studentlist.stream().map(student -> student.getSex()).collect(Collectors.toList());

         long number = studentlist.stream().filter(student -> student.getSex().equals("Male")).count();

         Collections.sort(studentlist, new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return o1.getName().compareTo(o2.getName());
             }
         });


         System.out.println("result is: " + collect1);
         System.out.println("long value is: " + number);

         //print all the elements in the student list
         printAll(studentlist);


         //print all the students that their name begin with R
         System.out.println("print all the students that their name begin with R");
         printConditionally(studentlist, new Condition() {
             @Override
             public boolean test(Student s) {
                 boolean testflag = false;
                 if(s.getName().startsWith("R")){
                    testflag = true;
                 }
                 return testflag;
             }
         });

    }

    private static void printConditionally(List<Student> studentlist,Condition condition) {
        for(Student s:studentlist) {
            if (condition.test(s)){
                System.out.println(s);
            }
        }
    }

    private static void printAll(List<Student> studentlist) {
         for(Student s:studentlist)
             System.out.println(s);
    }

    interface Condition{

         boolean test(Student s);

    }


}
