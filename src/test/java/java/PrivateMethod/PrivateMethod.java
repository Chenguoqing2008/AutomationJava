package java.PrivateMethod;

import java8Exercise.Student;

public class PrivateMethod {

    private String parseStringtoInt(String welcome,Student s1){

//        LocalDateTime localDateTime = LocalDateTime.now();

//        String localDateTime = "2017-11-30";
//        Student s1 = new Student("male",23);

        String time = TimeUitl.getTime(s1);

        String slogan = welcome + time;

        return slogan;
    }

    public String getresult(String welcome,Student s){
       String a = parseStringtoInt(welcome,s);
       return a;
    }
}