package collections.queue;

public class Task implements Comparable {
    int priority;
    String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Task other = (Task) o;
        return this.priority - other.priority;
    }
}
