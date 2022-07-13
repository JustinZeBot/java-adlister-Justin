package controllers;

//Guessing Game
//        A user goes to /guess and is prompted to guess a number between 1 and 3. If correct,
//        the user will be redirected to /correct or /incorrect, depending on if they guess correctly.
//        In either case, the user will see the same view but with an outcome-specific message in a heading
//        (e.g. "You Won!" or "You Lose!").
//
//        use a POST request on the form
//        use two JSPs (one for guessing and another to view the outcome)
//        use three servlets:
//        one servlet for sending the guess view and processing the guess
//        another servlet for serving up the outcome JSP with a win message
//        another servlet for serving up the outcome JSP with a loss message
//        Bonus: If a user submits a number other than 1, 2, or 3, redirect them back to the guessing form.

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guess")
public class GuessingGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/views/guess-form.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // handle the form submission of the guess

        // needs to be between 1 and 3? Random
        int randomNumber  = (int) (Math.random() * 3) + 1;
        int  guess = Integer.parseInt(req.getParameter("guess"));

        // if guess = rn then show correct

        if (guess == randomNumber) {
            resp.sendRedirect("/correct");
        } else {
            resp.sendRedirect("/incorrect");
        }


    }
}
