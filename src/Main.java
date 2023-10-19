import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        // ArrayList class
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.remove(0);
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(50));
        System.out.println(list.contains(10));
        System.out.println(list.size());
        list.toArray(); // converts the ArrayList to a regular array object
        System.out.println(list);


        /*
            1. pre-increment: ++index - This operator increments the value of the index by 1 before using its current value in an expression/assignment.
                int index = 5;
                int result = ++index; // result will be 6

            2. post-increment - This operator uses the current value of the index in an expression or assignment and then increments it by 1.
                int index = 5;
                int result = index++; // result will be 5

         */
    }
}