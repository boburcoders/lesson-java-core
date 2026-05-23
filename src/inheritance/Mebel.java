package inheritance;

public class Mebel {
    private String name;
    private double price;
    private String colour;
    private final int age = 20;



    public Mebel(String name, double price, String colour) {
        this.name = name;
        this.price = price;
        this.colour = colour;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        String newName = name.toUpperCase();
        this.name = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100) {
            System.out.println("prica can not be zero");
        } else
            this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String malumot() {
        return "Malumot {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
