package StringExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicOfString {
    private static final String SUCCESS = "success";

    public static void main(String[] args) {
        String s1 = "HelloWorld";  // cached in the string pool
        String s2 = "HelloWorld"; // s2 will point to the same string object in the string pool
        String s3 = new String("HelloWorld"); // this string is not interned.
        s1.toUpperCase();
        System.out.println(s1);
        System.out.println("Are the same reference： " + (s1 == s2));
        System.out.println("Are the same reference： " + (s1 == s3));

        System.out.println("index is: " + s1.indexOf("W"));

        String regexpression = "(.*)World$";
        Pattern pattern = Pattern.compile(regexpression);
        Matcher matcher = pattern.matcher(s1);
        System.out.println("match test: " + s1.matches("(.*)World$"));
        System.out.println("match result is: " + matcher.matches());

        System.out.println("Substring test :" + s1.substring(s1.length()));

        //StringBuffer is thread safe
        //StringBuilder is not thread safe

        StringBuilder stringbuiler = new StringBuilder("This is a: ").append(Boolean.valueOf(true));
        System.out.println(stringbuiler.toString());

        //concat
        System.out.println("the concat string is: "+ s1.concat(s2));

        String operation = operation();
        //in this way, it will throw nullpointerexception
//        if(operation.equals(SUCCESS)){
//            System.out.println("hello");
//        }
        if(SUCCESS.equals(operation)){
            System.out.println("hello");
        }else
        {
            System.out.println("result not match");
        }


    }

    private static String operation() {
        return null;
    }
}
