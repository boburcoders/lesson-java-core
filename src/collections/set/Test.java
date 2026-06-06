package collections.set;

public class Test {
    public static void main(String[] args) {
        CustomSetCollection setCollection = new CustomSetCollection();
        System.out.println(setCollection.hashCode());
        System.out.println(setCollection.equals(setCollection));
    }
}
