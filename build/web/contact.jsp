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
                    <div class="col-md-12">
                        <h2>contact</h2>
               

                        <div class="contact-info">
                            <div class="row">
                                <div class="col-md-6">
                                    <ul>
                                        <li>
                                            <address style="text-align: justify;">Computer Works (Pvt) Ltd. #3-52, 3rd Floor, Majestic City, Colombo 4&nbsp;</address>
                                        </li>
                                    </ul>
                                </div>
                          
                                <div class="col-md-6">
                                    <ul>
                                        <li><span class="phone"><strong>011 2 555 262</strong></span></li>
                                        <li><span class="phone"><strong>011 2 555 263</strong></span></li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="site-title">
                            <div class="site-inside">
                                <span>Contact Us</span>
                            </div>
                        </div>

                        <div class="the-form">
                            <form id="contact_form">
                                <div class="row">
                                    <div class="col-md-4"><p>Name*</p>
                                        <input type="text" name="contact-name" class="the-line">
                                    </div>
                                    <div class="col-md-4"><p>E-mail*</p>
                                        <input type="text" name="contact-email" class="the-line">
                                    </div>
                                
                                </div>
                                <p>Message*</p>
                                <textarea name="contact-message" class="the-area"></textarea>
                                <input type="submit" id="form-send" value="Send" class="button-4">
                            </form>
                        </div>
                         <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d990.2891921085512!2d79.88367757355952!3d6.871811692342408!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae25a4f38248371%3A0xe046a5fceac1c206!2sNational+School+of+Business+Management%2C+School+of+Computing!5e0!3m2!1sen!2s!4v1402251713653" width="100%" height="360" frameborder="0" style="border:0" margin="0"></iframe>
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