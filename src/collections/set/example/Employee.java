package collections.set.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Employee implements Comparable {
    private Long id;
    private String name;
    private Double salary;

    public Employee(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return Double.compare(this.id, ((Employee) o).id);
    }

    Map<String, Object> map = new HashMap<>();
}
