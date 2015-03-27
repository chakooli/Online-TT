package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Login Page</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<!-- / Demo styling - remove before use -->\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".container .group{text-align:center;}\n");
      out.write(".container .group div{padding:8px 0; font-size:16px; font-family:Verdana, Geneva, sans-serif;}\n");
      out.write(".container .group div:nth-child(odd){color:#FFFFFF; background:#CCCCCC;}\n");
      out.write(".container .group div:nth-child(even){color:#FFFFFF; background:#979797;}\n");
      out.write("@media screen and (min-width:180px) and (max-width:900px) {\n");
      out.write("\t.container .group div{margin-bottom:0;}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- / Demo styling -->\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("\n");
      out.write("<div class=\"wrapper row0\">\n");
      out.write("  <div id=\"topbar\" class=\"clear\"> \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div id=\"logo\" class=\"fl_left\">\n");
      out.write("\t<img src = \"logo.png\">\n");
      out.write("      <br><br><br><h1><font size = 18><a href=\"../index.html\">Login</a></font></h1>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- ################################################################################################ --> \n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- section 1 --> \n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <div class=\"container clear\"> \n");
      out.write("      \n");
      out.write("      <!-- section content --> \n");
      out.write("      \n");
      out.write("      <div align=\"center\">\n");
      out.write("       <form action=\"timetable.jsp\" method=\"post\">\n");
      out.write("          <div class=\"one_third_first\">\n");
      out.write("            <label for=\"username\">User Name <span>*</span></label>\n");
      out.write("            <input type=\"text\" name=\"username\" id=\"username\" size=\"22\">\n");
      out.write("          </div><br>\n");
      out.write("          <div class=\"one_third_first\">\n");
      out.write("            <label for=\"password\">Password <span>*</span></label>\n");
      out.write("            <input type=\"password\" name=\"password\" id=\"password\"  size=\"22\">\n");
      out.write("          </div><br>\n");
      out.write("          <div>\n");
      out.write("            <input name=\"submit\" type=\"submit\" value=\"Submit Form\">\n");
      out.write("            &nbsp;\n");
      out.write("          </div></form>\n");
      out.write("        \n");
      out.write("      </div></div>\n");
      out.write("      \n");
      out.write("      <!-- / section content -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"wrapper row4\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <footer id=\"footer\" class=\"clear\"> \n");
      out.write("      <div class=\"one_third first\">\n");
      out.write("        <figure class=\"center\"><img class=\"btmspace-15\" src=\"map.png\" alt=\"\">\n");
      out.write("          <figcaption><a href=\"https://www.google.co.in/maps/place/IIT+Indore/@22.680911,75.876066,15z/data=!4m2!3m1!1s0x0:0xbc4a94ecc5ad388\">Find Us With Google Maps &raquo;</a></figcaption>\n");
      out.write("        </figure>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"one_third\">\n");
      out.write("        <address>\n");
      out.write("\t\tIndian Institute of Technology Indore,<br>\n");
      out.write("\t\tOpposite to Veterinary College Mhow,<br> \n");
      out.write("\t\tSurvey No. 113/2-B,Mhow Road,<br> \n");
      out.write("\t    Indore 453446, India<br>\n");
      out.write("        <br>\n");
      out.write("        <i class=\"fa fa-phone pright-10\"></i> +91-732-4240777<br>\n");
      out.write("        <i class=\"fa fa-envelope-o pright-10\"></i> <a href=\"#\">securityhelpdesk@iiti.ac.in</a>\n");
      out.write("        </address>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"http://www.iiti.ac.in/\">IIT Indore</a></p>\n");
      out.write("    <p class=\"fl_right\">Designed by Dhruva and Parul</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- JAVASCRIPTS --> \n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script> \n");
      out.write("<script src=\"layout/scripts/jquery.fitvids.min.js\"></script> \n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
