package learnjava;

public class Triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int init = 9;
		
		// print the up side of the triangular
		//the first loop is to control the total lines
		for (int s = 0; s <= init; s++) {
			
			// the second loop is to control the  "  "
			for (int i = init - s ; i >0; i--) {
				System.out.print(" ");
			}
				// the third loop is to control the  "*" symbol
				for (int j = 0; j < 2*s+1 ; j++) {
					//System.out.print("*");
					for (int numberleft = s ; numberleft > 0; numberleft--) {
						System.out.println(" "+ numberleft);
					}
					for (int numberright = 1; numberright < s ; numberright++) {
						System.out.println(" " + numberright);
					}
				}
			
				System.out.println();
				System.out.println();
		}

		}
		

	}