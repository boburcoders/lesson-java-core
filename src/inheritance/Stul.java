package inheritance;

public class Stul extends Mebel {
    private int oyoqLarSoni;

    // single ingeritence
    // Multilevel Inheritance

    public Stul(String name, double price, String colour, int oyoqLarSoni) {
        super(name, price, colour);
        this.oyoqLarSoni = oyoqLarSoni;
    }

    public int getOyoqLarSoni() {
        return oyoqLarSoni;
    }



    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
    }
}
