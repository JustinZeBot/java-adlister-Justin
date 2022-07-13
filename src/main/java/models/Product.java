package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {

    private long id;
    private String name;
    private String description;
    private int priceInCents;

    private static List<Product> products = new ArrayList<Product>();


    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        Product.products = products;

    }

    public Product() {};
    public Product(long id, String name, String description, int priceInCents) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceInCents = priceInCents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }
}

