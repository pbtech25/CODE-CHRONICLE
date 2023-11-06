package ARRAYS;
import java.util.*;

public class arrayInput {
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

        marks[2] = 100;
        System.out.println("Updated Maths Marks: " + marks[2]);

        marks[1] = marks[1] +10;
        System.out.println("Increased Chemistry Marks by 10: " + marks[1]);

        //finding percenatges
        float percentage = 0f;

        for (int i = 0; i <=2; i++) {
            percentage += marks[i];
        }
        float per = percentage/3;


        System.out.println("Percentage: " + per/3);

        sc.close();
    }
}
