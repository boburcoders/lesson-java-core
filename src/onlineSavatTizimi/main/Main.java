package onlineSavatTizimi.main;

import onlineSavatTizimi.entity.CardItem;
import onlineSavatTizimi.entity.Product;
import onlineSavatTizimi.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
    public static void main(String[] args) {

        Map<Integer, User> usersMap = new HashMap<>();

        usersMap.put(101,new User(101,"Abdumumin"));
        usersMap.put(102,new User(102,"Abduraxmon"));
        usersMap.put(103,new User(103,"Abdurasul"));
        System.out.println(usersMap.toString());

        Map<Integer, Product> products = new HashMap<>();
        products.put(201,new Product(201,"Telefon","Samsung"));
        products.put(202,new Product(202,"Telefon","iPhone"));
        products.put(203,new Product(203,"Telefon","Redme"));

        System.out.println(products.toString());

        List<CardItem> cartItems = new ArrayList<>();
        cartItems.add(new CardItem(usersMap.get(101).getName(),products.get(201).getName(),3));

        System.out.println(cartItems.toString());
    }
}
