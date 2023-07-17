package temp;

import java.util.Arrays;


public class Resizeanarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int newSize = 8;
        arr = resizeArray(arr, newSize);

        System.out.println("Resized Array: " + Arrays.toString(arr));
    }

    public static int[] resizeArray(int[] arr, int newSize) {
        int[] resizedArray = new int[newSize];
        int length = Math.min(arr.length, newSize);

        // Copy elements from the original array to the resized array
        System.arraycopy(arr, 0, resizedArray, 0, length);

        return resizedArray;
    }
}
