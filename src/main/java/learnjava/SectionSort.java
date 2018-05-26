package learnjava;

public class SectionSort {

	public static <T extends Comparable<? super T>> void selSort(T[] data){
		
		int min;
		T tmp;
		
		for (int index = 0; index < data.length-1; index++) {
			min = index;
			
			for (int scan = index +1 ; scan < data.length; scan++) {
				
				if (data[scan].compareTo(data[min]) < 0) {
					
					min = scan;
					
				}
				//samp data
				
				tmp = data[min];
				data[min] = data[index];
				data[index] = tmp;	
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.print(data[i] + " ");
		}
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Integer[] array1 = {1,15,3,8,7,16,4};
		
		selSort(array1);

	}

}
