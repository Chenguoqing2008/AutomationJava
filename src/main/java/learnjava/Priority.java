package learnjava;

public enum Priority {

	MUL(4),DIV(3), ADD(2),SUB(1);
	
	private int rank = 0;
	
	Priority(int rank){
		
		this.rank = rank;
	}
	
	int getRank(){return rank;};
	
//	public static void main(String[] args){
//		
//		for (Priority p:Priority.values()) {
//			System.out.println("value is :"+ p.getRank());
//		}
//	}
}
