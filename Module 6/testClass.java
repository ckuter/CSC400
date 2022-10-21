import java.util.Arrays;
import java.util.Random;

public class testClass {

	public static void main(String[] args) {
		int arr[] = new int[15];
		Random r = new Random();
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = r.nextInt(Integer.MAX_VALUE);
		}
		
		System.out.println("Here is the array before any modifications are made: ");
		
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Checking if the array is sorted... one second...");
		System.out.println("The array has been sorted: " + checkArray(arr));
		System.out.println("Fear not, for the array will now be sorted.");
		
		Arrays.sort(arr);
		System.out.println("");
		System.out.println("Here is the updated array: ");
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Checking if the array is been sorted... one second...");
		System.out.println("The array has been sorted: " + checkArray(arr));
	}
	
	public static boolean checkArray (int arr[]) {
		for (int i=1; i < arr.length; i++) {
			if (arr[i]<arr[i-1]) 
				return false;
		}
		return true;
	}
}
