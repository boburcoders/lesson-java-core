package exceptions;

public class NotFoundException extends RuntimeException {
    private String message;
    private int code;
    private String type;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, int code) {
        super(message);
        this.code = code;
    }

    public NotFoundException(String message, int code, String type) {
        super(message);
        this.code = code;
        this.type = "NOT_FOUND";
    }


}
