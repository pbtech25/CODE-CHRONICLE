public class countingSort {
    public static void counting_sort(int arr[]) {
        // range
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // count array - counting frequency
        int count[] = new int[largest + 1]; // because we include 0 also
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sort
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        counting_sort(arr);

    }
}
