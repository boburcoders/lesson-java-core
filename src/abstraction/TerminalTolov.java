package abstraction;

import java.util.Objects;

public class TerminalTolov extends AsosiyTolov {
    private String bankInn;
    private String account;

    public TerminalTolov(String egasi, String valuta, String bankInn, String account) {
        super(egasi, valuta);
        this.bankInn = bankInn;
        this.account = account;
    }

    @Override
    public boolean tolov(double summa) {
        if (!validation()) return false;
        if (account == null || account.isBlank()) return false;
        System.out.println(summa + " bank accountga otkazildi" + account);
        return true;
    }

    @Override
    public boolean validation() {
        return Objects.equals(bankInn, "bank01S");
    }
}
