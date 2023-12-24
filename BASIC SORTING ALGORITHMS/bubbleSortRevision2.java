public class bubbleSortRevision2 {
    public static void bubbleSort(int array[]) {
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 4, 66, 34, 22, 11, 0, 10, 67 };

        bubbleSort(array);
    }
}