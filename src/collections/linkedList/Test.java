package collections.linkedList;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<>();
        linkedList.addFirst("Bahor");
        linkedList.addFirst("Qish");
        linkedList.addFirst("Quyosh");
        System.out.println(linkedList);
        linkedList.addLast("Oy");
        linkedList.addLast("Kun");
        System.out.println(linkedList);
    }
}
