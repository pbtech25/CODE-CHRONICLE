import java.util.*;

public class largeAndSmallInMatrix {
    public static int largest_in_matrix(int matrix[][]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallest_in_matrix(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Largest element in matrix is: " + largest_in_matrix(matrix));
        System.out.println("Smallest element in matrix is: " + smallest_in_matrix(matrix));

        sc.close();
    }
}
