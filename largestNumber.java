import java.util.*;

public class largestNumber {
    public static int largest_Number(int num[]){
        int smallest = Integer.MIN_VALUE;
        int largest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > smallest) {
                smallest = num[i];
                //smallest = largest;
            }

            if (num[i] < largest) {
                largest = num[i];
            }
        }
        System.out.println("The smallest number is: " + largest);
        return smallest;
        
    }
    public static void main(String[] args) {
        int num[] = {1,2,26,3,45, 0, -12, 9};

        //int largest = largest_Number(num);

        System.out.println("The largest number is: " + largest_Number(num));
    }
}
