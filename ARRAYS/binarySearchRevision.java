import java.util.*;

public class binarySearchRevision {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 12, 8, 10 };

        System.out.println("Input array is: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nSorted array is:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
