package collections.set;

import java.util.*;

public class CustomHashSet {

    /*
     * Arraylist index based xotirada ham ketma ket joylashadi, [0,1,2,3,4], add va remove kam bajarilsa , koproq get bolsa
     * LinkedList(Doubly, SingLy) LinkedListlar -> Node lar iborat, Doubley nodeda prev, next, singlyda faqat next, ikklasida head va tail node lar saqlanadi
     * Set buyam interface xuddi List kabi, lekin buniyam xuddi klasslari bor bular:
     * malumotlatr uniqalniy saqlanadi, Set maulotlarni saqalash Map lardan foydalanadi: {}
     * HashSet, LinkedHashSet, TreeSet: HashSet
     * HashSet Set implement qilgan class: bu class malumotlarni saqlashda HashMap foydlanadi.
     *  malumotlar uniqalnliy, tartiblash yoq(unordered), null qiymat qabul qiladi,add,remove va contain juda tez, 0(1);
     *
     * */

    /*
    * equals kontraktalri mavjud bular: 5 ta kontrakt,
    * 1: Reflexivity(Student student) bu ozini equals tekshirsa true, student.equals(student) true bolishui kerak;
    * 2: Symettry (Student ali, Student vali) agar ali.equals(vali) true, vali.equals(ali)
    * 3: Transivty (x,y,z) x.equals(y) true, y.equals(z),  x.eqauls(z) true;
    * 4: consistinsy (Agar object ozgarmasa) eqauls true ,
    * 5: Null safety agar kirib kelayotgan object null bolsa false bolishi kerak, student.equals(null) false qaytarish kerak
    *
    * */

    /*
    * hashCode kontraklar
    * 1: consistinsy -> Object ozgarmasa hashCode ozgarmaslik kerak
    * 2: equals bilan moslik: agar (x,y) x.eqauls(y) == x.hashCode()==y.hashCode();
    * 3: equals bilan mos bolmasa : agar (x,y) x.eqauls(y) == x.hashCode()==y.hashCode() ham mos bolmasin;
    * */

    /*
    * agar bittasini overrite ikkinchisi ham majburiy
    * [null,null,null,"Salom":["Hello,],null,null]
    * hasCode "Salom" -> buni hashCode olamiz, 12244 endi index=12244%length, 0,1,2,5,;
    * */


    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Salom");
        strings.add("Qalay");
        strings.add("ok");
        strings.add("ok");
        strings.add("yaxshimi");

        String s = "yaxshimi";
        int x = s.hashCode();


    }
}
