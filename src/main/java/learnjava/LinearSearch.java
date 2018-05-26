package learnjava;

public class LinearSearch {
	
	public static <T extends Comparable<? super T>> Boolean 
	linearsearch (T[] data, int  min, int max,T target){

		int index = min;
		
		boolean found = false;

		while(!found && index <= max){

		if (data[index].compareTo(target) == 0){
			found = true;
			}
		 index++;
		}

	  	return found;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer[] forsearch = {2,1,6,9,69,20};
     int minD = 0;
     int maxD = forsearch.length;
     Integer targetD = 69;
     
     Boolean result =  LinearSearch.linearsearch(forsearch, minD, maxD, targetD);
     
     System.out.println("the match result is:" + result);
     
	}

}
