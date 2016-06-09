package controller;

import beans.Items;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Transaction;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "PurchaseHistory", urlPatterns = {"/PurchaseHistory"})
public class PurchaseHistory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        if(username != null){
            Transaction obj = new Transaction();
            if(obj.getPurchaseHistory(username)!=null){
                ArrayList<Items> list = obj.getPurchaseHistory(username);
                request.setAttribute("history", list);
                request.getRequestDispatcher("purchase-history.jsp").forward(request, response);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
