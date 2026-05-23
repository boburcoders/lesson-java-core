import oop.encapculation.EncapSualtion.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";// heap, string pool

        String str1 = new String("Hello");
        // ==, eqauls()
//        System.out.println(str1.equals(str));
        //Salom
//        System.out.println(str.endsWith("lo"));
//        System.out.println(str1.startsWith("H"));

        /*
         * class final
         * field final
         * contstructor
         * metod lar
         * */
        // StringBuilder
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder("Hello");

//        String test = "";
        //BASE_URL, token,
        /*for (int i = 0; i < 5; i++) {
             stringBuilder.append(sc.next());
        }*/

//        stringBuilder.delete(2,3);  //1.5
//        stringBuilder.substring(3);
//        stringBuilder.reverse();

//        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer(); // 1.0//  thread safe

        // 100, 25+, -25, race condition

        Account account = new Account();
        account.setBalance(-0);

        System.out.println(account.getBalance());


    }
}