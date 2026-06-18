package collections.set.task.hashSet;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LoginHashSet<T> {
    Set<T> hashset = new HashSet<>();
    private final static Object PRESENT = new Object();
    private final HashMap<T, Object> map;

    public LoginHashSet(HashMap<T, Object> map) {
        this.map = map;
    }

    public void hashsetAdd(T value){
       if (map.put(value,PRESENT)==null){
           System.out.println("Yangi foydalanuvchi : "+value);
       }
       else {
           System.out.println("Takroriy Foydalanuvchi : "+value);
       }
    }
}
