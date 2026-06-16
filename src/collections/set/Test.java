package collections.set;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /* *//* CustomSetCollection setCollection = new CustomSetCollection();
        System.out.println(setCollection.hashCode());
        System.out.println(setCollection.equals(setCollection));*//*
        Student student = new Student(1L,"Alisher",242435L);
        Student student1 = new Student(1L,"Olim",2454335L);

        System.out.println(student.equals(student1));
        System.out.println(student1.equals(student));
        List<Student> students = new ArrayList<>();*/

        CustomHashSet<String> set = new CustomHashSet<>(new HashMap<>());
        System.out.println(set.add("Bobur"));// 0 index hascode orqali, oldin bosh edi
        System.out.println(set.add("Bobur")); // 0 index bordi Bobur, equals PRESENT, PRESENT==null
        System.out.println(set.add("Alisher")); // 1 index
        System.out.println(set.add("Anvar")); // 4 index
        System.out.println(set.add("Olim")); // 7 index

        System.out.println(set.remove("Bobur"));

        System.out.println(set.contains("Olim1"));

        System.out.println(set);

        set.clear();

        System.out.println(set);


    }

}
