public class Main {
    public static void main(String[] args) {
        // Criando duas listas duplamente encadeadas
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        LinkedList list2 = new LinkedList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Concatenando as duas listas
        list1.concatenate(list2);
        System.out.print("Lista concatenada: ");
        list1.print();

        // Dividindo a lista concatenada em duas novas listas
        LinkedList[] splitLists = list1.split();
        LinkedList splitList1 = splitLists[0];
        LinkedList splitList2 = splitLists[1];

        // Criando duas novas listas ordenadas
        LinkedList sortedList1 = new LinkedList();
        sortedList1.add(1);
        sortedList1.add(3);
        sortedList1.add(5);
        LinkedList sortedList2 = new LinkedList();
        sortedList2.add(2);
        sortedList2.add(4);
        sortedList2.add(6);

        // Intercalando as duas listas ordenadas em uma nova lista ordenada
        LinkedList mergedList = LinkedList.merge(sortedList1, sortedList2);
        System.out.print("Lista intercalada: ");
        mergedList.print();
    }
}
