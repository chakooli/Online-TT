package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import p.*;

public final class hallticket_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      p.getBranch v = null;
      synchronized (session) {
        v = (p.getBranch) _jspx_page_context.getAttribute("v", PageContext.SESSION_SCOPE);
        if (v == null){
          v = new p.getBranch();
          _jspx_page_context.setAttribute("v", v, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      p.GetName n = null;
      synchronized (session) {
        n = (p.GetName) _jspx_page_context.getAttribute("n", PageContext.SESSION_SCOPE);
        if (n == null){
          n = new p.GetName();
          _jspx_page_context.setAttribute("n", n, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      p.GetExamDate g = null;
      synchronized (session) {
        g = (p.GetExamDate) _jspx_page_context.getAttribute("g", PageContext.SESSION_SCOPE);
        if (g == null){
          g = new p.GetExamDate();
          _jspx_page_context.setAttribute("g", g, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      p.GetExamTime c = null;
      synchronized (session) {
        c = (p.GetExamTime) _jspx_page_context.getAttribute("c", PageContext.SESSION_SCOPE);
        if (c == null){
          c = new p.GetExamTime();
          _jspx_page_context.setAttribute("c", c, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      p.GetOnlyCourses gc = null;
      synchronized (session) {
        gc = (p.GetOnlyCourses) _jspx_page_context.getAttribute("gc", PageContext.SESSION_SCOPE);
        if (gc == null){
          gc = new p.GetOnlyCourses();
          _jspx_page_context.setAttribute("gc", gc, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      p.GetEndTime e = null;
      synchronized (session) {
        e = (p.GetEndTime) _jspx_page_context.getAttribute("e", PageContext.SESSION_SCOPE);
        if (e == null){
          e = new p.GetEndTime();
          _jspx_page_context.setAttribute("e", e, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      p.GetImage i = null;
      synchronized (session) {
        i = (p.GetImage) _jspx_page_context.getAttribute("i", PageContext.SESSION_SCOPE);
        if (i == null){
          i = new p.GetImage();
          _jspx_page_context.setAttribute("i", i, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

String uname = (String)session.getAttribute("user");
int j=0;
String name = n.getname(uname);
String image = i.getimage(uname);
String regcourses[] = gc.getcourses(uname);
String branch = v.getRes(uname);
String date[] = g.getexamdate(regcourses);
String starttime[] = c.getstarttime(regcourses);
String endtime[] = e.getendtime(regcourses);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Hall Ticket</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"></link>\n");
      out.write("<!-- / Demo styling - remove before use -->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".container .group{text-align:center;text-color:\"black\"}\n");
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
      out.write("<div class=\"wrapper row1\"> \n");
      out.write("  <br><header id=\"header\" class=\"clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <div id=\"logo\" class=\"fl_left\">\n");
      out.write("\t<img src = \"logo.png\">\n");
      out.write("      <br><br><br><h1><font size = 18><a href=\"../index.html\">Hall Ticket</a></font></h1>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- ################################################################################################ --> \n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row2\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <nav id=\"mainav\" class=\"clear\"> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <ul class=\"clear\">\n");
      out.write("        <li><a href=\"#\">Home</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Profile</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t<li><a href=\"#\">Course Registration</a></li>\n");
      out.write("\t\t<li><a href=\"timetable.jsp\">Time Table</a></li>\n");
      out.write("\t\t<li class =\"active\"><a href=\"hallticket.jsp\">Hall Ticket</a></li>\n");
      out.write("\t\t<li><a href=\"#\">View grade sheet</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- section 1 --> \n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <div class=\"container clear\"> \n");
      out.write("      <!-- section content --> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("      <div class=\"group\">\n");
      out.write("        <div class=\"one_half first\">Academic session : 2015</div>\n");
      out.write("        <div class=\"one_half\">Branch : ");
      out.print(branch);
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("      <!-- / section content -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- / section 1 --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <main class=\"container clear\"> \n");
      out.write("      <!-- main body --> \n");
      out.write("      <!-- ################################################################################################ -->\n");
      out.write("     <img class=\"imgl borderedbox\" src=\"\" alt=\"image\">\n");
      out.write("      <p><h1>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(name );
      out.write("</h1>\n");
      out.write("        <h1>Roll no. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(uname);
      out.write("</h1> \n");
      out.write("        <h1>Examination &nbsp;&nbsp;&nbsp;Mid Semester</h1></p>\n");
      out.write("      <div class=\"scrollable\">\n");
      out.write("        <table>\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>Course Code</th>\n");
      out.write("              <th>Date</th>\n");
      out.write("        <th>Start Time</th>\n");
      out.write("        <th>End Time</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody style=\"text-color:black;\">\n");
      out.write("            <tr>\n");
      out.write("            ");
for(j=0;j<regcourses.length;j++){ 
      out.write("\n");
      out.write("              <td>");
      out.print(regcourses[j]);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(date[j]);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(starttime[j]);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(endtime[j]);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write(" </div>\n");
      out.write("<a>Print</a>\n");
      out.write("      <!-- / main body -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- / section 2 --> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row4\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <footer id=\"footer\" class=\"clear\"> \n");
      out.write("      <!-- ################################################################################################ -->\n");
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
      out.write("   \n");
      out.write("   \n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("  </footer>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"http://www.iiti.ac.in/\">IIT Indore</a></p>\n");
      out.write("    <p class=\"fl_right\">Designed by Dhruva and Parul</p>\n");
      out.write("    <!-- ################################################################################################ --> \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- JAVASCRIPTS --> \n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script> \n");
      out.write("<script src=\"layout/scripts/jquery.fitvids.min.js\"></script> \n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
