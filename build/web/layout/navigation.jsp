        <!-- ======================================================================
                                        START SCRIPTS
        ======================================================================= -->
        <div class="header">
            <div class="container">
      
                <div class="header-middle-info">
              
                    <div class="col-md-8">
                        <ul class="header-middle-account">
                              <li><a href="register.jsp">  <i class="icon-351" title="Login"></i> Login</a></li><li>|</li>
                            <li><a href="#"><i class="icon-330" title="My account"></i> My account </a></li>
                    </ul>
                    </div>
                    <div class="clear"></div>
                    
                </div>
                <div class="menu">
                   <div class="top-pad">
                    <div class="col-md-4">
                        <div class="logo">
                            <a href="index.jsp">
                                <img src="images/elements/cw-logo.png" alt="site logo" />
                            </a>
                        </div>
                    </div>
                    <div class="search-cart">
                       
                        <form class="search">
                            <input type="text" class="search-line" placeholder="Search" name="serch" />
                            <input type="submit" value="" class="search-button" />
                        </form>
                      
                        <div class="cart-all">
                            <a href="cart.jsp"><i class="icon-19" title="19"></i>My Cart</a>
                            <div class="inside-cart">
                                <p>2 products in the shopping cart</p>
                          <ul>
                                    <li>
                                        <div class="inside-cart-image"><img src="images/photos/image-9.jpg" alt="product name" /></div>
                                        <button>x</button>
                                        <a href="product.jsp">Item Name</a>
                                        <p>Unit price 50$</p>
                                        <p>Qty: 1</p>
                                    </li>
                                    <li>
                                        <div class="inside-cart-image"><img src="images/photos/image-8.jpg" alt="product name" /></div>
                                        <button>x</button>
                                        <a href="product.jsp">Item Name</a>
                                        <p>Unit price 75$</p>
                                        <p>Qty: 2</p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="repsonsive-menu"><i class="icon-406" title="406"></i> Menu</div>
                    <ul>
                        <li class="${pageContext.request.requestURI == '/ComputerWorks/index.jsp' ? 'active' : ''} ${pageContext.request.requestURI == '/ComputerWorks/' ? 'active' : ''}"><a href="index.jsp">Home</a></li>
                        <li class="${pageContext.request.requestURI == '/ComputerWorks/all-products.jsp' ? 'active' : ''}"><a href="all-products.jsp">Shop</a></li>
                        <li class="${pageContext.request.requestURI == '/ComputerWorks/contact.jsp' ? 'active' : ''}"><a href="contact.jsp">Contact</a></li>
                        <li class="${pageContext.request.requestURI == '/ComputerWorks/about.jsp' ? 'active' : ''}"><a href="about.jsp">About Us</a></li>
                    </ul>
                    <div class="clear"></div>
                   
                </div>
                </div>
            </div>
        </div><br><br><br><br><br><br><br>
        <!-- ======================================================================
                                        END HEADER
        ======================================================================= -->  