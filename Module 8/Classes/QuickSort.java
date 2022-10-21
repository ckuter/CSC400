
public class QuickSort {
	public static int partition (Customer arr[], int left, int right, String type) {
		Customer pivot = arr[right];
		int i = (left - 1);
		for (int j = left; j < right; j++) {
			if (type.equals("orderNo")) {
				if (arr[j].getOrderNumber() >= pivot.getOrderNumber()) {
					i++;
					
					Customer temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			else if(type.equals("customerName")) {
				if (arr[j].getName().compareTo(pivot.getName())>=0) {
					i++;
	
					Customer temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		Customer temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		
		return i+1;
	}
	
	public static void sort(Customer arr[], int left, int right, String type) {
		if (left < right) {
			int pi = partition(arr, left, right, type);
			sort(arr, left, pi-1, type);
			sort(arr, pi+1, right, type);
		}
	}

}
