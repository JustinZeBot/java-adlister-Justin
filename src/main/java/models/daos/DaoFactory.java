package models.daos;

import models.Product;
import models.Products;

public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        //if its null create it, but if its not, use
        // the exisiting instance
        if(productsDao == null) {
            productsDao = new ListProductsDao();
        }
        return productsDao;
    }


}

