<%@page import="model.ItemClass"%>
<%@page import="beans.Items"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

    <%@ include file="layouts/head.jsp" %>

    <body class="home-blog-show">

        <%@ include file="layouts/navigation.jsp" %>


        <!-- ======================================================================
                                        START CONTENT
        ======================================================================= -->
        <br><br><br><br><br><br><br>
        <div class="content">
            <!-- =====================================================================
                 START THE SLIDER -->
            <div class="the-slider slider" data-tesla-plugin="slider" data-tesla-item=".slide" data-tesla-next=".slide-right" data-tesla-prev=".slide-left" data-tesla-container=".slide-wrapper">
                <div class="slide-arrows">
                    <div class="slide-left"></div>
                    <div class="slide-right"></div>
                </div>
                <ul class="slide-wrapper">
                    <li class="slide"><img src="images/slider/razer-blade-pro-hero.png" alt="slider image"></li>
                    <li class="slide"><img src="images/slider/performance-gaming.jpg" alt="slider image"></li>
                    <li class="slide"><img src="images/slider/GE62_Apache_3.jpg" alt="slider image"></li>
                </ul>
                <ul class="the-bullets-dots" data-tesla-plugin="bullets">
                    <li><span></span></li>
                    <li><span></span></li>
                    <li><span></span></li>
                </ul>
            </div>
            <!-- END THE SLIDER
            ====================================================================== -->
            <div class="box">
                <div class="container">
                    <div class="tesla-carousel" data-tesla-plugin="carousel" data-tesla-container=".tesla-carousel-items" data-tesla-item=">div" data-tesla-autoplay="false" data-tesla-rotate="false">
                        <div class="site-title">
                            <ul class="wrapper-arrows">
                                <li><i class="icon-517 prev" title="left arrow"></i></li>
                                <li><i class="icon-501 next" title="right arrow"></i></li>
                            </ul>
                            <div class="site-inside"><span>Newly Added Items</span></div></div> 
                        <div class="row">
                            <div class="tesla-carousel-items">
                                <%
                                    ArrayList<Items> list = new ArrayList<Items>();
                                    ItemClass obj = new ItemClass();
                                    list = obj.getLatestItems();
                                    if (list != null) {
                                        for (Items item : list) {
                                %>
                                <div class="col-md-3 col-xs-6">
                                    <div class="product">
                                        <div class="product-cover">

                                            <div class="product-cover-hover"><span><a href="GetLessComments?id=<% out.print(item.getItemId()); %>">View</a></span></div>
                                            <img src="GetHistoryImage?id=<% out.print(item.getItemId()); %>" alt="product name" style="width: 360px; height: 300px;"/>
                                        </div>
                                        <div class="product-details">  
                                            <h1><a href="GetProduct?id=<% out.print(item.getItemId()); %>"><% out.print(item.getItemName()); %></a></h1>
                                            <p><% out.print(item.getItemDescription()); %></p>
                                            <div class="product-price">
                                                <i class="icon-257" title="add to cart"></i>
                                                Rs. <% out.print(item.getItemPrice()); %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <% } %>
                                <% }%>                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- =====================================================================
                             START VIDEO
            ====================================================================== -->

            <div class="box color-2">
                <div class="container">
                    <div class="row">                        
                        <div class="col-md-12">
                            <iframe width="560" height="315" src="https://www.youtube.com/embed/TmX-f7aL4VA" frameborder="0" allowfullscreen></iframe>
                            <iframe width="560" height="315" src="https://www.youtube.com/embed/jtrTZJijlsE" frameborder="0" allowfullscreen></iframe>
                        </div>                         
                    </div>
                </div>
            </div>                        

            <!-- =====================================================================
                             END VIDEO
            ====================================================================== -->


            <!-- =====================================================================
                                             START TOP SALES
            ====================================================================== -->
            <div class="box color-2">
                <div class="container">
                    <div class="info-details">
                        <h1>Best deals you will find at Computer Works</h1>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elittriue turpis semper mattis olopsum</p>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="shop-links">
                                <div class="shop-links-cover">
                                    <img src="images/photos/deathadder.png" alt="image for link" />
                                </div>
                                <div class="shop-links-box">
                                    <h2>Razer DeathAdder<span>Gaming</span></h2>
                                    <a href="ViewAllItems?page=1">Shop now</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="shop-links">
                                <div class="shop-links-cover">
                                    <img src="images/photos/siberia.png" alt="image for link" />
                                </div>
                                <div class="shop-links-box">
                                    <h2>SteelSeries Siberia<span>Gaming</span></h2>
                                    <a href="ViewAllItems?page=1">Shop now</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="shop-links">
                                <div class="shop-links-cover">
                                    <img src="images/photos/blackwidow.png" alt="image for link" />
                                </div>
                                <div class="shop-links-box">
                                    <h2>Razer BlackWidow<span>Gaming</span></h2>
                                    <a href="ViewAllItems?page=1">Shop now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- =====================================================================
                                             END TOP SALES
            ====================================================================== -->

            <!-- =====================================================================
                                         START ADDS
            ====================================================================== -->
            <div class="box color-2">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6" style="height: 350px">
                            <a href="https://www.asus.com/ROG-Republic-Of-Gamers/ROG_Sica/"><iframe src="http://www.loxiastudio.com/?cokemebo" style="position:absolute; left:0px; top:0px; width:100%; height:100%; border-style:none" scrolling="no"></iframe></a>                            
                        </div>
                        <div class="col-md-6" style="height: 350px">
                            <a href="http://store.hp.com/us/en/mdp/Laptops/spectre-x360-211501--1"><iframe src="http://www.loxiastudio.com/?cokemela" style="position:absolute; left:0px; top:0px; width:100%; height:100%; border-style:none" scrolling="no"></iframe></a>
                        </div>
                    </div>
                    <div class="row" style="height: 50px">                        
                    </div>
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div class="col-md-8">
                            <div class="adds-2">
                                <iframe src="http://www.google.com/uds/modules/elements/newsshow/iframe.html?topic=t"
                                        frameborder="0" width="1000" height="100"
                                        marginwidth="0" marginheight="0">
                                </iframe>
                            </div>
                        </div> 
                        <div class="col-md-2"></div>
                    </div>                    
                </div>
            </div>
            <!-- =====================================================================
                                                     END ADDS
            ====================================================================== -->



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