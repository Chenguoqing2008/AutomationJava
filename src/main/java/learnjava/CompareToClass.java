package learnjava;

public class CompareToClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer small = new Integer(10);
		Integer big = new Integer(20);
		
		if (small.compareTo(big) > 0)
			System.err.println("small is big");
		else {
			System.err.println("big is big");
		}
		
	}

}
