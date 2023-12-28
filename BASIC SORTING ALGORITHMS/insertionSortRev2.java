public class insertionSortRev2 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion_Sort(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                // swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        // print
        print(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 78, 10, -5, 9 };

        insertion_Sort(arr);
    }
}
