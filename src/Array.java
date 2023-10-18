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

    public void removeAt(int index){
        int lastIndex = count - 1;
        if(index == count) {
            System.out.println("Index out of bounds");
        }

        if(index == lastIndex) {
            count = --count;
        }

        for(int i = index; i < lastIndex; i++) {
            items[i] = items[i++];
        }

    }

    public void print() {
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public int getCount() {
        return count;
    }

}
