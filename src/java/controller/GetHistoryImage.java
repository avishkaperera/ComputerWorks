package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Transaction;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "GetHistoryImage", urlPatterns = {"/GetHistoryImage"})
public class GetHistoryImage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        if (request.getParameter("id") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            Transaction obj = new Transaction();
            ServletOutputStream printImage = response.getOutputStream();
            byte[] image = obj.getImage(id);
            response.setContentType("image/jpeg");
            printImage.write(image);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
