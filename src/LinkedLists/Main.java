package LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // a list of strings
        LinkedList<String> stringList = new LinkedList();
        stringList.add("Have a good day!!");
        stringList.add("Awesome");
        stringList.add("Programmer");
        stringList.add("This is a random string");
        System.out.println(stringList);

        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addFirst(100);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);
        System.out.println(numbers);
        numbers.remove(); // removes from the front of the list
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.contains(20));
    }
}
