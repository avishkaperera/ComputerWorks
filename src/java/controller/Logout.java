package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CookieClass;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "Logout", urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            Cookie userId = CookieClass.setCookie("userId", "", 0);
            Cookie passWord = CookieClass.setCookie("pass", "", 0);
            if (userId != null && passWord != null) {
                response.addCookie(userId);
                response.addCookie(passWord);
                if (session.getAttribute("userId") != null) {
                    session.removeAttribute("userId");
                }
                response.sendRedirect("register.jsp");
            } else {
                response.sendRedirect("register.jsp");
            }
        } else {
            response.sendRedirect("register.jsp");
        }

    }
}
