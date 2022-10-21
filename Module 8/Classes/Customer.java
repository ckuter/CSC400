
public class Customer {
	private String name;
	private int orderNumber;
	private double totalCost;
	
	public Customer (String name, int orderNumber, double totalCost) {
		super();
		this.name = name;
		this.orderNumber = orderNumber;
		this.totalCost = totalCost;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public double getTotalCost() {
		return totalCost;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public String toString() {
		return name + ", Order #" + orderNumber + ", Cost: $" + totalCost;
	}

}
