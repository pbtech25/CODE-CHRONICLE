import java.util.*;

public class largestNumber {
    public static int largest_Number(int num[]){
        int smallest = Integer.MIN_VALUE;
        int largest = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > smallest) {
                largest = num[i];
                smallest = largest;
            }
        }
        
        return largest;
        
    }
    public static void main(String[] args) {
        int num[] = {1,2,26,3,45, 0, -12, 9};

        int largest = largest_Number(num);

        System.out.println("The largest number is: " + largest);
    }
}
