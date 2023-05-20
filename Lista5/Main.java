public class Main {
    public static void main(String[] args) {
        CircularLinkedListWithHead list1 = new CircularLinkedListWithHead();
        list1.insertLeft(3);
        list1.insertLeft(2);
        list1.insertLeft(1);
    
        System.out.println("Tamanho da lista 1: " + list1.size()); // 3
    
        CircularLinkedListWithHead list2 = new CircularLinkedListWithHead();
        list2.insertLeft(6);
        list2.insertLeft(5);
        list2.insertLeft(4);
    
        System.out.println("Tamanho da lista 2: " + list2.size()); // 3
    
        list1.concatenate(list2);
    
        System.out.println("Tamanho da lista 1 após concatenação: " + list1.size()); // 6
    
        CircularLinkedListWithHead list3 = new CircularLinkedListWithHead();
        list3.insertLeft(9);
        list3.insertLeft(7);
    
        CircularLinkedListWithHead result = list1.interleave(list3);
    
        System.out.println("Tamanho da lista resultante após intercalação: " + result.size()); // 8
    
        CircularLinkedListWithHead copy = result.copy();
    
        System.out.println("Tamanho da cópia da lista resultante: " + copy.size()); // 8
    }
    
}
