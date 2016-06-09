package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CheckUsername", urlPatterns = {"/CheckUsername"})
public class CheckUsername extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        UserClass objUserClass = new UserClass();
        if(objUserClass.checkUsername(username)){
            out.print("This Username is already taken !");
        }else{
            out.print("");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

    }

}
