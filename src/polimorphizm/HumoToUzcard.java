package polimorphizm;

public class HumoToUzcard extends Payment {


    @Override
    public void transfer(int price, Object fromUser, Object toUser) {
        System.out.println("ximat 0.3%");
    }

    @Override
    public void dollirKurs() {
        System.out.println("12300");
    }
}
