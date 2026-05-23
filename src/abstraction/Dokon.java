package abstraction;

public class Dokon {
    public static void sotish(String mahsulot, double price, TolovUsuli usuli) {
        System.out.println(mahsulot + "-" + price + "UZS");
        if (usuli.tolov(price)) System.out.println("Tolov mavaffaqqiyatli");
        else System.out.println("Tolov muvaffaqqiyatsiz");
    }

    public static void save(String user, UserService userService) {
        System.out.printf("user saved to:  %s", user);
    }

    public static void main(String[] args) {
//        TolovUsuli karta = new KartoTolov("Alisher", "UZS", "1234567891223456", 1000000);// upcasting;
//        sotish("Laptop", 500000, karta);

//        TolovUsuli terminal = new TerminalTolov("Alisher", "UZS", "bank01S", "user123");// upcasting;
//        sotish("Telefon", 3000000, terminal);

//        TolovUsuli tezQr = new TezQr("Alisher", "UZS", "tezQrImage");// upcasting;
//        sotish("Kiyim", 100000, tezQr);
        /*UserService psql = new PostgresService();
        UserService excel = new ExcelService();


        save("useri", psql.addUser("user"));
        System.out.println();
        save("useri", excel.addUser("userexcel"));*/


    }
}
