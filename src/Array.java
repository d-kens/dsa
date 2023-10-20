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
        /*
            Solution
             - Validate the index, make sure it is within the right range
             - Shift the items to the left to fill the hole
             - Decrement count by one
         */

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
    public int getCount() {
        return count;
    }

}
