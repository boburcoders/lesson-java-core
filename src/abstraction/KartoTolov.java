package abstraction;

public class KartoTolov extends AsosiyTolov {
    private String raqam;
    private double limit;

    public KartoTolov(String egasi, String valuta, String raqam, double limit) {
        super(egasi, valuta);
        this.raqam = raqam;
        this.limit = limit;
    }

    @Override
    public boolean tolov(double summa) {
        if (!validation()) return false;
        if (summa > limit) return false;
        limit -= summa;
        return true;
    }

    @Override
    public boolean validation() {
        return raqam.length() == 16;
    }
}
