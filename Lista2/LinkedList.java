public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public boolean search(int data) {
        Node current = head.next;
        while (current != tail) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int data) {
        Node current = head.next;
        while (current != tail) {
            if (current.data == data) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                break;
            }
            current = current.next;
        }
    }


    public void print() {
        Node current = head.next;
        while (current != tail) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}