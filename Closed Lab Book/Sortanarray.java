package temp;

import java.util.Arrays;
import java.util.Scanner;

public class Sortanarray {
	    public static void main(String[] args) {
	        int[] arr = {5, 8, 2, 4, 1};

	        System.out.println("Original Array: " + Arrays.toString(arr));

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter 'asc' for ascending or 'desc' for descending order: ");
	        String order = scanner.nextLine();

	        if (order.equalsIgnoreCase("asc")) {
	            sortAscending(arr);
	            System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));
	        } else if (order.equalsIgnoreCase("desc")) {
	            sortDescending(arr);
	            System.out.println("Array sorted in descending order: " + Arrays.toString(arr));
	        } else {
	            System.out.println("Invalid order specified. Please try again.");
	        }

	        scanner.close();
	    }

	    public static void sortAscending(int[] arr) {
	        Arrays.sort(arr);
	    }

	    public static void sortDescending(int[] arr) {
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }
	    }
}
