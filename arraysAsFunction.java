import java.util.*;

public class arraysAsFunction {

    public static void update(int marks[], int nonChangeable){
        nonChangeable = 12344;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};  //Arrays are called by reference
        int nonChangeable = 5; //called by value, hence are not changed in main function
        
        update(marks, nonChangeable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
            
        }
        System.out.println();
        System.out.println(nonChangeable);
    }
}
