package collections.map;

import java.util.Arrays;
import java.util.Objects;

public class LinkedHashMapCustom<K, V> {
    private static class Node<K, V> {
        K key;
        V value;

        Node<K, V> next; // bu agar hash valuelari bir xil chiqib qolganda lekin teng bomaganda, bucket chain

        Node<K, V> before;
        Node<K, V> after;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", {" + "next=" + next + "}" +
                    '}';
        }
    }

    private Node<K, V>[] elements;
    private int size;

    private Node<K, V> head;
    private Node<K, V> tail;

    @SuppressWarnings("unchecked")
    public LinkedHashMapCustom() {
        elements = new Node[16];
    }

    private int index(K key) {
        return Math.abs(Objects.hashCode(key)) % elements.length;
    }

    public void put(K key, V value) {
        int index = index(key);

        Node<K, V> current = elements[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);

        newNode.next = elements[index];
        elements[index] = newNode;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.before = tail;
            tail.after = newNode;
            tail = newNode;
        }
        size++;
    }

    // get, containesKey, isEmpty, size, remove,

    @Override
    public String toString() {
        return "LinkedHashMapCustom{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
