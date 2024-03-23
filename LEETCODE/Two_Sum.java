package LEETCODE;

import java.util.Map;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        Map<Integer, String> phonebook = new HashMap<>();

        phonebook.put(123, "Alice");
        phonebook.put(456, "Bob");
        phonebook.put(789, "Tim");
        System.out.println(phonebook.get(123));
    }
}
