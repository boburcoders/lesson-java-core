package polimorphizm;

public class VisaUzard extends Payment {
    @Override
    public void transfer(int price, Object fromUser, Object toUser) {
        System.out.println("0.5 % xizmat");
    }
}
