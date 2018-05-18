package structure.chapter9;


public class QuickSortLearn {

	
	public static <T extends Comparable<T>> void quickSort(T[] data){
		quickSort(data,0,data.length-1);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] data,int min, int max){
		
		if (min < max){
			int indexofpartition = partition(data,min,max);
			quickSort(data,min,indexofpartition-1);
			quickSort(data,indexofpartition+1,max);
		}
	}
	
	
	public static <T extends Comparable<T>> int partition(T[] data,int min, int max){
		
		T partitionelement;
		int left,right;
		int middle = (min + max)/2;

		partitionelement = data[middle];
		swap(data,middle,min);
		
		left = min;
		right = max;
		
		while(left < right){
			while(left < right && data[left].compareTo(partitionelement) <= 0)
				left ++;
			while(data[right].compareTo(partitionelement) >0)
				right --;
			if (left < right)
				swap(data,left,right);	
		}
		swap(data,min,right);
		return right;
	}
	
	public static <T extends Comparable<T>> void swap(T[] data,int positionL, int positionR){
		
		T tmp = data[positionL];
		data[positionL] = data[positionR];
		data[positionR] = tmp;
	}
	
	public static void main(String[] args) {
		Integer[] array1 = {1,15,3,8,7,17,2,98,16,72,4};
		quickSort(array1);
	}
}
