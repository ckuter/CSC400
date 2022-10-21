import java.util.Stack;

public class postfixConverter {

	public static int precedenceOf(char ch) {
		switch(ch) {
			case '+' : case '-':
				return 1;
				
			case '*' : case '/':
				return 2;
				
			case '^' :
				return 3;	
				
			default :
				return -1;
		}
	}
	
	public static String convertToPostfix(String infix) {
	//Converts an infix expression to an equivalent postfix expression. 

		Stack<Character> operatorStack = new Stack<Character>();
		String postfix = new String("");

		for (int i = 0; i < infix.length(); i++) { 
			Character nextCharacter = infix.charAt(i);
			
			switch (nextCharacter) { 
				case 'a' : case 'b' : case 'c' : case 'd' : case 'e' : case 'f' : case 'g' : case 'h' :  
					postfix += nextCharacter;
					break;
					
				case '+' : case '-' : case '*' : case '/' : case '^' :
					while (!operatorStack.isEmpty() && precedenceOf(nextCharacter) <= precedenceOf(operatorStack.peek())) {
						postfix += operatorStack.peek();
						operatorStack.pop();
					}
					operatorStack.push(nextCharacter);
					break;
					
				case '(' : 
					operatorStack.push(nextCharacter);
					break;
					
				case ')' : //Stack is not empty if infix expression is valid
					Character topOperator = operatorStack.pop();
					while (topOperator != '(') {
						postfix += topOperator;
						topOperator = operatorStack.pop();
					}
					break;
					
				default: 
					break; //Ignore unexpected characters
			}
		}
		
		while (!operatorStack.isEmpty()) {
			Character topOperator = operatorStack.pop();
			postfix += topOperator;
		}
		
		return postfix;
	}
	
	public static void main(String[] args) {
		String infixA = "a*b/(c-d)";
		String infixB = "(a-b*c)/(d*e*f+g)";
		String infixC = "a/b*(c+(d-e))";
		String infixD = "(a^b*c-d)^e+f^g^h";
		
		System.out.println("Welcome to the Infix to Postfix Converter Program!");
		System.out.println("");
		System.out.println("In this program, we will be converting the following Exercise 7 infix expressions to postfix:");
		System.out.println("1. " + infixA);
		System.out.println("2. " + infixB);
		System.out.println("3. " + infixC);
		System.out.println("4. " + infixD);
		System.out.println("");


		System.out.println("The newly converted postfix expressions are as follows:");
		System.out.println("1. " + convertToPostfix(infixA));
		System.out.println("2. " + convertToPostfix(infixB));
		System.out.println("3. " + convertToPostfix(infixC));
		System.out.println("4. " + convertToPostfix(infixD));
	}

}
