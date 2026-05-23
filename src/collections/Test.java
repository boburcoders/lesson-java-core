package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> countryNames = new ArrayList<>();

        /*
         * Collection Framework
         * generic programing, har xil objectlar bilan ishlaydi
         * dynamic, helper methodlari bor, add,remove, contain, isEmpty;
         *
         * */

        /*countryNames.add("Uzbeksitan"); //0
        countryNames.add("USA");    //1
        countryNames.add("UKA");    //2
        System.out.println(countryNames.get(1));
        System.out.println(countryNames);
        countryNames.remove(0);
//        System.out.println(countryNames);
        System.out.println(countryNames.contains("USA"));

        ArrayList<Student> students = new ArrayList<>();


        Student student = new Student(1L, "Odil", "Odilov", "123AS4", "studetn1@gamil.com");
        Student student1 = new Student(2L, "Alisher", "Odilov", "123AS4", "studetn2@gamil.com");
        Student student2 = new Student(3L, "Olim", "Odilov", "123AS4", "studetn3@gamil.com");
        Student student3 = new Student(4L, "Diyor", "Odilov", "123AS4", "studetn4@gamil.com");
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
//        System.out.println(students.get(0));
        for (Student s : students) {
            System.out.println(s);
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == 2) {
                System.out.println(students.get(i));
            }
        }*/

        /*
         * add *
         * get *
         * checkIndex *
         * capacity *
         * size *
         * remove *
         *
         * */

        CustomArrayList customArrayList = new CustomArrayList();
//        System.out.println(customArrayList.capacity());
//        System.out.println(customArrayList.size());
        customArrayList.add("Alisher");
        customArrayList.add("Olim");
        customArrayList.add("Bobur");
        customArrayList.add("Sardor");
        customArrayList.add("Asilbek");
        customArrayList.add("Farxod");

        System.out.println(customArrayList);

//        System.out.println(customArrayList.capacity());
//        System.out.println(customArrayList.size());
//        System.out.println(customArrayList.get(5));

//        System.out.println(customArrayList.capacity());
//        System.out.println(customArrayList.size());

//        customArrayList.remove(0);

//        System.out.println(customArrayList.capacity());
//        System.out.println(customArrayList.size());

        List<String> list = new LinkedList<>(); // add,
        List<String> array = new ArrayList<>();//shuni organidik, get index, set, remove,



        System.out.println(customArrayList.contains("Bobur"));


    }
}
