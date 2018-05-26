package learnjava;

import java.util.Arrays;

public class CountNumber {
	
   public  void findMaxNumber(){
       int TagNumber = 0;

       int currentcount = 0;

       int maxcount = 0;

       int[] arrayB  = {1,3,5,6,7,9,9,12,3,12,12,5,3,6,12,6,12,5,3};

       Arrays.sort(arrayB);


       for (int i = 0; i < arrayB.length; i++) {

            System.out.print(arrayB[i]+" ");

        }

        System.out.println();

        for (int i = 0; i < arrayB.length; i++) {

           System.out.println("the "+i+" loop is here.");
           
           currentcount++;
           
           System.out.println("the count number is: "+currentcount );
           
           //if get the end of array, don't compare the last one

           //the sorted array, compare to adjacent number, if they are different then change the counter to store the max one

           if (i == arrayB.length -1||arrayB[i] != arrayB[i+1]){

               if(currentcount > maxcount ){
                   maxcount = currentcount;
                   TagNumber = arrayB[i];
                }
               currentcount = 0;
            }
        }
        System.out.println("the max counted number is: "+TagNumber+" Its times is: "+maxcount);
   }

   public static void main(String[] args){
        CountNumber test = new CountNumber();

       test.findMaxNumber();
    }
}

 
