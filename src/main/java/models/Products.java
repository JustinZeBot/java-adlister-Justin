package models;

import java.util.List;

public interface Products {
    List<Product> all();

    Product findById(int id);

    void insert(Product product);
    void delete(Product product);
    void update(Product product);
    void create(Product product);
}
