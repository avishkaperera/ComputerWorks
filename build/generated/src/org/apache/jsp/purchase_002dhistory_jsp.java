package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Items;
import java.util.ArrayList;

public final class purchase_002dhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/layouts/navigation.jsp");
    _jspx_dependants.add("/layouts/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp", out, false);
      out.write("   \n");
      out.write("    <body>\t\n");
      out.write("        ");
      out.write("<!-- ======================================================================\n");
      out.write("                                START SCRIPTS\n");
      out.write("======================================================================= -->\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"header-middle-info\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-8\"  id=\"primary_nav_wrap\">\n");
      out.write("                <ul class=\"header-middle-account\">\n");
      out.write("                    ");
 if (session.getAttribute("userId") != null) {
      out.write("                                        \n");
      out.write("                    <li><a href=\"#\"><i class=\"icon-330\" title=\"My account\"></i> ");
 out.println("Hello! <b>" + session.getAttribute("userId") + "</b>");
      out.write(" </a>\n");
      out.write("                        <ul>             \n");
      out.write("                            ");
 if(session.getAttribute("userId") != null){ 
      out.write("\n");
      out.write("                            <li><a href=\"PurchaseHistory?username=");
 out.print(session.getAttribute("userId")); 
      out.write("\">Purchase history</a></li>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                                ");
 if (session.getAttribute("userId") != null) { 
      out.write("\n");
      out.write("                            <li><a href=\"EditProfile?username=");
 out.print(session.getAttribute("userId")); 
      out.write("\">Edit Profile Information</a></li>\n");
      out.write("                                ");
 } 
      out.write("                            \n");
      out.write("                            <li><a href=\"resetpassword.jsp\">Reset Password</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    |<li><a href=\"Logout\">  <i class=\"icon-351\" title=\"Logout\"></i> Sign Out ");
 } else {
      out.write(" </a></li><li></li>\n");
      out.write("                    <li><a href=\"register.jsp\">  <i class=\"icon-351\" title=\"Login\"></i> Sign In ");
 }
      out.write(" </a></li><li></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div class=\"top-pad\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\">\n");
      out.write("                            <img src=\"images/elements/cw-logo.png\" alt=\"site logo\"  />\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-cart\">\n");
      out.write("\n");
      out.write("                    <form class=\"search\">\n");
      out.write("                        <input type=\"text\" class=\"search-line\" placeholder=\"Search\" name=\"serch\" />\n");
      out.write("                        <input type=\"submit\" value=\"\" class=\"search-button\" />\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"cart-all\">\n");
      out.write("                        <a href=\"cart.jsp\"><i class=\"icon-19\" title=\"19\"></i>My Cart</a>\n");
      out.write("                        <div class=\"inside-cart\">\n");
      out.write("                            <p>2 products in the shopping cart</p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"inside-cart-image\"><img src=\"images/photos/image-9.jpg\" alt=\"product name\" /></div>\n");
      out.write("                                    <button>x</button>\n");
      out.write("                                    <a href=\"product.jsp\">Item Name</a>\n");
      out.write("                                    <p>Unit price 50$</p>\n");
      out.write("                                    <p>Qty: 1</p>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"inside-cart-image\"><img src=\"images/photos/image-8.jpg\" alt=\"product name\" /></div>\n");
      out.write("                                    <button>x</button>\n");
      out.write("                                    <a href=\"product.jsp\">Item Name</a>\n");
      out.write("                                    <p>Unit price 75$</p>\n");
      out.write("                                    <p>Qty: 2</p>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"repsonsive-menu\"><i class=\"icon-406\" title=\"406\"></i> Menu</div>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI == '/ComputerWorks/index.jsp' ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI == '/ComputerWorks/' ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI == '/ComputerWorks/all-products.jsp' ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"all-products.jsp\">Shop</a></li>\n");
      out.write("                    <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI == '/ComputerWorks/contact.jsp' ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                    <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI == '/ComputerWorks/about.jsp' ? 'active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- ======================================================================\n");
      out.write("                                END HEADER\n");
      out.write("======================================================================= -->  ");
      out.write("\n");
      out.write("        <section class=\"content\">\n");
      out.write("            <div class=\"search_container\">\n");
      out.write("                <div class=\"list_container\">\n");
      out.write("                    <table id=\"check_1\" class=\"table table-striped table-hover table-bordered chbox\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"col-md-4\">Item Image</td>\n");
      out.write("                                <td class=\"col-md-8\">Item Details</td>                                         \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody class=\"searchable\">\n");
      out.write("                            ");

                                ArrayList<Items> list = new ArrayList<Items>();
                                list = (ArrayList<Items>) request.getAttribute("history");
                            
      out.write("\n");
      out.write("                            ");
 if (list != null) { 
      out.write("\n");
      out.write("                            ");
 for (Items item : list) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><img src='GetHistoryImage?id=");
 out.print(item.getItemId()); 
      out.write("' class='img-polaroid' alt='Product Image' width=\"250px\" height=\"150x\"></td>\n");
      out.write("                                <td >\n");
      out.write("                                    <h3>");
 out.print(item.getItemName()); 
      out.write("</h3>                                                                        \n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>Qty : ");
 out.print(item.getItemQuantity()); 
      out.write(" units</li>                                        \n");
      out.write("                                        <li>Price : Rs. ");
 out.print(item.getItemPrice()); 
      out.write(" /-</li>                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>                    \n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("<div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2 col-xs-6\">\n");
      out.write("                        <ul class=\"socials\">\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/elements/socials/facebook.png\" alt=\"facebook\"/>Facebook</a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/elements/socials/twitter.png\" alt=\"twitter\"/>Twitter</a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/elements/socials/youtube.png\" alt=\"youtube\"/>Youtube</a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/elements/socials/googleplus.png\" alt=\"google\"/>Google+</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"register.jsp\">Register now</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                            <li><a href=\"faq.jsp\">FAQ</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                            <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"subscription\">\n");
      out.write("                            <div class=\"subscription-title\">Newsletter subscribe</div>\n");
      out.write("                            <div id=\"sub-msg\" style=\"color: white;\">\n");
      out.write("                            <form class=\"subscription\" id=\"newsletter\" method=\"post\" name=\"sub\" onsubmit=\"return subscribe()\">\n");
      out.write("                                <input type=\"text\" name=\"newsletter-name\" placeholder=\"Full Name\" class=\"subscription-line\">\n");
      out.write("                                <input type=\"text\" name=\"newsletter-email\" placeholder=\"E-mail\" class=\"subscription-line\">\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\" class=\"button-5\" style=\"display: inline\">\n");
      out.write("                                &nbsp;<p id=\"loading\" style=\"display: inline;visibility: hidden; color: greenyellow;\"><img src=\"images/loader/loader.gif\" alt=\"Loading\" height=\"20\" width=\"20\">&nbsp;&nbsp;Processing...</p>\n");
      out.write("                                <p style=\"color: red;\" id=\"sub-error\"></p>\n");
      out.write("                            </form>\n");
      out.write("                            </div>`\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("              \n");
      out.write("                     <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"home.html\">\n");
      out.write("                                <img src=\"images/elements/cw-logo.png\" alt=\"site logo\" />\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"mini-footer\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            Copyright 2016 Computer Works &nbsp;  &nbsp;\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"text-right\">\n");
      out.write("                                For quick &amp; easy transactions : <img src=\"images/elements/payment.png\" alt=\"pay with PayPal\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" <!-- ======================================================================\n");
      out.write("                                        START SCRIPTS\n");
      out.write("        ======================================================================= -->\n");
      out.write("        <script src=\"js/modernizr.custom.63321.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-1.10.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/placeholder.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/imagesloaded.pkgd.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/masonry.pkgd.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.swipebox.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/farbtastic/farbtastic.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/options.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/plugins.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/validateForm.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/reset-password.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/checkUsername.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/register.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/subscription.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/comments.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/update-info.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <!-- ======================================================================\n");
      out.write("                                        END SCRIPTS\n");
      out.write("        ======================================================================= -->");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
