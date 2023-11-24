public class insertionSort {
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 4 };

        insertion_sort(arr);
    }
}
