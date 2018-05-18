package structure.chapter9;

public class BubbleSort {

	public static <T extends Comparable<? super T>> void bubbleSort(T[] data){

		for (int index = 0; index < data.length ; index++) {
			for (int scan = index + 1; scan < data.length; scan++) {
				if(data[index].compareTo(data[scan]) > 0){
					swap(data,index,scan);
				}
			}
		}
	}

	private static <T extends Comparable<? super T>> void swap(T[] data, int index, int scan) {
		 T tmp;
		 tmp = data[index];
		 data[index] = data[scan];
		 data[scan] = tmp;
	}

	public static void main(String[] args) {
      Integer[]  bubbleslist = {1,3,9,14,5,7,81,7,8,21,17};

      bubbleSort(bubbleslist);
      
      for (int  i = 0; i < bubbleslist.length; i++) {
		System.out.print(bubbleslist[i] + " ");
	}
	}

}
