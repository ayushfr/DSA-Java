// Description: Calculate the sum of elements in an array

public class Array_SumElements {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 3, 9};
        int sum = 0;

        // Loop to sum elements
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);
    }
}
