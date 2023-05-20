public class Main {
    public static void main(String[] args) {
        CircularLinkedList list1 = new CircularLinkedList();
        list1.insertLeft(3);
        list1.insertLeft(2);
        list1.insertLeft(1);
    
        System.out.println("Tamanho da lista 1: " + list1.size()); // 3
    
        CircularLinkedList list2 = new CircularLinkedList();
        list2.insertLeft(6);
        list2.insertLeft(5);
        list2.insertLeft(4);
    
        System.out.println("Tamanho da lista 2: " + list2.size()); // 3
    
        list1.concatenate(list2);
    
        System.out.println("Tamanho da lista 1 após concatenação: " + list1.size()); // 6
    
        CircularLinkedList list3 = new CircularLinkedList();
        list3.insertLeft(9);
        list3.insertLeft(7);
    
        CircularLinkedList result = list1.interleave(list3);
    
        System.out.println("Tamanho da lista resultante após intercalação: " + result.size()); // 8
    
        CircularLinkedList copy = result.copy();
    
        System.out.println("Tamanho da cópia da lista resultante: " + copy.size()); // 8
    }
    
}
