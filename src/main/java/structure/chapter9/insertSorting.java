package structure.chapter9;

import Gson.Student;
import org.assertj.core.util.Lists;

import java.util.Date;

public class insertSorting{
  public static <T extends Comparable<? super T>> void sorting(T[] data){
      for (int index = 1; index < data.length; index++) {
          T key = data[index];
          int position = index;

          while (position > 0 && key.compareTo(data[position -1]) < 0){
              data[position] = data[position-1];
              position--;
          }
          data[position] = key;
      }
  }

    public static void main(String[] args) {
        Integer[] sortinglist = {1,4,3,2,7,5,11};
        sorting(sortinglist);
        for (int i = 0; i <sortinglist.length ; i++) {

            System.out.println("The sorted list is: " + sortinglist[i]);
        }

        Student s1 = new Student("Robin","Futian district",new Date());
        Student s2 = new Student("Zhizhi","Futian district",new Date());
        Student s3 = new Student("Bob","Washionton district",new Date());
        Student s4 = new Student("Hams","Virginia district",new Date());
        Student[] studentslist = {s1,s2,s3,s4};
        sorting(studentslist);
        for (int i = 0; i <studentslist.length ; i++) {

            System.out.println("The sorted student name is: " + studentslist[i].getName());
        }

    }

}