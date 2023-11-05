import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        int pali = 0;
        int dig = 0;

        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            dig = n%10;
            pali = (pali * 10) + dig;
            n /= 10;
        }

        System.out.println(pali);
    }
}
