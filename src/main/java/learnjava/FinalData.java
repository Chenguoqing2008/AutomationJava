package learnjava;

import java.util.Random;

public class FinalData {  
	  private static Random rand = new Random(47);  
	  private String id;  
	  public FinalData(String id) { this.id = id; }  
	  // Can be compile-time constants:  
	  private  int valueOne = 9;  
	  private final String testS = "test";
	  private static final int VALUE_TWO = 99;  
	  // Typical public constant:  
	  public static final int VALUE_THREE = 39;  
	  // Cannot be compile-time constants:  
	  private final int i4 = rand.nextInt(20);  
	  static final int INT_5 = rand.nextInt(20);  
	  private Value v1 = new Value(11);  
	  private final Value v2 = new Value(22);  
	  
	  public Value getValue(){
		  
		  return this.v2;
	  }
	  public int getintValue(){
		  
		  return this.valueOne;
	  }
	  private static final Value VAL_3 = new Value(33);  
	  // Arrays:  
	  private final int[] a = { 1, 2, 3, 4, 5, 6 };  
	  public String toString() {  
	    return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;  
	  }  
	  
	  
	  public static void main(String[] args) {  
	    FinalData fd1 = new FinalData("fd1");  
	   fd1.valueOne++; // Error: can't change value
	   System.out.println("fd1.valueOne is: " + fd1.valueOne);
	   System.out.println("fd1.v2.i : " + fd1.v2.i);
	    fd1.v2.i++; // Object isn't constant!  
	    System.out.println("fd1.v2.i : " + fd1.v2.i);
	    fd1.v1 = new Value(9); // OK -- not final  
	    for(int i = 0; i < fd1.a.length; i++)  {
	    	
	    	fd1.a[i]++; // Object isn't constant!  
	    	System.out.println("fd1.a["+i+"] is: " + fd1.a[i]);
	    	
	    }
	    
	    Value v2copy = fd1.getValue();
	    v2copy = new Value(3);
	    System.out.println("v2copy i is: " + v2copy.i);
	    // fd1.v2 = new Value(0); // Error: Can't  
	    // fd1.VAL_3 = new Value(1); // change reference  
	    //! fd1.a = new int[3];  
	    System.out.println(fd1);  
	    System.out.println("Creating new FinalData");  
	    FinalData fd2 = new FinalData("fd2");  
	    String str = fd1.testS;
	    int int1 = fd1.getintValue();
	    int1++;
	    str = "abc";
	    System.out.println("String value is: " + str);
	    System.out.println("int value is: " + int1);
	    System.out.println(fd1);  
	    System.out.println(fd2);  
	    String test2 = fd1.testS;
	    test2 = "test3";
	    System.out.println("String is: " + test2);
	  }  
	}   
	  
	/* Output: 
	fd1: i4 = 15, INT_5 = 18 
	Creating new FinalData 
	fd1: i4 = 15, INT_5 = 18 
	fd2: i4 = 13, INT_5 = 18 
	*/  