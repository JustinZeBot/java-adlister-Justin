package controllers;

import models.Product;
import models.Products;
import models.daos.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Products productsDao = DaoFactory.getProductsDao();
        List<Product> productsList = productsDao.all();

        req.setAttribute("products",productsList);

        RequestDispatcher view = req.getRequestDispatcher("/views/products.jsp");
        view.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Products productsDao = DaoFactory.getProductsDao();

        // get the data from the form,
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        Integer priceInCents = Integer.parseInt(req.getParameter("price"));

        // map the data to an object,
        Product product = new Product(1, name, description, priceInCents );
        // save that object to the dao.
        productsDao.create(product);

        // redirect
        resp.sendRedirect("/products");

    }
}
