package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Newsletter;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "Subscribe", urlPatterns = {"/Subscribe"})
public class Subscribe extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        if (name != null && email != null) {
            Newsletter objNewsletter = new Newsletter();
            if (objNewsletter.alreadySubscribed(name, email)) {
                response.getWriter().print("You have already subscribed for ComputerWorks newsletter !");
            } else if (objNewsletter.subscribe(name, email) != 0) {
                response.getWriter().print("You have successfully subscribed for ComputerWorks newsletter !");
            } else {
                response.getWriter().print("Error occurred during the process! Please refresh the page and try again!");
            }
        }

    }

}
