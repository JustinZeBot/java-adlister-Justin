package models.daos;

import models.Product;
import models.Products;

import java.util.List;

public class ListProductsDao implements Products {
    List<Product> products = Product.getProducts();

    @Override
    public List<Product> all() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void create(Product product) {
        products.add(product);
    }


}
