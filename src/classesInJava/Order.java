package classesInJava;

public class Order {
    private String code;
    private String address;

    public Order() {
    }

    public Order(String code, String address) {
        this.code = code;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setCode(String code) {
        this.code = code;
    }


}
