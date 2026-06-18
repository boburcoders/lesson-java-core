package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable {
    private Double grade;
    Set<Student> students = new TreeSet<>();

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Double.compare(this.grade,((Student) o).grade);
    }
}
