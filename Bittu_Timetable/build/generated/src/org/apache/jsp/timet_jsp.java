package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import p.Validateup;
import p.Getup;
import p.GetCourses;

public final class timet_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      p.Validateup v = null;
      synchronized (session) {
        v = (p.Validateup) _jspx_page_context.getAttribute("v", PageContext.SESSION_SCOPE);
        if (v == null){
          v = new p.Validateup();
          _jspx_page_context.setAttribute("v", v, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      p.Getup g = null;
      synchronized (session) {
        g = (p.Getup) _jspx_page_context.getAttribute("g", PageContext.SESSION_SCOPE);
        if (g == null){
          g = new p.Getup();
          _jspx_page_context.setAttribute("g", g, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      p.GetCourses c = null;
      synchronized (session) {
        c = (p.GetCourses) _jspx_page_context.getAttribute("c", PageContext.SESSION_SCOPE);
        if (c == null){
          c = new p.GetCourses();
          _jspx_page_context.setAttribute("c", c, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      p.GetInstructor ins = null;
      synchronized (session) {
        ins = (p.GetInstructor) _jspx_page_context.getAttribute("ins", PageContext.SESSION_SCOPE);
        if (ins == null){
          ins = new p.GetInstructor();
          _jspx_page_context.setAttribute("ins", ins, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      p.GetType t = null;
      synchronized (session) {
        t = (p.GetType) _jspx_page_context.getAttribute("t", PageContext.SESSION_SCOPE);
        if (t == null){
          t = new p.GetType();
          _jspx_page_context.setAttribute("t", t, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      p.GetDay d = null;
      synchronized (session) {
        d = (p.GetDay) _jspx_page_context.getAttribute("d", PageContext.SESSION_SCOPE);
        if (d == null){
          d = new p.GetDay();
          _jspx_page_context.setAttribute("d", d, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String uname = request.getParameter("username");
String pass = request.getParameter("password");
g.setUsername(uname);
g.setPassword(pass);
if(v.check(uname, pass)==1){
	String[] regcourses = c.courses(uname);
	String[][] instruc = ins.instructor(uname, regcourses);
 	int i = 0, j;
      out.write("\r\n");
      out.write(" \t\r\n");
      out.write(" \t");
/*String[][] instruc = ins.instructor(uname, regcourses);
 	//out.println(instruc);
 for(i=0;i<regcourses.length;i++){
 for(j=0;j<instruc[i].length;j++){
 if(instruc[i][j]!=null){
 out.println("\t"+instruc[i][j]);
 }
 }
 }
 String type[] = t.gettype(regcourses);
 for(i=0;i<regcourses.length;i++){
 out.println("\t"+type[i]);
 }
 String days[][] = d.getday(regcourses);
 for(i=0;i<regcourses.length;i++){
 for(j=0;j<days[i].length;j++){
 if(days[i][j]!=null){
 out.println("\t"+days[i][j]);
 }
 }
 }
 	}catch(Exception e){
 	e.printStackTrace();
}
else{
response.sendRedirect("index.jsp");
} 
 */
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Time table</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<link href=\"../layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<!-- / Demo styling - remove before use -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".container .group{text-align:center;}\r\n");
      out.write(".container .group div{padding:8px 0; font-size:16px; font-family:Verdana, Geneva, sans-serif;}\r\n");
      out.write(".container .group div:nth-child(odd){color:#FFFFFF; background:#CCCCCC;}\r\n");
      out.write(".container .group div:nth-child(even){color:#FFFFFF; background:#979797;}\r\n");
      out.write("@media screen and (min-width:180px) and (max-width:900px) {\r\n");
      out.write("\t.container .group div{margin-bottom:0;}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- / Demo styling -->\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper row0\">\r\n");
      out.write("  <div id=\"topbar\" class=\"clear\"> \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper row1\">\r\n");
      out.write("  <header id=\"header\" class=\"clear\"> \r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("    <div id=\"logo\" class=\"fl_left\">\r\n");
      out.write("\t<img src = \"logo.png\">\r\n");
      out.write("      <br><br><br><h1><font size = 18><a href=\"../index.html\">Time Table</a></font></h1>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- ################################################################################################ --> \r\n");
      out.write("  </header>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row2\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <nav id=\"mainav\" class=\"clear\"> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <ul class=\"clear\">\r\n");
      out.write("        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">Profile</a></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li><a href=\"#\">Course Registration</a></li>\r\n");
      out.write("\t\t<li class =\"active\"><a href=\"timet.html\">Time Table</a></li>\r\n");
      out.write("\t\t<li><a href=\"hallt.html\">Hall Ticket</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">View grade sheet</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">Logout</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- section 1 --> \r\n");
      out.write("<div class=\"wrapper row3\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <div class=\"container clear\"> \r\n");
      out.write("      <!-- section content --> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"group\">\r\n");
      out.write("        <div class=\"one_half first\">Academic year : XXXX</div>\r\n");
      out.write("        <div class=\"one_half\">Branch : XXX</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("      <!-- / section content -->\r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper row3\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <main class=\"container clear\"> \r\n");
      out.write("<h1>Updated</h1>\r\n");
      out.write("      <div class=\"scrollable\">\r\n");
      out.write("        <table>\r\n");
      out.write("          <thead>\r\n");
      out.write("              <td></td>\r\n");
      out.write("              <td>Monday</td>\r\n");
      out.write("              <td>Tuesday</td>\r\n");
      out.write("              <td>Wednesday</td>\r\n");
      out.write("\t\t\t  <td>Thursday</td>\r\n");
      out.write("\t\t\t  <td>Friday</td>\r\n");
      out.write("            \r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("          \t<tr>    \r\n");
      out.write("              ");
 for(i=0;i<regcourses.length;i++){
      out.write("\r\n");
      out.write("              <td>Slot#</td>\r\n");
      out.write("              <td>");
      out.print(regcourses[i]);
      out.write("\r\n");
      out.write("              ");

              for(j=0;j<instruc[i].length;j++){
 				if(instruc[i][j]!=null){
      out.write("\r\n");
      out.write(" \t\t\t\t</b>");
      out.print(instruc[i][j]);
      out.write("\r\n");
      out.write("             </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
}}}}
      out.write("\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write(" </div>\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("    </main>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- / section 1 --> \r\n");
      out.write("<!-- section 2 --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!--<div class=\"wrapper row3\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <div class=\"container clear\"> \r\n");
      out.write("    \r\n");
      out.write("      <div class=\"group btmspace-5\">\r\n");
      out.write("        <div class=\"one_quarter first\">1/4</div>\r\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\r\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\r\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"group btmspace-5\">\r\n");
      out.write("        <div class=\"one_quarter first\">1/4</div>\r\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\r\n");
      out.write("        <div class=\"two_quarter\">2/4 or 1/2</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"group\">\r\n");
      out.write("        <div class=\"one_quarter first\">1/4</div>\r\n");
      out.write("        <div class=\"three_quarter\">3/4</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- / section 2 --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row4\">\r\n");
      out.write("  <div class=\"rounded\">\r\n");
      out.write("    <footer id=\"footer\" class=\"clear\"> \r\n");
      out.write("      <!-- ################################################################################################ -->\r\n");
      out.write("      <div class=\"one_third first\">\r\n");
      out.write("        <figure class=\"center\"><img class=\"btmspace-15\" src=\"map.png\" alt=\"\">\r\n");
      out.write("          <figcaption><a href=\"https://www.google.co.in/maps/place/IIT+Indore/@22.680911,75.876066,15z/data=!4m2!3m1!1s0x0:0xbc4a94ecc5ad388\">Find Us With Google Maps &raquo;</a></figcaption>\r\n");
      out.write("        </figure>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"one_third\">\r\n");
      out.write("        <address>\r\n");
      out.write("\t\tIndian Institute of Technology Indore,<br>\r\n");
      out.write("\t\tOpposite to Veterinary College Mhow,<br> \r\n");
      out.write("\t\tSurvey No. 113/2-B,Mhow Road,<br> \r\n");
      out.write("\t    Indore 453446, India<br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <i class=\"fa fa-phone pright-10\"></i> +91-732-4240777<br>\r\n");
      out.write("        <i class=\"fa fa-envelope-o pright-10\"></i> <a href=\"#\">securityhelpdesk@iiti.ac.in</a>\r\n");
      out.write("        </address>\r\n");
      out.write("   \r\n");
      out.write("      <!-- ################################################################################################ --> \r\n");
      out.write("    </footer>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ --> \r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row5\">\r\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \r\n");
      out.write("    <!-- ################################################################################################ -->\r\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"http://www.iiti.ac.in/\">IIT Indore</a></p>\r\n");
      out.write("    <p class=\"fl_right\">Designed by Dhruva and Parul</p>\r\n");
      out.write("    <!-- ################################################################################################ --> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- JAVASCRIPTS --> \r\n");
      out.write("<script src=\"../layout/scripts/jquery.min.js\"></script> \r\n");
      out.write("<script src=\"../layout/scripts/jquery.fitvids.min.js\"></script> \r\n");
      out.write("<script src=\"../layout/scripts/jquery.mobilemenu.js\"></script>\r\n");
      out.write("</body>\r\n");
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
