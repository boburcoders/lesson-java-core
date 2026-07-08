package onlineSavatTizimi.entity;

public class CardItem {
    private String userName;
    private String productName;
    private int count;




    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CardItem(String userName, String productName, int count) {
        this.userName = userName;
        this.productName = productName;
        this.count = count;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", count=" + count +
                '}';
    }
}
