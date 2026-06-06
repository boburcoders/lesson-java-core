package collections.set;

public class Student {
    private Long id;
    private String name;
    private Long studentNumber;

    public Student(Long id, String name, Long studentNumber) {
        this.id = id;
        this.name = name;
        this.studentNumber = studentNumber;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id);  // 1 variant
//        return Objects.hash(id, name);

        int result = 17;
        result = Math.toIntExact(31L * result + id);
        result = 31 * result + (name == null ? 0 : name.hashCode());
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) return true;
        if (!(obj instanceof Student)) return false;
        if (obj == null) return false;
        Student s = (Student) obj;
        return this.id == s.id;
    }

}
