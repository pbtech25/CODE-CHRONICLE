import java.util.*;

public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        System.out.println("Enter marks of Physics, Chmeistry and Maths respectively: ");
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
    }
}
