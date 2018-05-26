package learnjava;


public class QuickSortLearn {

	
	public static <T extends Comparable<T>> void quickSort(T[] data){
		
		quickSort(data,0,data.length-1);
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.print(data[i]+ " ");
		}
		
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] data,int min, int max){
		
		if (min < max){
			
			//create partitions
			int indexofpartition = partition(data,min,max);
			
			//sort the left partition(lower values)
			quickSort(data,min,indexofpartition-1);
			
			//sort the right partition(higher values)
			quickSort(data,indexofpartition+1,max);
			
		}
		
	}
	
	
	public static <T extends Comparable<T>> int partition(T[] data,int min, int max){
		
		T partitionelement;
		int left,right;
		int middle = (min + max)/2;
		
		//use the middle data value as the partition element
		partitionelement = data[middle];
		
		//move it out of the way for now
		swap(data,middle,min);
		
		left = min;
		right = max;
		
		while(left < right){
			
			//search for an element that is > the partition element
			while(left < right && data[left].compareTo(partitionelement) <= 0)
				left ++;
			
			//search for an element that is  < the partition element
			while(data[right].compareTo(partitionelement) >0)
				right --;
			
			//swap the elements
			if (left < right)
				swap(data,left,right);	
		}
		
		//move the partition element into place
		swap(data,min,right);
		
		return right;
	}
	
	public static <T extends Comparable<T>> void swap(T[] data,int positionL, int positionR){
		
		T tmp = data[positionL];
		data[positionL] = data[positionR];
		data[positionR] = tmp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Integer[] array1 = {1,15,3,8,7,17,2,98,16,72,4};
		
		quickSort(array1);
			
	}

}
