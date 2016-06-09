package controller;

import beans.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserClass;
import org.apache.catalina.users.AbstractUser;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "UpdateProfile", urlPatterns = {"/UpdateProfile"})
public class UpdateProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        User obj = new User();
        UserClass objUserClass = new UserClass();
        obj.setFname(request.getParameter("fname"));
        obj.setLname(request.getParameter("lname"));
        obj.setEmail(request.getParameter("email"));
        obj.setAddress(request.getParameter("address"));
        obj.setContact(request.getParameter("contact"));
        obj.setUsername(request.getParameter("username"));
        
        if(objUserClass.updateUser(obj) != 0){
            response.getWriter().write("true");
        }else{
            response.getWriter().write("false");
        }
                

    }

}
