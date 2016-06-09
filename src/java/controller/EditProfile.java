package controller;

import beans.User;
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
@WebServlet(name = "EditProfile", urlPatterns = {"/EditProfile"})
public class EditProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        if(username != null){
            UserClass obj = new UserClass();
            if(obj.getUser(username) != null){
                User user = obj.getUser(username);
                request.setAttribute("user", user);
                request.getRequestDispatcher("edit-profile.jsp").forward(request, response);
            }
        }        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
