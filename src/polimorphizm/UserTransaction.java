package polimorphizm;

public class UserTransaction {


    public static void main(String[] args) {
        Payment payment = new Payment();  // upcasting, agar subclassda shu metod bosa shuni ishlatmoqda
        // agar bomasa payment ozidagini ishlatmoqda

        payment.transfer(120, null, null);
        payment.dollirKurs();

        HumoToUzcard humoToUzcard = (HumoToUzcard) payment;  // dowcasting
        humoToUzcard.dollirKurs();
//        Payment payment1 = new VisaUzard();
//        payment1.transfer(200, null, null);
//
//        long c = 10;
//        int a = (int) c;

    }
}
