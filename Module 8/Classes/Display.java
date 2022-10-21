
public class Display {
	private Customer arrByName[];
	private Customer arrByOrder[];
	private int size;
	private int currentSize;
	
	private void resize() {
		int size = arrByName.length * 2;
		Customer[] arr = new Customer[size];
		for (int i = 0; i < arrByName.length; i++)
			arr[i] = arrByName[i];
		arrByName = arr;
		
		size = arrByOrder.length * 2;
		arr = new Customer[size];
		for (int i = 0; i < arrByOrder.length; i++)
			arr[i] = arrByOrder[i];
		arrByOrder = arr;
		
		this.size = size;
		currentSize = 0;
	}
	
	public Display() {
		this.size = 10;
		arrByName = new Customer[size];
		arrByOrder = new Customer[size];
	}
	
	public void insertOrder(Customer cust) {
		if (currentSize == size) {
			resize();
		}
		
		arrByName[currentSize] = cust;
		arrByOrder[currentSize] = cust;
		
		currentSize += 1;
		
		QuickSort.sort(arrByName, 0, currentSize-1, "customerName");
		QuickSort.sort(arrByOrder, 0, currentSize-1, "orderNo");
		print();
	}
	
	public void removeOrder(Customer cust) {
		int i;
		for (i = 0; i < currentSize; i++) {
			if(cust == arrByName[i]) {
				for (int k = i; k < currentSize-1; k++) {
					arrByName[k] = arrByName[k+1];
				}
				
			}
		}
		
		for (i = 0; i < currentSize; i++) {
			if (cust == arrByOrder[i]) {
				for(int k = i; k < currentSize-1; k++) {
					arrByOrder[k] = arrByOrder[k+1];
				}
			}
		}
		
		
		arrByName[currentSize-1] = null;
		arrByOrder[currentSize-1] = null;
		currentSize -= 1;
		QuickSort.sort(arrByName, 0, currentSize-1, "customerName");
		QuickSort.sort(arrByOrder, 0, currentSize-1, "orderNo");
		print();
	}
	
	public void print() {
		
		System.out.println();
		System.out.println("Here is the queue sorted by the customer's name: ");
		System.out.println("------------------------------------------------------");
		print(arrByName);
		
		System.out.println("Here is the queue sorted by the customer's order #:");
		System.out.println("------------------------------------------------------");
		print(arrByOrder);
		
		System.out.println();
	}
	
	public void print(Customer[] arr) {
		for(int i=0;i<currentSize;i++)
			System.out.println(arr[i]);
		System.out.println();
	}

}
