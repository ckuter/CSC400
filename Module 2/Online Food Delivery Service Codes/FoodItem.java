
public class FoodItem {
	private String name;
	private double price;
	
	//constructor class for the object
	public FoodItem (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "$" + this.price + " - " + this.name;
	}
}
