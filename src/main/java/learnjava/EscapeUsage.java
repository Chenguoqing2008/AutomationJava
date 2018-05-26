package learnjava;

class EscapeUsage {

	public static final int states = 10;

	// states = 13;
	// private final String[] states = new String[] {"AK", "AL" };
	public final int getStates() {
		return states;
	}
	
	public String toString() {
		return "given";
	}
	
	public EscapeUsage returnNew(){
		
		return new EscapeUsage();
	} 

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		EscapeUsage t = new EscapeUsage();
//		int str = t.getStates();
//		str = 13;
//		System.out.println("String is: " + str);
//		// t.states = 12;
		// str[0] = "a";
		// t.getStates()[0] = "b";
		// for (int i = 0; i < t.getStates().length; i++) {
		//
		// System.out.println("string is: " + t.getStates()[i]);
		//
		// }
		//
		// EscapeUsage t2 = new EscapeUsage();
		// String[] str2 = t2.getStates();
		// // str[0] = "a";
		// // t.getStates()[0] = "b";
		// for (int i = 0; i < str2.length; i++) {
		//
		// System.out.println("string is: " + str2[i]);
		//
		// }
//	}

}



