package structure.chapter9;

public class Quicksort{

    public static <T extends Comparable<? super T>> void quickSort(T[] data){
        sortFunction(data,0,data.length-1);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
    }

    public static <T extends  Comparable<? super T>> void sortFunction(T[] data,int min,int max){
        if (min < max){
            int partitionindex = getPartition(data,min,max);
            sortFunction(data,min,partitionindex-1);
            sortFunction(data,partitionindex+1,max);
        }
    }

    private static <T extends  Comparable<? super T>> int getPartition(T[] data, int min, int max) {
        int middle = (min + max)/2;
        T index = data[middle];
        swap(data,middle,min);

        int left = min;
        int right = max;

        while (left < right ){
           while (left < right && data[left].compareTo(index) <= 0)
               left ++;
           while (data[right].compareTo(index) >0)
               right --;
           if (left < right)
               swap(data,left,right);
        }

        swap(data,min,right);
        return right;
    }

    private static <T extends  Comparable<? super T>> void swap(T[] data, int left, int right) {
        T tmp = data[left];
        data[left] = data[right];
        data[right] = tmp;
    }

    public static void main(String[] args) {
        Integer[] quicksortlist = {1,4,5,3,2,9,7,21,15};
        quickSort(quicksortlist);
    }
}