package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.NotActiveException;
import java.sql.SQLException;

public class JavaExceptionLesson {
    /*
     * Exception - class , 2 xil checked vs unchecked, error
     *
     * checked bu RuntimeException dan extend qilmagan barcha classlar yani exceptionlar
     * bular compiler majburlaydi handle qilishga, compiler aytadi shu yerda exception chiqishi mumkin
     *
     * unchecked exception bu RuntimeException dan extend qilgan bracha classlar, NullPointerException, ArrayOutBoundException
     * ZeroDevisionException , buni handle qilish, catch qilish ixtiyoriy, dasturni logikasiga qarab.
     *
     * */
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        try {
//            // db userni id get qilsh kerak
//            int result = a / b;
//
//            System.out.println(result);
//        } catch (ArithmeticException exception) {
//            System.out.println("xatolik: " + exception.getMessage());
//            System.out.println("Boshqa raqam kiriting");
//        } catch (NullPointerException e) {
//            System.out.println("Nullpointer ex");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
//        } finally {
//            //close , input
//        }
//        System.out.println("Dastur davom etmoqda");

//        try (BufferedReader br = new BufferedReader(new FileReader("/home/bobur/IdeaProjects/PortfolioProjects/core_java/src/exceptions/test.txt"))) {
//            System.out.println(br.readLine());
//        } catch (IOException e) {
//            System.out.println("Fileni oqib bolmadi");
//        }



        /*
         * try-catch
         * try-with-resource
         * */

        JavaExceptionLesson.deposit(-10);

    }

    private static void deposit(int money) {
        if (money <= 0) {
            throw new DepositException("Summa maniy bolishi mumkin emas");
        }
        System.out.println("Pul hisobingizga qoshildi: " + money);
    }
}
