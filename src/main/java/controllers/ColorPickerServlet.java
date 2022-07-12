package controllers;

//A user goes to /pickcolor and sees a page where they are prompted to enter their
// favorite color (using a text input). Upon clicking submit,
//
// they are redirected to /viewcolor and see a page with a
// background color of the submitted color.
//
//        use a POST request on the form

//        use two JSPs and two servlets
//        use style tags to set the background color on the HTML body


//        pass the data from one servlet to another by adding the color
//        value in a query string

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pickColor", urlPatterns = "/pickColor")
public class ColorPickerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pick-color.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color").substring(1);
        // Display it to the view
        resp.sendRedirect("/java_adlister_Justin_war_exploded/viewColor?color=" +  color);
    }
}