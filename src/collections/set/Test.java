package collections.set;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       /* CustomSetCollection setCollection = new CustomSetCollection();
        System.out.println(setCollection.hashCode());
        System.out.println(setCollection.equals(setCollection));*/
        Student student = new Student(1L,"Alisher",242435L);
        Student student1 = new Student(1L,"Olim",2454335L);

        System.out.println(student.equals(student1));
        System.out.println(student1.equals(student));
        List<Student> students = new ArrayList<>();


    }

}
