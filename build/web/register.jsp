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
                <div class="site-title"><div class="site-inside"><span>Login / Register</span></div></div>         
                <div class="row">
                    <div class="col-md-6">
                        <div class="forms-separation">
                            <div class="login-form-box">
                                <form class="login-form" name="login" method="POST" action="Login" onsubmit="return validateLogin()">
                                    <h3>login now</h3>
                                    <p style="display: inline">Username</p>
                                    <p style="display: inline;color: red;" id="u-error"></p>
                                    <input type="text" name="login-username" class="login-line">
                                    <p style="display: inline">Password</p>
                                    <p style="display: inline;color: red;" id="p-error"></p>
                                    <input type="password" name="login-password" class="login-line">
                                    <input type="checkbox" name="save" value="true" />&nbsp;Remember Me<br><br>
                                    <input type="submit" value="Login" class="button-6"> 
                                    <p class="lost-password"><a href="password-reset.jsp">Forgot Password</a></p>
                                    <p id="loginError" style="color:red;"><% if (request.getAttribute("loginError") != null) {
                                            out.println(request.getAttribute("loginError"));
                                        }%></p>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6" id="msg">
                        <form class="register-form" name="registration" onsubmit="return register()" id="reg-form" method="POST">
                            <h3>Register</h3>
                            <div class="row">
                                <div class="col-md-6">                                    
                                    <p style="display:inline;">First Name&nbsp;</p>
                                    <p style="display:inline;color: red;" id="fname-error"></p>                                    
                                    <input type="text" name="fname" class="input-line">
                                </div>
                                <div class="col-md-6">
                                    <p style="display:inline;">Last Name</p>
                                    <p style="display:inline;color: red;" id="lname-error"></p>                                    
                                    <input type="text" name="lname" class="input-line">
                                </div>
                            </div>                                  
                            <p style="display: inline">E-mail</p>
                            <p style="display:inline;color: red;" id="email-error"></p>                                    
                            <input type="text" name="email" class="input-line">
                            <p style="display: inline">Address</p>
                            <p style="display:inline;color: red;" id="address-error"></p>                                    
                            <input type="text" name="address" class="input-line">
                            <p style="display: inline">Contact No</p>
                            <p style="display:inline;color: red;" id="contact-error"></p>                                    
                            <input type="text" name="contact" class="input-line">
                            <p style="display: inline">Username</p>
                            <p style="display:inline;color: red;" id="username-error"></p>                                    
                            <input type="text" name="username" class="input-line" onkeyup="checkUsername()">                            
                            <div class="row">
                                <div class="col-md-6">
                                    <p style="display: inline">Password</p>
                                    <p style="display:inline;color: red;" id="password-error"></p>                                    
                                    <input type="password" name="password" class="input-line">
                                </div>
                                <div class="col-md-6">
                                    <p style="display: inline">Repeat Password</p>
                                    <p style="display:inline;color: red;" id="re-password-error"></p>                                    
                                    <input type="password" name="re-password" class="input-line">
                                </div>
                            </div>
                            <input type="submit" value="Register" class="button-6" style="display: inline;">
                            <p id="loading" style="display: inline;visibility: hidden;"><img src="images/loader/ajax-loader.gif" alt="Loading" height="20" width="20">&nbsp;&nbsp;Processing...</p>
                            <p id="error" style="color:red;"><% if (request.getAttribute("registerError") != null) {
                                    out.println(request.getAttribute("registerError"));
                                }%></p>                            
                        </form>                                                
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