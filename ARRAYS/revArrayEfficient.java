
public class revArrayEfficient {
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap the elements at start and end of array
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            // move towards center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Original array:");

        for (int k : arr) {
            System.out.print(k + " ");
        }

        reverseArray(arr);

        System.out.println("\nReversed array:");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
