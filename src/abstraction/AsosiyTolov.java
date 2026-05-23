package abstraction;

public abstract class AsosiyTolov implements TolovUsuli {
    protected String egasi;
    protected String valuta;

    public AsosiyTolov(String egasi, String valuta) {
        this.egasi = egasi;
        this.valuta = valuta;
    }

    public void chekInfo(double summa) {
        System.out.println(egasi +
                " " + valuta +
                " " + tolov(summa));
    }
}
