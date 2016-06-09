package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserClass;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "ResetNewPassword", urlPatterns = {"/ResetNewPassword"})
public class ResetNewPassword extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String username = request.getParameter("username");
        if (password != null && username != null) {
            if (password.equals(confirmPassword)) {
                UserClass objUserClass = new UserClass();
                if (objUserClass.resetPassword(username, password) != 0) {
                    response.sendRedirect("Logout");
                }
            }
        }

    }

}
