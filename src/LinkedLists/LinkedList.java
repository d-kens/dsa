package LinkedLists;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        // Node object should always store a value
        public Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node first;
    private Node last;


    public void addFirst(int item) {
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    // deleteFirst
    // deleteLast
    // contains
    // indexOf

}
