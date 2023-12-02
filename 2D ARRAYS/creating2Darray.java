import java.util.*;

public class creating2Darray {
    public static int largest_element(int matrix[][]) {
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

    public static int smallest_element(int matrix[][]) {
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

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at (" + i + ", " + j + ")");
                    return true;
                }
                ;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // SEARCHING ELEMENT
        search(matrix, 5);

        // SMALLEST ELEMENT
        System.out.println("Smallest element is: " + smallest_element(matrix));

        // LARGEST ELEMENT
        System.out.println("Largest element is: " + largest_element(matrix));

        sc.close();
    }
}