import java.util.Scanner;

public class linSearHW {
    public static int searchMenu(String menu[], String item){
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(item)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"samosa", "wadapaav", "idli-sambhar", "misal-pav", "noodles", "Bread-Pattice"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the item to search: ");
        String item  = sc.nextLine();

        int index = searchMenu(menu, item);

        if (index == -1) {
            System.out.println("NOT AVAILABLE");
        } else {
            System.out.println("Available at index: " + index);
        }

        sc.close();
    }
}
