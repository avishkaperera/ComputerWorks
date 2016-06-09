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
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <div class="">
                            <div class="login-form-box" id="display">                                
                                <form class="login-form" name="reset-password" method="POST" onsubmit="return sendEmail()" action="">
                                    <h3>Reset Password</h3>
                                    <p style="display: inline;">Username</p>
                                    <p style="display: inline;color: red;" id="uerror"></p>
                                    <input type="text" name="username" class="login-line">
                                    <p style="display: inline;">Email</p>
                                    <p style="display: inline;color: red;" id="eerror"></p>
                                    <input type="text" name="email" class="login-line">                                    
                                    <input type="submit" value="Reset Password" class="button-6" id="reset-password" style="display: inline;">                                     
                                    <p id="loading" style="display: inline;visibility: hidden;"><img src="images/loader/ajax-loader.gif" alt="Loading" height="20" width="20">&nbsp;&nbsp;Processing...</p>                                    
                                    <h5 id="resetError" style="color:red;"></h5>
                                </form>
                            </div>
                        </div>
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