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
@WebServlet(name = "ViewItems", urlPatterns = {"/ViewItems"})
public class ViewItems extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int page = 1;
        int recordsPerPage = 3;
        String cat = "";
        ArrayList<Items> list = null;
        ItemClass objItemClass = new ItemClass();
        
        if (request.getParameter("page") != null && request.getParameter("category") != null) {
            page = Integer.parseInt(request.getParameter("page"));
            cat = request.getParameter("category");
        }
        
        list = objItemClass.getAllProductsByCategory(cat,(page - 1) * recordsPerPage, recordsPerPage);

        int noOfRecords = objItemClass.getNoOfRecords();
        int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);

        request.setAttribute("products", list);
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        request.getRequestDispatcher("all-products.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
