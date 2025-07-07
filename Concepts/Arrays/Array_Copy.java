// Description: Create a copy of an array manually

import java.util.Arrays;

public class Array_Copy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40};
        int[] copy = new int[original.length];

        // Copy elements one by one
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Copied array:   " + Arrays.toString(copy));
    }
}
