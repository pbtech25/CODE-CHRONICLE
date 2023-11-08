import java.util.*;

public class binSearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = ((start + end) / 2);

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 12, 8, 10 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();

        Arrays.sort(arr); // sorts the array(pre-requiste for binary serach)

        /*
         * ----alternate method to output array--------
         * 
         * for (int k : arr) {
         * System.out.print(k + " ");
         * }
         */

        int index = binarySearch(arr, key);

        if (index == -1) {
            System.out.println("Key NOT FOUND");
        } else {
            System.out.println("Key is a index : " + index);
        }

        sc.close();
    }
}
