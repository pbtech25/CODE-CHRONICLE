public class bubbleSortRevision1 {
    public static void bubble_sort(int arr[]) {
        // turns loop (0 -> n-2)
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // inner comparison loop (from 0 -> n-turn-1)
            for (int j = 0; j < arr.length - turn - 1; j++) {
                // swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 23, 89, 47, 6 };

        bubble_sort(arr);
    }
}
