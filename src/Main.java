import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
        test.insert(10);
        test.insert(20);
        test.insert(30);
        test.insert(70);
        test.insert(100);
        test.print();
    }
}