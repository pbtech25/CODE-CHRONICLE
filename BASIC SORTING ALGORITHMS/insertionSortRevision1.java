import java.util.Arrays; //also can import java.util.*;
import java.util.Collections;

public class insertionSortRevision1 {
    public static void insertion_sort(Integer arr[]) {
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
        Integer arr[] = { 5, 1, 4, 3, 2 };

        // insertion_sort(arr);

        // Arrays.sort(arr);
        // System.out.println("Array sorted by Arrays.sort() : ");
        // for (int k : arr) {
        // System.out.print(k + " ");
        // }

        // Arrays.sort(arr, 0, 3); // sorting array from index 0 -> 2 ; written 3
        // because toIndex is not inclusive
        // System.out.println("Array sorted by Arrays.sort(arr, fromIndex, toIndex) :
        // ");
        // for (int k : arr) {
        // System.out.print(k + " ");
        // }

        Arrays.sort(arr, Collections.reverseOrder()); // reverseOrder() works only on Objects
        System.out.println("Array sorted by Arrays.sort(arr, Collections.reverseOrder()) : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}