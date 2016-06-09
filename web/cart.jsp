<!DOCTYPE html>
<html lang="en">
    <%@ include file="layouts/head.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <body>
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
                <h2>Shopping cart</h2>

                <div class="shopping-cart">
                    <div class="shopping-cart-products">
                        <ul class="shopping-product-detail">
                            <li class="shopping-1">Product image</li>
                            <li class="shopping-2">Product name</li>
                            <li class="shopping-3">Description</li>
                            <li class="shopping-4">Quantity</li>
                            <li class="shopping-5">Unit price</li>
                            <li class="shopping-6">Total</li>                             
                        </ul>

                        <jsp:useBean id="cart" scope="session" class="model.CartBean" />
                        <c:forEach var="cartItem" items="${cart.cartItems}" varStatus="counter">
                            <form method="POST" action="CartControllerNew" id="deleteCart<c:out value="${cartItem.partNumber}"/>">
                                <ul class="shopping-product-detail">
                                    <li class="shopping-1">
                                        <img src="GetHistoryImage?id=<c:out value="${cartItem.partNumber}"/>" alt="product image" />
                                    </li>
                                    <li class="shopping-2">
                                        <a href="GetProduct?id=<c:out value="${cartItem.partNumber}"/>"><c:out value="${cartItem.name}"/></a>                                
                                    </li>
                                    <li class="shopping-3">                                
                                        <p><c:out value="${cartItem.modelDescription}"/></p>
                                    </li>
                                    <li class="shopping-4">                                
                                        <input type="number" step="1" min="1" name="quantity" value="<c:out value="${cartItem.quantity}"/>" title="Qty" class="input-text qty text">                                
                                    </li>
                                    <li class="shopping-5">
                                        Rs. <c:out value="${cartItem.unitCost}"/>
                                    </li>
                                    <li class="shopping-6">
                                        Rs. <c:out value="${cartItem.totalCost}"/>
                                        <button onclick="document.getElementById('deleteCart<c:out value="${cartItem.partNumber}"/>')">X</button>                                        
                                    </li>                                      
                                </ul>     
                                <input type="hidden" name="action" value="Delete">
                                <input type="hidden" name="itemIndex" value="<c:out value="${counter.count}"/>">
                            </form>
                        </c:forEach>
                    </div>

                    <div class="row">
                        <div class="col-md-3">
                            <a href="ViewAllItems?page=1" class="button-7">Continue shopping</a>
                        </div>
                        <div class="col-md-5"></div>
                        <div class="col-md-4">
                            <div class="checkout-total">                                
                                <p>Total : Rs. <c:out value="${cart.orderTotal}"/> </p>

                                <form method="POST" action="http://www.sandbox.paypal.com/cgi-bin/websrc" id="paypal">
                                    <input type="hidden" name="upload" value="1" />
                                    <input type="hidden" name="return" value="PaypalController?PassID=true"/>
                                    <input type="hidden" name="cmd" value="_cart"/>
                                    <input type="hidden" name="business" value="finalprojectj2ee@gmail.com"/>

                                    <c:forEach var="cartItem" items="${cart.cartItems}" varStatus="counter">
                                        <input type="hidden" name="item_name_${counter.count}" value="${cartItem.modelDescription}" />
                                        <input type="hidden" name="item_number_${counter.count}" value="${counter.count}"/>
                                        <input type="hidden" name="amount_${counter.count}" value="${cartItem.unitCost}"/>
                                        <input type="hidden" name="quantity_${counter.count}" value="${cartItem.quantity}"/>
                                    </c:forEach>
                                    <% if(session.getAttribute("userId") != null){ %>
                                    <button class="button-6" onclick="document.getElementById('paypal').submit();">Checkout</button> 
                                    <% } else { %>                                    
                                </form>
                                <button class="button-6" onclick="location.href = 'register.jsp'">Login to continue</button>
                                <% } %>
                            </div>
                        </div>
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