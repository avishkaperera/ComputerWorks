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
                                <form class="login-form" name="new-password" method="POST" action="NewPassword" onsubmit="return validateNewPassword()">
                                    <h3>Reset Password</h3>
                                    <p>New Password</p>
                                    <input type="password" name="password" class="login-line">
                                    <p>Confirm Password</p>
                                    <input type="password" name="confirmPassword" class="login-line">
                                    <input type="hidden" name="username" value="<%if (request.getParameter("username") != null) {
                                            out.print(request.getParameter("username"));
                                        }%>">
                                    <input type="hidden" name="email" value="<%if (request.getParameter("email") != null) {
                                            out.print(request.getParameter("email"));
                                        }%>">
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