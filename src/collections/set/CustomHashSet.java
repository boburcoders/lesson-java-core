package collections.set;

import java.util.HashMap;

public class CustomHashSet<E> {
    // bu hamma value uchun bitta Objectdan foydalanamiz xotirada  yutish uchun
    private static final Object PRESENT = new Object();
    //
    private final HashMap<E, Object> map;

    public CustomHashSet(HashMap<E, Object> map) {
        this.map = map;
    }

    public boolean add(E data) {
        // agar oldin shunaqa object bor bolin Hello,
        // Hello==null;
        // Good put , null null==null

        return map.put(data, PRESENT) == null;
    }

    public boolean remove(E data) {
        Object remove = map.remove(data);
        return remove == PRESENT;
    }

    public boolean contains(E o) {
        return map.containsKey(o);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    @Override
    public String toString() {
        return map.keySet().toString();

    }


    /*
     * orqada HashMap unOrdered korinishda
     * unique,
     *
     * */
}
