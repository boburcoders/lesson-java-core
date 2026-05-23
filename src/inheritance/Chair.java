package inheritance;

public class Chair extends Stul {

    private String madeFrom;

    public Chair(String name, double price, String colour, int oyoqLarSoni, String madeFrom) {
        super(name, price, colour, oyoqLarSoni);
        this.madeFrom = madeFrom;
    }


}
