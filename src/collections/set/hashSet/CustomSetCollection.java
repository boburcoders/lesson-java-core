package collections.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class CustomSetCollection {
    /*
     *Set bu javada Unique elementlarni saqlaydigan Collection
     * {A,B,C},
     * HashSet, LinkedHashSet,TreeSet mana shu 3 ta asosiy class implement qilgan;
     * tartibsiz saqlaydi, index yoq, malumotlarni saqlash HashTabledan foydalanadi
     * */

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Hello");
        strings.add("OK");
        strings.add("OK");
        strings.add("Good");
        strings.add("Day");
        strings.add("Month");
        System.out.println(strings);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
