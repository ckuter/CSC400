import java.util.Arrays;

public class recursiveArray {
	
	public static void reverseArray(int arr[], int first, int last) {
		if (last < first) {
			return;
		}
		else {
			System.out.print(arr[last] + " ");
			reverseArray(arr, first, last-1);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4 , 5, 6};
		System.out.print("These are the integers found between indexes 1 to 3 of the array: ");
		reverseArray(arr, 1, 3);
		System.out.println();
		System.out.println("Note: the integers are displayed in reverse order.");
	}

}
