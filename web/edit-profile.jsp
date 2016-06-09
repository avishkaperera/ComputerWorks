<%@page import="beans.User"%>
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
                    <div class="col-md-2"></div>
                    <div class="col-md-8" id="msg">
                        <form class="register-form" name="update-form" onsubmit="return updateProfile()" id="reg-form" method="POST">
                            <h3>Edit Profile Information</h3>
                            <% User obj = (User)request.getAttribute("user"); %>
                            <% if(obj != null){ %>
                            <div class="row">
                                <div class="col-md-6">                                    
                                    <p style="display:inline;">First Name&nbsp;</p>
                                    <p style="display:inline;color: red;" id="update-fname"></p>                                    
                                    <input type="text" name="fname" class="input-line" value="<% out.print(obj.getFname()); %>">
                                </div>
                                <div class="col-md-6">
                                    <p style="display:inline;">Last Name</p>
                                    <p style="display:inline;color: red;" id="update-lname"></p>                                    
                                    <input type="text" name="lname" class="input-line" value="<% out.print(obj.getLname()); %>">
                                </div>
                            </div>      
                            
                            <p style="display: inline">E-mail</p>
                            <p style="display:inline;color: red;" id="update-email"></p>                                    
                            <input type="text" name="email" class="input-line" value="<% out.print(obj.getEmail()); %>">
                            
                            <p style="display: inline">Address</p>
                            <p style="display:inline;color: red;" id="update-address"></p>                                    
                            <input type="text" name="address" class="input-line" value="<% out.print(obj.getAddress()); %>">
                            
                            <p style="display: inline">Contact No</p>
                            <p style="display:inline;color: red;" id="update-contact"></p>                                    
                            <input type="tel" name="contact" class="input-line" value="<% out.print(obj.getContact()); %>">
                            <% } %>
                            <input type="hidden" name="username" value="<% out.print(session.getAttribute("userId")); %>">
                            <input type="submit" value="Update" class="button-6" style="display: inline;">
                            <p id="loading" style="display: inline;visibility: hidden;"><img src="images/loader/ajax-loader.gif" alt="Loading" height="20" width="20">&nbsp;&nbsp;Processing...</p>
                            <p id="update-error" style="color:red;"><% if (request.getAttribute("registerError") != null) {
                                    out.println(request.getAttribute("registerError"));
                                }%></p>                            
                        </form>                                                
                    </div>
                    <div class="col-md-2"></div>
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