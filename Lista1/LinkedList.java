public class LinkedList {
    private Node head;
    private Node tail;

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
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void concatenate(LinkedList list2) {
        this.tail.next = list2.head;
        list2.head.prev = this.tail;
        this.tail = list2.tail;
    }

    public LinkedList[] split() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        Node current = this.head;
        int count = 0;
        while (current != null) {
            if (count % 2 == 0) {
                list1.add(current.data);
            } else {
                list2.add(current.data);
            }
            current = current.next;
            count++;
        }
        return new LinkedList[]{list1, list2};
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.add(current1.data);
                current1 = current1.next;
            } else {
                mergedList.add(current2.data);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.next;
        }
        return mergedList;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}

