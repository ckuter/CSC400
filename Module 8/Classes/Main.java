import java.util.Scanner;

public class Main {

	public static Scanner scanme = new Scanner(System.in);
		
	public static void menu() {
		System.out.println("Please select one of the options below:");
		System.out.println("1. Add an order to the queue");
		System.out.println("2. Remove an order from the queue");
		System.out.println("3. Exit");
	}
		
	public static int input() {
		int n = 0;
		
		while (true) {
			System.out.println("");
			System.out.print("Your choice: ");
			try {
				n = Integer.parseInt(scanme.nextLine());
				if (n >= 1 && n <= 3) {
					break;
				}
				System.out.println("Invalid input! Please try again.");				
			} catch (Exception e) {
				System.out.println("Invalid input! Please try again.");
			}
		}
		return n;
	}
	
	public static Customer inputCustomer() {
		String name;
		int num;
		double cost;
		
		System.out.print("Enter customer name: ");
		name = scanme.nextLine();
		
		System.out.print("Enter order number: ");
		num = Integer.parseInt(scanme.nextLine());
		
		System.out.print("Enter total order cost: ");
		cost = Double.parseDouble(scanme.nextLine());
		
		Customer cust = new Customer(name,num,cost);
		return cust;
	}
	
	public static void run(Order order, Display display) {
		int ch = 0;
		while(true) {
			menu();
			ch = input();
			if (ch==1) {
				Customer cust = inputCustomer();
				order.addOrder(cust, display);
			}
			else if (ch==2) {
				order.removeOrder(display);
			}
			else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Order order = new Order();
		Display display = new Display();
		System.out.println("Welcome to our online retailer's order list handler. ");
		System.out.println("What would you like to do?");
		System.out.println("");
		run(order, display);
	}

}
