public class bubbleSortRevision {
    public static void bubble_sort(int arr[]) {
        int n = arr.length;

        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 4 };

        bubble_sort(arr);
    }
}