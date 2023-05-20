public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public void insertLeft(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void concatenate(CircularLinkedList other) {
        if (other.size == 0) return;
        if (size == 0) {
            head = other.head;
            tail = other.tail;
            size = other.size;
            return;
        }
        tail.next = other.head;
        tail = other.tail;
        tail.next = head;
        size += other.size;
    }

    public CircularLinkedList interleave(CircularLinkedList other) {
        CircularLinkedList result = new CircularLinkedList();
        Node current1 = this.head;
        Node current2 = other.head;

        while (current1 != null || current2 != null) {
            if (current1 != null && current2 != null) {
                if (current1.data < current2.data) {
                    result.insertLeft(current1.data);
                    current1 = current1.next == this.head ? null : current1.next;
                } else {
                    result.insertLeft(current2.data);
                    current2 = current2.next == other.head ? null : current2.next;
                }
            } else if (current1 != null) {
                result.insertLeft(current1.data);
                current1 = current1.next == this.head ? null : current1.next;
            } else {
                result.insertLeft(current2.data);
                current2 = current2.next == other.head ? null : current2.next;
            }
        }
        return result;
    }

    public CircularLinkedList copy() {
        CircularLinkedList result = new CircularLinkedList();
        Node current = head;

        while (current != null) {
            result.insertLeft(current.data);
            current = current.next == head ? null : current.next;
        }
        return result;
    }
}
