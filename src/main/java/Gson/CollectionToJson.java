package Gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionToJson {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("Mallory");

        Gson gson = new Gson();
        String jsonNames = gson.toJson(names);
        System.out.println("jsonNames = " + jsonNames);


        Student a = new Student("Alice", "Apple St", new Date(2000, 10, 1));
        Student b = new Student("Bob", "Banana St", null);
        Student c = new Student("Carol", "Grape St", new Date(2000, 5, 21));
        Student d = new Student("Mallory", "Mango St", null);

        List<Student> students = new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        gson = new Gson();
        String jsonStudents = gson.toJson(students);
        System.out.println("jsonStudents = " + jsonStudents);

        Type type = new TypeToken<List<Student>>(){}.getType();
        List<Student> studentList = gson.fromJson(jsonStudents, type);

        for (Student student : studentList) {
            System.out.println("student.getName() = " + student.getName());
        }
    }
}