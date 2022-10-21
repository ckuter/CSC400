import java.util.Scanner;

public class findFactorial {
	public static int recursiveFactorialA(int n) {
		if (n==0) {
			return 1; 
		}
		return(n*(recursiveFactorialA(n-1)));
	}
	
	public static int recursiveFactorialB(int n) {
		if (n==1) {
			return 1;
		}
		return(n*(recursiveFactorialB(n-1)));
	}
	
	public static void main(String[] args) {
		try (Scanner theDude = new Scanner(System.in)) {
			System.out.println("What integer would you like to find the factorial for?");
			System.out.println();
			System.out.print("Enter integer here: ");
			int n = theDude.nextInt(); theDude.nextLine();
			System.out.println();
			System.out.println("Method 1: The factorial of " + n + " is " + recursiveFactorialA(n) + ".");
			System.out.println("Method 2: The factorial of " + n + " is " + recursiveFactorialB(n) + ".");
		}		
	}
}

