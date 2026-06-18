package collections.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetLesson {
    public static void main(String[] args) {
        Set<String> strings = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(25);
//        ,5,10,15,20,25

    }

    /*
     * hashSet --> hashMap dan foydalanadi, hashTable dan foydalandi.
     *
     * LinkedHashSet va TreeSet --> today lesson
     *
     * LinkedHashSet -> HashSet extend olib Set dan implementatsiya olgan
     * hashMap + DoubLyLinkedList --> orqali malumotlarni saqlaydi
     *
     * TreeSet --> natural order tartibda saqlaydi, Red black tree ichki tuzilmada malumot saqlaydi,
     * compareble, comperator lardan foydalanib malumotlarni saqlaydi.
     *
     * 5, 30,10,,15,
     *
     * */


}
