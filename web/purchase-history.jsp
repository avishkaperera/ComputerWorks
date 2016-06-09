<%@page import="beans.Items"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
    <jsp:include page="layouts/head.jsp" />   
    <body>	
        <%@ include file="layouts/navigation.jsp" %>
        <section class="content">
            <div class="search_container">
                <div class="list_container">
                    <table id="check_1" class="table table-striped table-hover table-bordered chbox">
                        <thead>
                            <tr>
                                <td class="col-md-4">Item Image</td>
                                <td class="col-md-8">Item Details</td>                                         
                            </tr>
                        </thead>
                        <tbody class="searchable">
                            <%
                                ArrayList<Items> list = new ArrayList<Items>();
                                list = (ArrayList<Items>) request.getAttribute("history");
                            %>
                            <% if (list != null) { %>
                            <% for (Items item : list) { %>
                            <tr>
                                <td><img src='GetHistoryImage?id=<% out.print(item.getItemId()); %>' class='img-polaroid' alt='Product Image' width="250px" height="150x"></td>
                                <td >
                                    <h3><% out.print(item.getItemName()); %></h3>                                                                        
                                    <ul>
                                        <li>Qty : <% out.print(item.getItemQuantity()); %> units</li>                                        
                                        <li>Price : Rs. <% out.print(item.getItemPrice()); %></li>                                        
                                    </ul>
                                </td>
                            </tr>
                            <% } %>
                            <% }%>

                        </tbody>                    
                    </table>
                </div>
            </div>
        </section>
        <%@ include file="layouts/footer.jsp" %>
    </body>
</html>
