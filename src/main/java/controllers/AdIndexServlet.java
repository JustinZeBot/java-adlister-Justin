package controllers;

import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/ads")
public class AdIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ad> ads = new ArrayList<>(Arrays.asList(
                new Ad(1, "Hammer for Sale", "It swings."),
                new Ad(2, "Drill for Sale", "It spins."),
                new Ad(3, "Car for Sale", "It moves."),
                new Ad(4, "Computer for Sale", "It turns on.")
        ));
        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/views/ads.jsp").forward(req, resp);
    }
}

