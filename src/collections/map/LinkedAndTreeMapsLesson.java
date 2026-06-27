package collections.map;

import java.util.*;

public class LinkedAndTreeMapsLesson {
    /*
     *LinkedHashMap va TreeMap -> bu ikkala klasslar ham Map implement qilgan
     *
     * LinkedHashMap bu ham malumotlarni saqlashda equals va hashCode methodlar foydalanadi
     * order saqlaydi put order boyicha saqlayd,
     *
     * TreeMap - bu class SortedMap orqali Map implement qilingan,
     * natural order saqlaydi,
     * equals vs hashCode dan foydalanmay
     * compareTo methodidan foydalanadi,
     * agar biz custom objectlarni treemap ga saqlamoqchi bolsa biz Compareable dan implement olib compare methodini ovrride qilishimiz kerak
     *
     *
     * */
    public static void main(String[] args) {
//        Map<String, String> stringMap = new LinkedHashMap<>();
//        stringMap.put("monday", "Dushanba");
//        stringMap.put("thusday", "Seshanba");
//
//        System.out.println(stringMap);

        LinkedHashMapCustom<String, Integer> nums = new LinkedHashMapCustom<>();
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("two", 6);
        nums.put("three", 3);
        nums.put("four", 4);
        System.out.println(nums);

    }
}
