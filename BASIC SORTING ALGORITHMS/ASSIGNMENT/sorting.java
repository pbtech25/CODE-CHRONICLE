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

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void insertion_sort(int arr[]) {

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void count_sort(int arr[]) {

        // print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        System.out.println("Bubble sorting: ");
        bubble_sort(arr);

        // System.out.println("selection sorting: ");
        // selection_sort(arr);

        // System.out.println("insertion sorting: ");
        // insertion_sort(arr);

        // System.out.println("count sorting: ");
        // count_sort(arr);
    }
}
