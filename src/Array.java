import UsingArrays.GameEntry;

import java.lang.management.ManagementFactory;

public class Array {
    private int[] items;
    private int count; // keeps track of the actual length of the array
    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if(items.length == count) {
            int[] newItems = new int[count * 2];

            for(int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        items[count++] = item;

    }

    public void removeAt(int index) throws IllegalAccessException {
        if(index < 0 || index >= count)
            throw new IllegalAccessException();

        for(int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }


    public int indexOf(int item) {
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;

        return -1;
    }

    public void print() {
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}

/**
 * Implementation of the ArrayClass using the Generic Framework
 * Because it doesn't matter what type of element we store in the array.
 */
