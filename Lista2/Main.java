public class Main {
    public static void main(String[] args) {
        // Criando uma lista duplamente encadeada com um "nó cabeça"
        LinkedList list = new LinkedList();

        // Adicionando elementos à lista
        list.add(1);
        list.add(2);
        list.add(3);

        // Buscando um elemento na lista
        boolean found = list.search(2);
        System.out.println(found);

        // Removendo um elemento da lista
        list.delete(2);
        list.print();
    }
}
