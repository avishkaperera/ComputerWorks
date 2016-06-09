<!DOCTYPE html>
<html lang="en">
  <%@ include file="layouts/head.jsp" %>
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
                <div class="row">
                    <div class="clear"></div>
                    <div class="col-md-12">
                        <div class="order-title">Your order</div>
                        <div class="row">
                            <div class="col-md-9">
                                <ul class="checkout-info">
                                    <li class="checkout-info-1">Product</li>
                                    <li class="checkout-info-2">Total</li>
                                </ul>

                                <div class="checkout-info-box">
                                    <!-- REPEAT PRODUCT -->
                                    <ul class="checkout-product">
                                        <li class="checkout-product-1">item name x1</li>
                                        <li class="checkout-product-2">$ 350</li>
                                    </ul>
                                    <!-- REPEAT PRODUCT -->
                                    <ul class="checkout-product">
                                        <li class="checkout-product-1">item name x1</li>
                                        <li class="checkout-product-2">$ 200</li>
                                    </ul>

                                    <ul class="checkout-product">
                                        <li class="checkout-product-1">iteam name x6</li>
                                        <li class="checkout-product-2">$ 3650</li>
                                    </ul>


                                    <!-- CART DETAILS -->
                                    <ul class="checkout-product o-last">
                                        <li class="checkout-product-1">Cart Subtotal</li>
                                        <li class="checkout-product-2">$ 4200</li>
                                    </ul>
                                    <ul class="checkout-product o-last">
                                        <li class="checkout-product-1">Shipping</li>
                                        <li class="checkout-product-2">Free shipping</li>
                                    </ul>
                                    <ul class="checkout-product last">
                                        <li class="checkout-product-1">Order total</li>
                                        <li class="checkout-product-2">$ 4200</li>
                                    </ul>
                                    <!-- CART DETAILS -->
                                </div>

                            </div>
                            <div class="col-md-3">

                                <a href="#" class="button-6">place order</a>
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