public class countSortRev2 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void count_sort(int arr[]) {
        // range
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // count arr
        int count[] = new int[largest + 1];
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
        print(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        count_sort(arr);
    }
}