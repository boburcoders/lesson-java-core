package collections.map;

import java.util.HashMap;

public class HashMapLesson {
    /*
     * HashMap classi bu Map dan implement qilgan va juda kop foydalaniladigan class
     * bu ham KEY,Value saqlaydi, bitta null key oladi, lekin Value takrorlanishi mumkin
     *
     * */


    public static void main(String[] args) {
        CustomHashMap<String, String> hashMap = new CustomHashMap<>();

        hashMap.put("monday","Dushanba");
        hashMap.put("mondya","Dushanba");
        hashMap.put("mond","Dushanba");
        hashMap.put("thuesday","Seshanba");
        System.out.println(hashMap);
        hashMap.put("monday","Dushanba1");


        System.out.println(hashMap.get("monday"));
        System.out.println(hashMap.remove("monday"));
        System.out.println(hashMap.contains("monday"));


    }
}
