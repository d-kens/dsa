import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        // cleaner way - when you know the array elements ahead of time
        int[] values = {40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(values));


        // Testing the array class
        Array test = new Array(3);
        test.insert(2);
        test.insert(30);
        test.insert(1);
        test.insert(20);
        test.insert(19);
        System.out.println(test.indexOf(19));
        test.removeAt(4);
        test.print();


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