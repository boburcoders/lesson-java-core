package collections;

import java.util.*;

public class CustomArrayList {


    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(Object value) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = value;
        size++;
    }

    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }


    public Object remove(int index) {
        checkIndex(index);
        Object removedValue = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;

        return removedValue;
    }

    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (value == null) {
                if (elements[i] == null) {
                    return false;
                }
            } else {
                if (value.equals(elements[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int capacity() {
        return elements.length;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index notogri: " + index);
        }
    }


    private void grow() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
