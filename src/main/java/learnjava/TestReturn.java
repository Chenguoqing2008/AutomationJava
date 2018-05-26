package learnjava;

public class TestReturn extends EscapeUsage {

//	@Override
//	public int getStates(){
//		
//		
//	}
	public static void main(String[] args) {
		EscapeUsage escapeUsage = new EscapeUsage();
		int test1 = escapeUsage.states;
		test1 = 13;
		System.out.println("test result is: " + test1);
		EscapeUsage test2 = escapeUsage.returnNew();
		int test3 = test2.states;
		System.out.println("the second time result is: " + test3);
	}

}
