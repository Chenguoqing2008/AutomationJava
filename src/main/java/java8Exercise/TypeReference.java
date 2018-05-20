package java8Exercise;

public class TypeReference {

    public static void main(String[] args) {

        stringlambda typelambda = s -> s.length();
        // stringlambda typelambda = (String s) -> s.length();
        System.out.println(typelambda.getlength("test"));

        printStringLambda(s -> s.length());

    }

    //pass lambda as parameter
    public static void printStringLambda(stringlambda strl) {
        System.out.println(strl.getlength("test lambda"));

    }

    interface stringlambda {

        int getlength(String s);

    }

}