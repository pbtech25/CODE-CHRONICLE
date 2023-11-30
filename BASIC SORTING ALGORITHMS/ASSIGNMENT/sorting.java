package ASSIGNMENT;

public class sorting {
    public static void bubble_sort(int arr[]) {

        // turn 0 -> n-2
        for (int turn = 0; turn < arr.length - 1; turn++) {
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

    public static void selection_sort(int arr[]) {
        // outer loop 0 -> n-2
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // inner loop for minIndex in unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void count_sort(int arr[]) {
        // find range
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // count frequency
        int count[] = new int[max + 1];
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
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // System.out.println("Bubble sorting: ");
        // bubble_sort(arr);

        // System.out.println("selection sorting: ");
        // selection_sort(arr);

        // System.out.println("insertion sorting: ");
        // insertion_sort(arr);

        System.out.println("count sorting: ");
        count_sort(arr);
    }
}
