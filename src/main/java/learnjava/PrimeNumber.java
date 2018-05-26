package learnjava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int INITIALNUMBER = 1001;
		
		int[] numberlist = new int[INITIALNUMBER];
		
		//initialize the array from 2 to 1000
		for (int i = 1; i < numberlist.length ; i++) {
			numberlist[i] = i;
		//	System.out.println(numberlist[i]);
		}
		
		
		
		
		//get the list number
		for (int j = 1 ; j < numberlist.length-1; j++) {
			
			//using square to judge the prime number 
			for (int k = 2; k*k <= numberlist[j]; k++) {
				
				if (numberlist[j] % k == 0){
					numberlist[j] = 0;
				}else {
					continue;
				}
			}
			
		}
		
		for (int t = 2; t < numberlist.length -1; t++) {
			if (numberlist[t] != 0) {
				System.out.println(numberlist[t]);
				//System.err.println();
			}
		}

	}

}