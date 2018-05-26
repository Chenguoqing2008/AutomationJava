package learnjava;

public class Josephustwo {
	
	public static  int josephusF(int n,int m){
		
		if(n == 1){
		return 0;
		}else {
			//if it return 0, i can't find the index in the total number
			return  (josephusF(n-1,m)+m)%n;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int totalnumber = 10;
      int interval  = 3;
      int index = 0;
      
      index = josephusF(totalnumber,interval);
      
      System.out.println("the index number is: "+ (index+1));
      
      }
	}

