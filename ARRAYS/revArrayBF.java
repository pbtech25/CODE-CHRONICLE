public class revArrayBF {
    // public static void reverseArrayBruteForce(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n / 2; i++) {
    // int temp = arr[i];
    // arr[i] = arr[n - 1 - i];
    // arr[n - 1 - i] = temp;
    // }
    // }

    // // Driver method to test above
    // public static void main(String args[]) {
    // int[] arr = new int[] { 5, 4, 3, 2, 1 };
    // System.out.println("Original array:");
    // printArray(arr);
    // reverseArrayBruteForce(arr);
    // System.out.println("\nReversed array:");
    // printArray(arr);
    // }

    // /* Utility function to print an array */

    // static void printArray(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n; ++i)
    // System.out.print(arr[i] + " ");
    // System.out.println();
    // }
    // }

    public static void revArrayBruteForce(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        System.out.println("Original array: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println("\nReversed Array: ");
        revArrayBruteForce(arr);

    }

}