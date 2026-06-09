package collections.set.task;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) {
            return true;
        }

        if (obj == null || !(obj instanceof Employee)) {
            return false;
        }

        Employee emp = (Employee) obj;

        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + salary +
                '}';
    }
}