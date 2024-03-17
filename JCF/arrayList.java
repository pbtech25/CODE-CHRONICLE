import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> studName = new ArrayList<>();
        studName.add("Rakesh");
        studName.add("Umesh");
        studName.add("Himesh");
        studName.add("Ritesh");
        System.out.println(studName); // [Rakesh]

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(50);
        System.out.println(list); // .add() only adds at last

        // adding at any particular position
        list.add(1, 11);
        System.out.println(list); // .add() only adds at last

        // adding newList in list
        List<Integer> newList = new ArrayList<>();
        newList.add(11);
        newList.add(21);
        newList.add(31);
        newList.add(41);
        newList.add(51);
        System.out.println(newList);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2));

    }
}
