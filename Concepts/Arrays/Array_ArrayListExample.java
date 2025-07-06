// Description: Using ArrayList for dynamic arrays

import java.util.ArrayList;
import java.util.Scanner;

public class Array_ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);

        // Input from user
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Output
        System.out.println(list);

        // Access elements
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}

