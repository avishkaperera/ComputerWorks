<%@page import="beans.Review"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Comments"%>
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
            <div class="product-one">
                <div class="container">
                    <div class="row">
                        <div class="col-md-2"></div>                        
                        <div class="col-md-8">
                            <% ArrayList<Review> list = new ArrayList<Review>();
                                list = (ArrayList<Review>)request.getAttribute("allComments");
                                String id = null;
                                int currentPage = Integer.parseInt(request.getAttribute("currentPage").toString());
                                int noOfPages = Integer.parseInt(request.getAttribute("noOfPages").toString());
                            %>
                            <% for(Review obj:list){ %>
                            <% id = obj.getProductId(); %>
                            <div class="product-review">                                         
                                <div class="product-review-author"><% out.print(obj.getName()); %><span><% out.print(obj.getTimestamp()); %></span></div>
                                <p id="comment"><% out.print(obj.getComment()); %></p>                                        
                            </div> 
                            <% } %>
                            <% if(currentPage != 1){ %>
                            <a href="GetAllComments?id=<% out.print(id); %>&page=<% out.print(currentPage-1); %>">Previous</a>
                            <% } %>
                            <% for(int i=1;i<=noOfPages;i++){ %>
                            <% if(i == currentPage){ %>
                            <% out.print(i); %>
                            <% }else{ %>
                            <a href="GetAllComments?id=<% out.print(id); %>&page=<% out.print(i); %>"> <% out.print(i); %> </a>
                            <% } %>
                            <% } %>
                            <% if(currentPage < noOfPages){ %>
                            <a href="GetAllComments?id=<% out.print(id); %>&page=<% out.print(currentPage+1); %>">Next</a>
                            <% } %>
                        </div>
                        <div class="col-md-2"></div>
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