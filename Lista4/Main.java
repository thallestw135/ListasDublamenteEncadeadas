public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList list1 = new DoublyCircularLinkedList();
        list1.insertLeft(3);
        list1.insertLeft(2);
        list1.insertLeft(1);
    
        System.out.println("Tamanho da lista 1: " + list1.size()); // 3
    
        DoublyCircularLinkedList list2 = new DoublyCircularLinkedList();
        list2.insertLeft(6);
        list2.insertLeft(5);
        list2.insertLeft(4);
    
        System.out.println("Tamanho da lista 2: " + list2.size()); // 3
    
        list1.concatenate(list2);
    
        System.out.println("Tamanho da lista 1 após concatenação: " + list1.size()); // 6
    
        DoublyCircularLinkedList list3 = new DoublyCircularLinkedList();
        list3.insertLeft(9);
        list3.insertLeft(7);
    
        DoublyCircularLinkedList result = list1.interleave(list3);
    
        System.out.println("Tamanho da lista resultante após intercalação: " + result.size()); // 8
    
        DoublyCircularLinkedList copy = result.copy();
    
        System.out.println("Tamanho da cópia da lista resultante: " + copy.size()); // 8
    }
    
}
