
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
@WebServlet(name = "VerifyAccount", urlPatterns = {"/VerifyAccount"})
public class VerifyAccount extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserClass objUserClass = new UserClass();
        if(request.getParameter("verify") != null && request.getParameter("verify").equals("true")){
            if(objUserClass.verifyAccount(request.getParameter("user")) != 0){
                response.sendRedirect("register.jsp");
            }
        }
    }

}
