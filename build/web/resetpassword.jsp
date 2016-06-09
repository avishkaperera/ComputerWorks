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
                                <form class="login-form" name="reset-new-password" method="POST" action="ResetNewPassword" onsubmit="return validateResetPassword()">
                                    <h3>Reset Password</h3>
                                    <p>Username</p>
                                    <p id="u-reset-error" style="color:red"></p>
                                    <input type="text" name="username" value="" class="login-line">
                                    <p>Email</p>
                                    <p id="e-reset-error" style="color:red"></p>
                                    <input type="text" name="email" value="" class="login-line">
                                    <p>New Password</p>
                                    <p id="p-reset-error" style="color:red"></p>
                                    <input type="password" name="password" class="login-line">
                                    <p>Confirm Password</p>
                                    <p id="c-reset-error" style="color:red"></p>
                                    <input type="password" name="confirmPassword" class="login-line">                                    
                                    <input type="submit" value="Reset Password" class="button-6" id="reset-password">                                    
                                    <p id="new-password-error" style="color:red;"></p>
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