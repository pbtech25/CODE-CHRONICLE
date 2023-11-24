public class selectionSort {
    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 3, 4 };

        selection_sort(arr);
    }
}