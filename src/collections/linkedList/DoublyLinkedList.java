package collections.linkedList;

public class DoublyLinkedList<T> {
    /*
     * LinkedList 2 ta turi, SinglyLinkedList head, tail, har bitta point next,
     * DoublyLinkedList head, tail, har point previous va next,
     * Algrothims, musiqa , prev,next , musiq ,<,. > , OS CPU task,
     *
     * */

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.data = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    /*
     * addFirst,
     * addLast,
     *
     * removeFirst,
     * removeLast
     * contain
     * */

    void addFirst(T data) {
        final Node<T> f = head;
        final Node<T> newNode = new Node<>(null, data, head);
        head = newNode;
        if (f == null) {
            tail = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    void addLast(T data) {
        final Node<T> l = tail;
        final Node<T> newNode = new Node<>(l, data, null);
        tail = newNode;
        if (l == null) {
            head = newNode;
        } else {
            l.next = newNode;
        }
        size++;

    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("[");

        Node<T> current = head;

        while (current != null) {
            builder.append(current.data);

            if (current.next != null) {
                builder.append(",");
            }

            current = current.next;
        }

        builder.append("]");

        return "DoublyLinkedList{" +
                builder +
                '}';
    }
}
