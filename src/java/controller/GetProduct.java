package controller;

import beans.Items;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ItemClass;

/**
 *
 * @author Avishka Perera
 */
@WebServlet(name = "GetProduct", urlPatterns = {"/GetProduct"})
public class GetProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("id") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            ItemClass obj = new ItemClass();
            ArrayList<Items> list = obj.getOneItem(id);
            request.setAttribute("item", list);
            request.getRequestDispatcher("product.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
