import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        // ArrayList<String> studName = new ArrayList<>();
        // studName.add("Rakesh");
        // studName.add("Umesh");
        // studName.add("Himesh");
        // studName.add("Ritesh");
        // System.out.println(studName); // [Rakesh]

        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // System.out.println(list);

        // list.add(50);
        // System.out.println(list); // .add() only adds at last

        // // adding at any particular position
        // list.add(1, 11);
        // System.out.println(list); // .add() only adds at last

        // // adding newList in list
        // List<Integer> newList = new ArrayList<>();
        // newList.add(11);
        // newList.add(21);
        // newList.add(31);
        // newList.add(41);
        // newList.add(51);
        // System.out.println(newList);

        // list.addAll(newList);
        // System.out.println(list);

        // System.out.println(list.get(2));

        // -------------------DAY 2------------------------------------------

        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // System.out.println(list);

        // list.remove(2); // removed element from index 2 i.e. 30
        // System.out.println(list);

        // list.remove(Integer.valueOf(10));
        // System.out.println(list);

        // -------------------DAY 03------------------------------------------
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // list.clear(); // it will remove all elements from the list
        System.out.println(list);

        list.set(2, 31); // set value at index 2 to 31
        System.out.println(list);

        System.out.println(list.contains(40)); // returns true if contains 40 otherwise false

    }
}