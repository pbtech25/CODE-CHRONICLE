import java.util.Arrays; //also can import java.util.*;

public class insertionSortRevision1 {
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 3, 2 };

        // insertion_sort(arr);

        Arrays.sort(arr);
        System.out.println("Arry sorted by Arrays.sort() : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}