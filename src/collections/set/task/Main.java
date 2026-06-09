package collections.set.task;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(274,"Abdumumin",300000);
        Employee emp2 = new Employee(274,"Abdumumin",300000);
        System.out.println(emp.equals(emp2));
        System.out.println(emp2.equals(emp));
        System.out.println(emp.hashCode());
        System.out.println(emp2.hashCode());
    }
}
