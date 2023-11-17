import java.util.*;

public class binarySearchRevision {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 12, 8, 10 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array is: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nSorted array is:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nEnter key to search for: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);

        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key found at index : " + index);
        }

        sc.close();
    }
}
