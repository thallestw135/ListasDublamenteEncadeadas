public class CircularLinkedListWithHead {
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

    public CircularLinkedListWithHead() {
        head = new Node(0);
        tail = head;
        head.next = tail;
    }

    public int size() {
        return size;
    }

    public void insertLeft(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            newNode.next = head;
            head.next = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
        size++;
    }

    public void concatenate(CircularLinkedListWithHead other) {
        if (other.size == 0) return;
        if (size == 0) {
            head.next = other.head.next;
            tail = other.tail;
            size = other.size;
            return;
        }
        tail.next = other.head.next;
        tail = other.tail;
        tail.next = head;
        size += other.size;
    }

    public CircularLinkedListWithHead interleave(CircularLinkedListWithHead other) {
        CircularLinkedListWithHead result = new CircularLinkedListWithHead();
        Node current1 = this.head.next;
        Node current2 = other.head.next;

        while (current1 != this.head || current2 != other.head) {
            if (current1 != this.head && current2 != other.head) {
                if (current1.data < current2.data) {
                    result.insertLeft(current1.data);
                    current1 = current1.next == this.head ? this.head : current1.next;
                } else {
                    result.insertLeft(current2.data);
                    current2 = current2.next == other.head ? other.head : current2.next;
                }
            } else if (current1 != this.head) {
                result.insertLeft(current1.data);
                current1 = current1.next == this.head ? this.head : current1.next;
            } else {
                result.insertLeft(current2.data);
                current2 = current2.next == other.head ? other.head : current2.next;
            }
        }
        return result;
    }

    public CircularLinkedListWithHead copy() {
        CircularLinkedListWithHead result = new CircularLinkedListWithHead();
        Node current = head.next;

        while (current != head) {
            result.insertLeft(current.data);
            current = current.next == head ? head : current.next;
        }
        return result;
    }
}
