
public class BagDemo {

	public static void main(String[] args) {
		BagInterface<FoodItem> adtBag = new ShoppingCart<>();
		
		FoodItem[] Food = new FoodItem[10];
		Food[0] = new FoodItem("Organic Happy Eggs, 12 count", 5.98);
		Food[1] = new FoodItem("Greek Pita Flat Bread, White ", 3.44);
		Food[2] = new FoodItem("Hormel Classic Country Style Bacon", 6.98);
		Food[3] = new FoodItem("Great Value 2% Reduced Fat Milk, 1 Gallon", 3.67);
		Food[4] = new FoodItem("Fresh Cravings Roasted Red Pepper Hummus, 10 oz", 3.27);
		Food[5] = new FoodItem("Great Value Deli Style Sliced Muenster Cheese, 12 count", 2.22);
		Food[6] = new FoodItem("Local Hive Raw & Unfiltered Colorado Honey, 16 oz", 8.34);
		Food[7] = new FoodItem("Medium Bagged Avocado, 5 count", 2.98);
		Food[8] = new FoodItem("Fresh Cucumber, 5 pieces", 3.42);
		Food[9] = new FoodItem("Celementines, 3 lbs", 4.34);
		addFoods (adtBag, Food);
	}
	
	private static void addFoods (BagInterface<FoodItem> adtBag, FoodItem[] content) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Adding the following " + content.length + " items to the cart: ");
		System.out.println("----------------------------------------------------------------");
		
		for (int i = 0; i < content.length; i++) {
			if (adtBag.add(content[i]))
				System.out.println(content[i] + " ");
			else
				System.out.println("\nUnable to add " + content[i] + "to the bag.");	
		}
		System.out.println();
		displayBag(adtBag);
	}
	
	private static void displayBag(BagInterface<FoodItem> adtBag) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Your shopping cart now contains:");
		System.out.println("----------------------------------------------------------------");
		Object[] bagArray = adtBag.toArray();
		for (int i = 0; i < bagArray.length; i++) {
			System.out.println("" + (i + 1) + ". " + bagArray[i]);
		}
		System.out.println();
	}
}
