
import java.util.*;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];

        System.out.println("Enter marks of Physics, Chmeistry and Maths respectively: ");
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        
        //finding percenatges
        float percenatge = ((marks[0] + marks[1] + marks[2])/3);

        System.out.println("Length of array:" + marks.length);


        System.out.println("Percentage: " + percenatge);

        marks[2] = 100;
        System.out.println("Updated Maths Marks: " + marks[2]);

        marks[1] = marks[1] +10;
        System.out.println("Increased Chemistry Marks by 10: " + marks[1]);


        sc.close();
    }
}
