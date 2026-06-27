package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLesson {
    public static void main(String[] args) {
        Map<String, String> stringMap = new TreeMap<>();

        stringMap.put("yigirma","Yigirma");
        stringMap.put("besh","Besh");
        stringMap.put("ikki","Ikki");
        stringMap.put("bir","Bir");
        System.out.println(stringMap);
    }
}
