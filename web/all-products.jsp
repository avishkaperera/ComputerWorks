<%@page import="beans.Items"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="layouts/head.jsp" %>
    <body class="home-blog-show">
        <!-- ======================================================================
                                        START SCRIPTS
        ======================================================================= -->
           <%@ include file="layouts/navigation.jsp" %>
        <!-- ======================================================================
                                        END HEADER
        ======================================================================= -->  

        <!-- ======================================================================
                                        START CONTENT
        ======================================================================= -->
        <div class="content">
            <div class="container">
                <div class="all-products-details">
                    <div class="row">
                        <div class="col-md-7"><h2>Products / ALL</h2></div>
              
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3">
                        <div class="row">
                            <div class="col-md-12 col-xs-6">
                                <div class="products-dropdown open-dropdown">
                                    <span>Categories</span>
                                    <ul>
                                        <li><a href="ViewItems?page=1&category=motherboard">Motherboards</a></li>
                                        <li><a href="ViewItems?page=1&category=cpu">CPU</a></li>
                                        <li><a href="ViewItems?page=1&category=ram">RAM</a></li>
                                        <li><a href="ViewItems?page=1&category=storage">Storage</a></li>
                                        <li><a href="ViewItems?page=1&category=powersupply">Cases &amp; Power Supplies</a></li>
                                        <li><a href="ViewItems?page=1&category=displays">Displays</a></li>
                                        <li><a href="ViewItems?page=1&category=inputdevice">Input Devices</a></li>
                                        <li><a href="ViewItems?page=1&category=outputdevices">Output Devices</a></li>
                                     </ul>
                                </div>
                                <div class="clear"></div>
                            </div>
                        
                        </div>
                    </div>
                    <% 
                        ArrayList<Items> list = (ArrayList<Items>)request.getAttribute("products");
                        int id = 0;
                        int currentPage = Integer.parseInt(request.getAttribute("currentPage").toString());
                        int noOfPages = Integer.parseInt(request.getAttribute("noOfPages").toString());
                        if(list != null){
                    %>
                    <div class="col-md-9">
                        <div class="row">
                            <% for(Items item:list){ %>
                            <% id = item.getItemId(); %>
                            <div class="col-md-4">
                                <div class="product">
                                    <div class="product-cover">
                                        <div class="product-cover-hover"><span><a href="GetProduct?id=<% out.print(item.getItemId()); %>">View</a></span></div>
                                        <img src="GetHistoryImage?id=<% out.print(item.getItemId()); %>" alt="product name" style="height: 300"/>
                                    </div>    
                                    <div class="product-details">
                                        <form method="POST" action="CartControllerNew" id="formCart<% out.print(item.getItemId()); %>">
                                            <input type="hidden" name="modelNo" value="<% out.print(item.getItemId()); %>">    
                                            <input type="hidden" name="name" value="<% out.print(item.getItemName()); %>">    
                                            <input type="hidden" name="description" value="<% out.print(item.getItemDescription()); %>">    
                                            <input type="hidden" name="price" value="<% out.print(item.getItemPrice()); %>">    
                                            <input type="hidden" name="quantity" value="1">
                                            <input type="hidden" name="action" value="add">
                                        <h1><a href="GetProduct?id=<% out.print(item.getItemId()); %>"><% out.print(item.getItemName()); %></a></h1>                                        
                                        <p><% out.print(item.getItemDescription()); %></p>
                                        <div class="product-price">                                            
                                            <i class="icon-257" title="add to cart" onclick="document.getElementById('formCart<% out.print(item.getItemId()); %>').submit();"></i>
                                            Rs. <% out.print(item.getItemPrice()); %>
                                        </div>
                                        </form>
                                    </div>
                                </div>
                            </div> 
                            <% } %>
                            <% } %>
                        </div>
                        <ul class="page-numbers">
                            <% if(currentPage != 1){ %>
                            <li><a class="page-numbers" href="ViewAllItems?page=<% out.print(currentPage - 1); %>">Previous</a></li>
                            <% } %>
                            <% for(int i=1;i<=noOfPages;i++){ %>
                            <% if(i == currentPage){ %>
                            <li><a class="page-numbers"><% out.print(i); %></a></li>
                            <% }else{ %>
                            <li><a class="page-numbers" href="ViewAllItems?page=<% out.print(i); %>"><% out.print(i); %></a></li>
                            <% } %>
                            <% } %>
                            <% if(currentPage < noOfPages){ %>
                            <li><a class="page-numbers" href="ViewAllItems?page=<% out.print(currentPage + 1); %>">Next</a></li>
                            <% } %>                            
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- ======================================================================
                                        END CONTENT
        ======================================================================= -->

        <!-- ======================================================================
                                        START FOOTER
        ======================================================================= -->
          <%@ include file="layouts/footer.jsp" %>
        <!-- ======================================================================
                                        END FOOTER
        ======================================================================= -->

      
    </body>

</html>