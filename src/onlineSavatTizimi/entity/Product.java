package onlineSavatTizimi.entity;

public class Product {
    private int id;
    private String name;
    private Double price;
    private String model;

    public Product(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Product newProduct = (Product) obj;
        return newProduct.id == this.id;
    }
}
