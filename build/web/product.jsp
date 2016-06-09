<%@page import="beans.Items"%>
<%@page import="beans.Review"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Comments"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="layouts/head.jsp" %>
    <body class="home-blog-show">
        <div class="modal fade" id="write-review" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-review">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h3>Write a review</h3>
                    <%
                        ArrayList<Items> list = (ArrayList<Items>) request.getAttribute("item");
                        if (list != null) {
                            Items item = list.get(0);
                    %>
                    <div id="comment-frm">
                        <form name="comment-form" onsubmit="return insertComment(<% out.print(item.getItemId()); %>)" method="POST" action="">
                            <p>Name</p>
                            <p id="e-name" style="color:red"></p>
                            <input class="input-line" name="commentor-name" type="text">                                                
                            <p>Your review</p>
                            <p id="e-comment" style="color:red"></p>
                            <textarea class="text-area" name="comment"></textarea>
                            <input type="submit" class="button-6" style="display: inline" value="Write a review">
                            <p id="loading" style="display: inline;visibility: hidden;"><img src="images/loader/ajax-loader.gif" alt="Loading" height="20" width="20">&nbsp;&nbsp;Processing...</p>
                        </form>
                    </div>

                </div>
            </div>
        </div>

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
                        <div class="col-md-6">
                            <div class="the-slider product-big-image" data-tesla-plugin="slider" data-tesla-item=".slide" data-tesla-next=".product-image-arrows-right" data-tesla-prev=".product-image-arrows-left" data-tesla-container=".slide-wrapper">                                
                                <ul class="slide-wrapper">
                                    <li class="slide"><img src="GetHistoryImage?id=<% out.print(item.getItemId()); %>" alt="product image" /></li>

                                </ul>

                            </div>
                        </div>
                        <div class="col-md-6">
                            <h2><% out.print(item.getItemName()); %></h2>

                            <div class="clear"></div>
                            <div class="quantity">
                                <input type="button" value="-" class="minus">
                                <input type="number" step="1" min="1" name="quantity" value="1" title="Qty" class="input-text qty text">
                                <input type="button" value="+" class="plus">

                            </div>
                            <hr/>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="product-price">PRICE : Rs. <% out.print(item.getItemPrice()); %></div>
                                </div>
                                <div class="col-md-6">
                                    <a href="#" class="button-2">add to shopping cart</a>

                                </div>
                            </div>
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#description" data-toggle="tab">Description</a></li>
                                <li class=""><a href="#reviews" data-toggle="tab">Reviews</a></li>

                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane active" id="description">                                    
                                    <p><% out.print(item.getItemDescription()); %></p>
                                    <ul class="product-details">

                                        <li>Brand - <% out.print(item.getItemBrand()); %></li>
                                        <li>Category - <% out.print(item.getItemCategory()); %></li>
                                        <li>Warranty - <% out.print(item.getItemWarranty()); %> Years</li>

                                    </ul>
                                    <p style="color:red" id="display-here"></p>
                                </div>
                                <div class="tab-pane" id="reviews"> 

                                    <%
                                        ArrayList<Review> reviewList = item.getList();
                                        String id = null;
                                    %>                                    
                                    <% if (reviewList != null) { %>
                                    <% for (Review obj : reviewList) { %> 
                                    <% id = obj.getProductId(); %>
                                    <div class="product-review">                                         
                                        <div class="product-review-author"><% out.print(obj.getName()); %><span><% out.print(obj.getTimestamp()); %></span></div>
                                        <p id="comment"><% out.print(obj.getComment()); %></p>                                        
                                    </div> 

                                    <% }
                                        } %>

                                    <a href="#" class="button-6" data-toggle="modal" data-target="#write-review">Write a review</a>
                                    <% if (list.size() == 1) { %>                                    
                                    <a href="GetAllComments?id=<% out.print(id); %>&page=1" class="active button-6">View All Reviews</a>
                                    <% }%>
                                </div>
                            </div> 
                        </div>
                        <% }%>
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