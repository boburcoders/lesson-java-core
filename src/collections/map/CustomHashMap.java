package collections.map;

import java.util.Arrays;
import java.util.Objects;

public class CustomHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private Node<K, V>[] elements;
    private static final int DEFAULT_CAPACITY = 15;
    private int size = 0;

    public CustomHashMap() {
        elements = new Node[DEFAULT_CAPACITY];
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % elements.length;
    }

    public void put(K key, V value) {
        int index = hash(key);

        Node<K, V> head = elements[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = elements[index];
        elements[index] = newNode;
        size++;
    }

    public V get(K key) {
        int index = hash(key);

        Node<K, V> current = elements[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public boolean contains(K key) {
        return get(key) != null;
    }

    public V remove(K key) {
        int index = hash(key);
        Node<K, V> current = elements[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                if (prev == null) {
                    elements[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    /*
    * keySet()
    * values()
    * */
    @Override
    public String toString() {
        return "CustomHashMap{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
