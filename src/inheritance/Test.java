package inheritance;

public class Test {

    public static void main(String[] args) {
        Stul stul = new Stul("Italinski", 0, "Bule", 4);
        Divan divan = new Divan("Kreslo", 3000000, "White", 2);
        Karavat karavat = new Karavat("karavatUzb", 300.000, "red", "120x200");

        /*stul.setPrice(-1);
        System.out.println(stul.malumot());
        divan.setPrice(-10);
        divan.setName("oddiyDivan");
        System.out.println(divan.malumot());*/

        Users users = new Users();

        Users newUser = new Users();

        System.out.println(karavat.malumot());


    }
}
