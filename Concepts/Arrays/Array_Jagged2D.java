// Description: Demonstrating jagged 2D arrays (arrays with unequal column sizes)

import java.util.Scanner;

public class Array_Jagged2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[4];

        // Input
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = in.nextInt();
            }
        }

        // Output
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

