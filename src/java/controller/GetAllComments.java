package controller;

import beans.Review;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "GetAllComments", urlPatterns = {"/GetAllComments"})
public class GetAllComments extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int page = 1;
        int recordsPerPage = 5;
        if(request.getParameter("page") != null && request.getParameter("id") != null){
            page = Integer.parseInt(request.getParameter("page"));
        }        
        Comments objComments = new Comments();
        ArrayList<Review> list = objComments.getAllComments(request.getParameter("id"), (page-1)*recordsPerPage, recordsPerPage);
        int noOfRecords = objComments.getNoOfRecords();
        int noOfPages = (int)Math.ceil(noOfRecords * 1.0 / recordsPerPage);
        request.setAttribute("allComments", list);
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        request.getRequestDispatcher("view-comments.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
