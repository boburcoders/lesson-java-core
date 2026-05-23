package inheritance;

public class Karavat extends Mebel{
    private String olachmi;

    public Karavat(String name, double price, String colour, String olachmi) {
        super(name, price, colour);
        this.olachmi = olachmi;
    }

    public String getOlachmi() {
        return olachmi;
    }
}
