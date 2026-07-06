package exceptions;

public class DepositException extends IllegalArgumentException {
    public DepositException(String message) {
        super(message);
    }
}
