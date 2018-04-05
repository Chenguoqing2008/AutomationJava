package Gson;

import com.google.gson.Gson;

public class ArrayToJson {

    public static void main(String[] args){
        int[] fabonacci = {1,3,5,8,13};
        String[] days = {"Mon","Tues","Wed","Thurs","Fri","Sta","Sun"};

        Gson gson = new Gson();

        String fabonacciJson = gson.toJson(fabonacci);
        System.out.println("Fabonacci json is: " + fabonacciJson.toString());
        String dyasJson = gson.toJson(days);
        System.out.println("Days json is: " + dyasJson.toString());

        int[] numbersFromJson = gson.fromJson(fabonacciJson,int[].class);
        for (int i = 0; i < numbersFromJson.length; i++) {
            System.out.println("number of json element is: " + numbersFromJson[i]);
        }
        String[] stringFromJson = gson.fromJson(dyasJson,String[].class);





    }
}
