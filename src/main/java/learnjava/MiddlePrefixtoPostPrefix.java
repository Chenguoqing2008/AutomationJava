package learnjava;

import java.util.Scanner;
import java.util.Stack;

//import com.opera.core.systems.scope.protos.SelftestProtos.SelftestResult.Result;
//MUL(1),DIV(2), ADD(3),SUB(4);

public class MiddlePrefixtoPostPrefix {

	String expression;
	private final static char MUL = '*';
	private final static char DIV = '/';
	private final static char ADD = '+';
	private final static char SUB = '-';
	
	public void printPostPrefix(){
		
		System.out.println("Please input the middle prefix expression: ");
		Scanner scanner = new Scanner(System.in);
		expression = scanner.nextLine();
		OutputPostPrefix(expression);
	}
	
	public void OutputPostPrefix(String expression){
		
		Stack<String> stack = new Stack<>();
		String token;
		Scanner in = new Scanner(expression);

		
		while (in.hasNext()) {
			token = in.next();
			if (isOperator(token)){
				
				if(stack.isEmpty()){stack.push(token);}
				else{
					String stackin = stack.peek();
//					int operator = getMapping(token.charAt(0));
					int stackitem = getMapping(stackin.charAt(0));
//					System.out.print("stackitem is "+stackitem);
					int tokenrank = getMapping(token.charAt(0));
//					System.out.print("tokenrank is "+tokenrank);
					if (stackitem > tokenrank){
						stack.push(token);
					}else{
						String popout = stack.pop();
						System.out.print(token+' ');
					}
				}
				
			}
			else{
				
				System.out.print(token+' ');
			}
			
		}
		
	}
	
	//MUL(1),DIV(2), ADD(3),SUB(4);
	private int getMapping(char token){
		
		int result = 0;
		
		switch(token){
			
			case '+':
				result = 1;
				break;
			case '-':
				result = 2;
				break;
			case '*':
				result = 3;
				break;
			case '/':
				result = 4;
				break;
		}
		
		return result;
	}
	
	private boolean isOperator(String token){
		
		return (token.equals("+")||token.equals("-")||
				token.equals("*")||token.equals("/"));
	}
	
	public static void main(String[] args){
		
		MiddlePrefixtoPostPrefix middlePrefixtoPostPrefix = new MiddlePrefixtoPostPrefix();
		middlePrefixtoPostPrefix.printPostPrefix();
		
	}
}
