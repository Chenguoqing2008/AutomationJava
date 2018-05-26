package learnjava;


public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {14,15,1,4,5,3,9,16};
		
		for (int i = 0; i < array.length; i++) {
			
			int arraymax = array[i];
			int maxindex = i;
			
			
			//select the max number in the array
			for (int j=i+1;j<array.length;j++){
				if (arraymax > array[j]){
					arraymax = array[j];
					maxindex = j;
					
				}
				
			}
				
			// swap the maxindx with the max number in the array
			if(maxindex != i){
				array[maxindex] = array[i];
				array[i]   = arraymax ;
	
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+" ");
			
		}

	}
}