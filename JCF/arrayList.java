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
        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // System.out.println(list);

        // // list.clear(); // it will remove all elements from the list
        // System.out.println(list);

        // list.set(2, 31); // set value at index 2 to 31
        // System.out.println(list);

        // System.out.println(list.contains(40)); // returns true if contains 40
        // otherwise false

        // ------------------------------DAY 04-------------------------

        /*
         * // Iterator
         * 
         * List<String> cars = new ArrayList<>();
         * 
         * cars.add("Tata");
         * cars.add("Volkswagon");
         * cars.add("Porche");
         * cars.add("BMW");
         * 
         * Iterator<String> it = cars.iterator();
         * 
         * System.out.println(it.next() + "\n"); // prints first item
         * 
         * while (it.hasNext()) { // .hasNext() checks whether there is next element
         * available or not
         * System.out.println(it.next()); // prints all items
         * }
         * 
         */

        /*
         * List<Integer> list = new ArrayList<>();
         * 
         * list.add(10);
         * list.add(20);
         * list.add(30);
         * list.add(40);
         * list.add(50);
         * list.add(60);
         * list.add(70);
         * list.add(80);
         * 
         * // for loop
         * for (int i = 0; i < list.size(); i++) {
         * System.out.println("for elements " + list.get(i) + " ");
         * }
         * 
         * // foreach
         * for (int i : list) {
         * System.out.println("foreach elements " + i + " ");
         * }
         * 
         * // using Iterator
         * Iterator<Integer> it = list.iterator();
         * 
         * while (it.hasNext()) {
         * System.out.println("iterator elements " + it.next());
         * }
         */

    }
}