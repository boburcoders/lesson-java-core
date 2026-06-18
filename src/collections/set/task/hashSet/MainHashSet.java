package collections.set.task.hashSet;

import java.util.HashMap;

public class MainHashSet {
    public static void main(String[] args) {
        LoginHashSet<String> hashSet = new LoginHashSet<String>(new HashMap<>());
        hashSet.hashsetAdd("Abdumumin");
        hashSet.hashsetAdd("Abdumumin");
        hashSet.hashsetAdd("Gani");
        hashSet.hashsetAdd("Vali");
        hashSet.hashsetAdd("Salim");
        hashSet.hashsetAdd("Gani");
        hashSet.hashsetAdd("Vali");
    }
}
