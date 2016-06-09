<!-- ======================================================================
                                START SCRIPTS
======================================================================= -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="header">
    <div class="container">

        <div class="header-middle-info">

            <div class="col-md-8"  id="primary_nav_wrap">
                <ul class="header-middle-account">
                    <% if (session.getAttribute("userId") != null) {%>                                        
                    <li><a href="#"><i class="icon-330" title="My account"></i> <% out.println("Hello! <b>" + session.getAttribute("userId") + "</b>");%> </a>
                        <ul>             
                            <% if (session.getAttribute("userId") != null) { %>
                            <li><a href="PurchaseHistory?username=<% out.print(session.getAttribute("userId")); %>">Purchase history</a></li>
                                <% } %>
                                <% if (session.getAttribute("userId") != null) { %>
                            <li><a href="EditProfile?username=<% out.print(session.getAttribute("userId")); %>">Edit Profile Information</a></li>
                                <% } %>                            
                            <li><a href="resetpassword.jsp">Reset Password</a></li>
                        </ul>
                    </li>
                    |<li><a href="Logout">  <i class="icon-351" title="Logout"></i> Sign Out <% } else {%> </a></li><li></li>
                    <li><a href="register.jsp">  <i class="icon-351" title="Login"></i> Sign In <% }%> </a></li><li></li>
                </ul>
            </div>
            <div class="clear"></div>

        </div>

        <div class="menu">
            <div class="top-pad">
                <div class="col-md-4">
                    <div class="logo">
                        <a href="index.jsp">
                            <img src="images/elements/cw-logo.png" alt="site logo"  />
                        </a>
                    </div>
                </div>
                <div class="search-cart">

                    <form class="search" action="search-result.jsp" method="GET">
                        <input type="text" class="search-line" placeholder="Search" name="SearchProd" />
                        <input type="submit" value="" class="search-button" />
                    </form>

                    <div class="cart-all">
                        <a href="cart.jsp"><i class="icon-19" title="19"></i>My Cart</a>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="repsonsive-menu"><i class="icon-406" title="406"></i> Menu</div>
                <ul>
                    <li class="${pageContext.request.requestURI == '/ComputerWorks/index.jsp' ? 'active' : ''} ${pageContext.request.requestURI == '/ComputerWorks/' ? 'active' : ''}"><a href="index.jsp">Home</a></li>
                    <li class="${pageContext.request.requestURI == '/ComputerWorks/all-products.jsp' ? 'active' : ''}"><a href="ViewAllItems?page=1">Shop</a></li>
                    <li class="${pageContext.request.requestURI == '/ComputerWorks/contact.jsp' ? 'active' : ''}"><a href="contact.jsp">Contact</a></li>
                    <li class="${pageContext.request.requestURI == '/ComputerWorks/about.jsp' ? 'active' : ''}"><a href="about.jsp">About Us</a></li>
                </ul>
                <div class="clear"></div>

            </div>
        </div>
    </div>
</div>
<!-- ======================================================================
                                END HEADER
======================================================================= -->  