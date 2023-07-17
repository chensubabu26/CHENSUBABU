package temp;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 2, 7, 2, 1, 6, 2};
        int targetElement = 2;

        int count = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetElement) {
                count++;
                if (!found) {
                    System.out.println("Element " + targetElement + " found at index " + i);
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Element " + targetElement + " occurs " + count + " time(s) in the array.");
        } else {
            System.out.println("Element " + targetElement + " is not present in the array.");
        }
    }
}