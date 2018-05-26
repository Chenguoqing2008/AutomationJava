package learnjava;


import org.junit.jupiter.api.Test;

public class TestOperator {
	
	@Test
	public void testOperator(){
		
		int a = 3;
		int b = 5;
		
		int c = b/a;
		
		System.out.println(c);
		
		if (c > 0 && b > 10){
			
			System.out.println("your are right");
		}
		
	}

}
