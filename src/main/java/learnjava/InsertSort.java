package learnjava;


public class InsertSort {
	
	public static <T extends Comparable<? super T>> void insertsort(T[] data){
		
		for (int index = 1; index < data.length; index++) {
			
              int key = index;
              T tmpdataT = data[index];
              
              while (key > 0 && tmpdataT.compareTo(data[key-1]) <0) {
				
            	  data[key] = data[key-1];
            	  key --;
			}
			 
			data[key] = tmpdataT;
		}
		
		
		for (int i = 0; i < data.length; i++) {
			
			System.err.print(data[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		
		Integer[] testlist = {1,5,6,3,9,12,10};
        InsertSort.insertsort(testlist);
	}

}
