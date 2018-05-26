package learnjava;

//import org.apache.xpath.operations.String;

public class YoshefuCircle {

	public static final int HEADERS = 10;
	public static final int GAP = 3;
	public static void main(String[] args) {
		
		int totalexitnumber = 0;
		
		int counter = 0;
		
		int j = 0;
		
		int[] list = new int[HEADERS];
		
		for (int i= 0;i<list.length;i++){
			 list[i] = i+1;	
		}
		
		for(j = 0; totalexitnumber <=  list.length-1;j++){
			    int index = j%HEADERS;
				if (list[index] != 0){
					counter++;
					if(counter%GAP== 0){
						System.out.println("the loop out person is "+list[index]);
						list[index] = 0;
						totalexitnumber++;
						counter = 0;
							}
					}
			}
	}
}

