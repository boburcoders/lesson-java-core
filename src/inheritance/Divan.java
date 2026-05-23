package inheritance;

public class Divan extends Mebel{
    private int orindiqlarSoni;

    public Divan(String name, double price, String colour, int orindiqlarSoni) {
        super(name, price, colour);
        this.orindiqlarSoni = orindiqlarSoni;
    }

    public int getOrindiqlarSoni() {
        return orindiqlarSoni;
    }


}
