<%-- 
    Document   : SearchResult
    Created on : May 1, 2016, 2:17:17 PM
    Author     : Pramudya Hashan
--%>



<%@page import="java.awt.Image"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

    <%@ include file="layouts/head.jsp" %>
    <%@page import="java.sql.ResultSet"%>
    <%@page import="java.sql.Statement"%>
    <%@page import="java.sql.DriverManager"%>
    <%@page import="java.sql.Connection"%>
    
    <body class="home-blog-show">

        <%@ include file="layouts/navigation.jsp" %>
        
        
        <!-- =====================================================================
                                            SearchResult
            ====================================================================== -->

       <div class="box">
                <div class="container">
                    
                        <div class="site-title">
                            <ul class="wrapper-arrows">
                                <li><i class="icon-517 prev" title="left arrow"></i></li>
                                <li><i class="icon-501 next" title="right arrow"></i></li>
                            </ul>
                            <div class="site-inside"><span>Search Result</span></div></div> 
                        <div class="row">
                            <div class="tesla-carousel-items">
            
                                
                                <% String VarName = request.getParameter("SearchProd");
                                
                                try
                                        {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        String url="jdbc:mysql://localhost/computer_works";
                                        String username="root";
                                        String password="";
                                        String query="select * from items WHERE itemName like '%"+VarName+"%'";
                                        Connection conn=DriverManager.getConnection(url,username,password);
                                        Statement stmt=conn.createStatement();
                                       
                                        ResultSet rs=stmt.executeQuery(query);
                                    
                                        while(rs.next())
                                        {

                                        %>
                                        
                                       
                                        
                                <div class="col-md-3 col-xs-6">
                                    <div class="product">
                                         <div class="product-cover">
                                            <div class="product-cover-hover"><span><a href="product.html">View</a></span>
                                            </div>
                                             <img src="GetHistoryImage?id=<%=rs.getInt("itemID")%>" alt="product name" />
                                         </div>    
                                        
                                        <!-- =======   Items We want to display ======== -->
                                        <div class="product-details"> 
                                            <h1><a href="GetProduct?id=<%out.print(rs.getInt("itemID")); %>"><%=rs.getString("itemName") %></a></h1>                                            
                                            <p><%=rs.getString("itemDescription") %></p>
                                            <div class="product-price">
                                                <i class="icon-257" title="add to cart"></i>
                                                <%=rs.getDouble("itemPrice")%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            
                                                <%

                                        }
                                        %>

                                            <%
                                            rs.close();
                                            stmt.close();
                                            conn.close();
                                            }
                                        catch(Exception e)
                                        {
                                            e.printStackTrace();
                                            }
                                            %>

                                
                                
                           
                            </div>
                        </div>
                </div>
       </div>
                            
    


            <!-- =====================================================================
                                            Suggestions
            ====================================================================== -->
            <div class="box color-2">
                <div class="container">
                    <div class="info-details">
                    <h1>Suggested Products</h1>
                    <p>Similar Products</p>
                    </div>
                  
                    
                    <%
                     try
                                        {
                                           
                                            
                                         Class.forName("com.mysql.jdbc.Driver");
                                        String url="jdbc:mysql://localhost/computer_works";
                                        String username="root";
                                        String password="";
                                        String query="select * from items WHERE itemCategory in ((select itemCategory from items where itemName like '%"+VarName+"%'))";
                                        Connection conn=DriverManager.getConnection(url,username,password);
                                        Statement stmt=conn.createStatement();
                                        
                                        ResultSet rs=stmt.executeQuery(query);
                                    
                                        while(rs.next())
                                        {
                                            
                                      %>
                                      
                                        
                                <div class="col-md-3 col-xs-6">
                                    <div class="product">
                                         <div class="product-cover">
                                            <div class="product-cover-hover"><span><a href="product.html">View</a></span>
                                            </div>
                                            <img src="GetHistoryImage?id=<%=rs.getInt("itemID")%>" alt="product name" />
                                         </div>    
                                        
                                        <!-- =======   Items We want to display ======== -->
                                        
                                        
                                        <div class="product-details"> 
                                            <h1><a href="GetProduct?id=<%out.print(rs.getInt("itemID"));%>"><%=rs.getString("itemName") %></a></h1>                                            
                                            <p><%=rs.getString("itemDescription") %></p>
                                            <div class="product-price">
                                                <i class="icon-257" title="add to cart"></i>
                                                <%=rs.getDouble("itemPrice")%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            
                                                <%

                                        }
                                        %>

                                            <%
                                            rs.close();
                                            stmt.close();
                                            conn.close();
                                            }
                                        catch(Exception e)
                                        {
                                            e.printStackTrace();
                                            }
                                            %>
                    
                </div>
            </div>
            <!-- =====================================================================
                                             END Suggestions
            ====================================================================== -->
            
            
  

        
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