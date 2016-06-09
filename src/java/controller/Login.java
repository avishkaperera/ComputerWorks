package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.User;
import javax.servlet.http.HttpSession;
import model.CookieClass;
import model.UserClass;

/**
 *
 * @author Avishka Perera
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User objUser = new User();
        UserClass objUserClass = new UserClass();
        objUser.setUsername(request.getParameter("login-username"));
        objUser.setPassword(request.getParameter("login-password"));
        String password = User.encryptPassword(objUser.getPassword(), objUser.getUsername());
        if (objUserClass.validateLogin(objUser.getUsername(), password)) {

            if (request.getParameter("save") != null && request.getParameter("save").equals("true")) {
                response.addCookie(CookieClass.setCookie("userId", objUser.getUsername(),60*60*24*365*20));
                response.addCookie(CookieClass.setCookie("pass", password,60*60*24*365*20));
            }

            response.sendRedirect("home.jsp");
            HttpSession session = request.getSession();
            session.setAttribute("userId", objUser.getUsername());

        } else {
            request.setAttribute("loginError", "Invalid Username or Password !");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }

}
