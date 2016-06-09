package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Comments;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "InsertComment", urlPatterns = {"/InsertComment"})
public class InsertComment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String comment = request.getParameter("comment");
        
        if(id != null && name != null && comment != null){
            Comments objComments = new Comments();
            PrintWriter out = response.getWriter();
            if(objComments.insertComment(id, name, comment) != 0){
                out.print("true");
            }else{
                out.print("false");
            }                
        }

    }

}
