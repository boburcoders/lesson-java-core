package abstraction;

public class TezQr extends AsosiyTolov {
    private String qrKode;

    public TezQr(String egasi, String valuta, String qrKode) {
        super(egasi, valuta);
        this.qrKode = qrKode;
    }

    @Override
    public boolean tolov(double summa) {

        if (!validation()) return false;
        if (qrKode == null || qrKode.isBlank()) return false;
        System.out.println(summa + " bank accountga otkazildi" + qrKode);
        return true;
    }

    @Override
    public boolean validation() {
        return !(qrKode == null && qrKode.isBlank());
    }
}
