package controller;

import beans.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Email;
import model.UserClass;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User objUser = new User();
        UserClass objUserClass = new UserClass();
        Email objEmail = new Email();
        objUser.setFname(request.getParameter("fname"));
        objUser.setLname(request.getParameter("lname"));
        objUser.setEmail(request.getParameter("email"));
        objUser.setAddress(request.getParameter("address"));
        objUser.setContact(request.getParameter("contact"));
        objUser.setUsername(request.getParameter("username"));
        objUser.setPassword(request.getParameter("password"));
        String re_pass = request.getParameter("repassword");

        if (!objUser.getPassword().equals(re_pass)) {
            request.setAttribute("registerError", "Password does not match !");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else if (!checkNullValues(objUser)) {
            request.setAttribute("registerError", "Fields cannot be blank !");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else if (objUserClass.registerUser(objUser) != 0) {
            objEmail.sendVerification(objUser);
            response.getWriter().print("Registeration was Successful! Please check your inbox for confirmation email. Thank you!");
        } else {
            request.setAttribute("registerError", "This Username is already taken !");
            request.getRequestDispatcher("register.jsp").forward(request, response);            
        }
    }

    boolean checkNullValues(User obj) {
        if (obj.getFname() == null || obj.getFname().equals("")) {
            return false;
        } else if (obj.getLname() == null || obj.getLname().equals("")) {
            return false;
        } else if (obj.getEmail() == null || obj.getEmail().equals("")) {
            return false;
        } else if (obj.getAddress() == null || obj.getAddress().equals("")) {
            return false;
        } else if (obj.getUsername() == null || obj.getUsername().equals("")) {
            return false;
        } else if (obj.getPassword() == null || obj.getPassword().equals("")) {
            return false;
        }else if (obj.getContact()== null || obj.getContact().equals("")) {
            return false;
        } else {
            return true;
        }
    }

}
