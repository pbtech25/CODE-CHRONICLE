public class kadanesAlgo {
    public static int negative_kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxSum = Math.max(maxSum, arr[i]);
        }
        return maxSum;
    }

    public static int kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr[] = { -1, -2, -3, -4 };
        int result = 0, max_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result = -1;
            } else {
                result = 1;
            }
        }

        if (result == 1) {
            System.out.println("The array contains all negative numbers");
            max_sum = negative_kadanes(arr);
        } else {
            max_sum = kadanes(arr);
        }

        System.out.println("Maximum SubArray Sum is: " + max_sum);
    }
}