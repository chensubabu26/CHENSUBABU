package temp;

import java.util.Scanner;

public class ArrayElementLocation {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 1};

        System.out.println("Original Array: ");
        displayArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int target = scanner.nextInt();

        int index = findElementLocation(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findElementLocation(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
