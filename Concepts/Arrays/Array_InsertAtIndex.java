// Description: Insert an element at a specific index in an array

import java.util.Arrays;

public class Array_InsertAtIndex {
    public static void main(String[] args) {
        int[] original = {1, 2, 4, 5};
        int insertElement = 3;
        int position = 2;

        // Create a new array with one extra space
        int[] updated = new int[original.length + 1];

        for (int i = 0, j = 0; i < updated.length; i++) {
            if (i == position) {
                updated[i] = insertElement;
            } else {
                updated[i] = original[j++];
            }
        }

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Updated array:  " + Arrays.toString(updated));
    }
}
