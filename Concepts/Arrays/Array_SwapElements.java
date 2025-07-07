// Description: Swap two elements in an array

import java.util.Arrays;

public class Array_SwapElements {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        System.out.println("Before Swap: " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("After Swap:  " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
