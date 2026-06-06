package collections.linkedList;

import java.util.LinkedList;

/*
 * [.0.1.2.3.4.5.6.7.8.9] ArrayList xotirada ketma ket, get,
 * LinkedListda previos va next node lar boladi, 0 previos yoq, next 1 odam, 1 odamdi previose 0 , next 2 odam, 2 previouse 1, 2 next 3,
 * 0 previouse 0, 0 next 2, 2 previse 0, get
 * ArrayList ni qachonki get(index), for each, stream, ishlashda zor, xotirada kamroq joy oladi
 * LinkedList boshiga va oxiriga element qoshishda, Queue bilan ishlashda, remove, add kop bolsa shuni ishlatgan maqulm, xotiradda biroz koproq
 *
 *
 *
 * */
public class CustomLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // todo: check
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int step) {
        checkIndex(step);
        Node<T> current = head;

        for (int i = 0; i < step; i++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        T deleted = head.data;
        // 1 da 1->  next,
        //1=1 next
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;

        return deleted;
    }

    public T removeLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        if (head == tail) {
            T deleted = head.data;
            head = null;
            tail = null;
            size--;
            return deleted;
        }
        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T deleted = tail.data;
        tail = current;
        tail.next = null;

        size--;

        return deleted;
    }


    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Notogri index: " + index);
        }
    }


    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
