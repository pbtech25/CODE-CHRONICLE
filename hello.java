import java.util.Scanner;

public class hello {
    public static void main(String shardul[]) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your full name: ");

        String name  = sc.nextLine();
        System.out.println(name);

        sc.close();
    }
} 