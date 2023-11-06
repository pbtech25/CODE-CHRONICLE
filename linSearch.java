import java.util.*;

public class linSearch {
    
    public static int linearSearch(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) { //we can also change the name of args 
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key found at : " + (index+1));
        }

        sc.close();

    }
}
