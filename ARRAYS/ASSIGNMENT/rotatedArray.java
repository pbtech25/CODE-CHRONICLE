package ASSIGNMENT;

//import java.util.*;

public class rotatedArray {
    public static int findTarget(int arr[], int target) {
        int n = arr.length, start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (start <= arr[mid]) {
                // left sort
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else { // right sort
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, target = 1;

        int index = findTarget(arr, target);

        if (index == -1) {
            System.out.println("Not Found !!");
        } else {
            System.out.println("Target found at index: " + index);
        }

    }
}
