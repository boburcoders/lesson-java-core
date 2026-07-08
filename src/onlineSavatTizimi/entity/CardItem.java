package onlineSavatTizimi.entity;

import java.util.Map;

public class CardItem {
    private String userName;
    private Map<Product, Integer> products;

    public boolean addProduct(Product product) {
        int count = 1;
        if (existProduct(product)) {
            count = this.products.get(product);
            count += 1;
            products.put(product, count);
        } else
            products.put(product, count);
        return true;
    }

    public boolean existProduct(Product product) {
        return this.products.containsKey(product);
    }
}
