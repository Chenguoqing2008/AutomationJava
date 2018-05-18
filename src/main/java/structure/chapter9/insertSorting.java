package structure.chapter9;

public class insertSorting{
  public static <T extends Comparable<? super T>> void sorting(T[] data){
      for (int index = 1; index < data.length; index++) {
          T key = data[index];
          int position = index;

          while (position > 0 && key.compareTo(data[position -1]) < 0){
              data[position] = data[position-1];
              position--;
          }
          data[position] = key;
      }
  }

    public static void main(String[] args) {
        Integer[] sortinglist = {1,4,3,2,7,5,11};
        sorting(sortinglist);
        for (int i = 0; i <sortinglist.length ; i++) {

            System.out.println("The sorted list is: " + sortinglist[i]);
        }
    }

}