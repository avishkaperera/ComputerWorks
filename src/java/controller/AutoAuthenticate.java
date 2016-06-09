package controller;

import beans.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserClass;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "AutoAuthenticate", urlPatterns = {"/AutoAuthenticate"})
public class AutoAuthenticate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User objUser = new User();
        UserClass objUserClass = new UserClass();
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("userId")) {
                    objUser.setUsername(cookies[i].getValue());
                    continue;
                }
                if (cookies[i].getName().equals("pass")) {
                    objUser.setPassword(cookies[i].getValue());
                    continue;
                }
            }
            if (objUser.getUsername() != null && objUser.getPassword() != null) {
                if (objUserClass.validateLogin(objUser.getUsername(), objUser.getPassword())) {
                    response.sendRedirect("home.jsp");                    
                    session.setAttribute("userId", objUser.getUsername());
                } else {
                    response.sendRedirect("register.jsp");
                }
            } else if (session.getAttribute("userId") != null) {
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("home.jsp");
            }
        } else {
            response.sendRedirect("home.jsp");
        }

    }
}
