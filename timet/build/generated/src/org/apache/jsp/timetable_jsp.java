package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import p.*;

public final class timetable_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
Class.forName("com.mysql.jdbc.Driver");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Time table</title>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("      <br><br><br><h1><font size = 18><a href=\"../index.html\">Time Table</a></font></h1>\n");
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
      out.write("\t\t<li class =\"active\"><a href=\"timet.html\">Time Table</a></li>\n");
      out.write("\t\t<li><a href=\"hallt.html\">Hall Ticket</a></li>\n");
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
      out.write("        <div class=\"one_half first\">Academic year : XXXX</div>\n");
      out.write("        <div class=\"one_half\">Branch : XXX</div>\n");
      out.write("      </div>\n");
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("      <!-- / section content -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <main class=\"container clear\"> \n");
      out.write("<h1>Updated</h1>\n");
      out.write("      <div class=\"scrollable\">\n");
      out.write("          \n");
      out.write("          ");

            String ID = request.getParameter("username");
            int t = 10;
            //String pass =request.getParameter("password");
            //timet timemachine = new timet(ID);
            //PreparedStatement psu = timemachine.con.prepareStatement("select pass from stud where user = '"+ID+"'");
            //ResultSet rsu = psu.executeQuery();
            daytimet timeMon = new daytimet("Mon", ID);
            daytimet timeTue = new daytimet("Tue", ID);
            daytimet timeWed = new daytimet("Wed", ID);
            daytimet timeThu = new daytimet("Thu", ID);
            daytimet timeFri = new daytimet("Fri", ID);
            
            ResultSet resultMon = timeMon.ShowDay();//timemachine.showMon();
            ResultSet resultTue = timeTue.ShowDay();//timemachine.showTue();
            ResultSet resultWed = timeWed.ShowDay();//timemachine.showWed();
            ResultSet resultThu = timeThu.ShowDay();//timemachine.showThu();
            ResultSet resultFri = timeFri.ShowDay();//timemachine.showFri();
        
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <th> Monday </th>\n");
      out.write("                    <th> Tuesday </th>\n");
      out.write("                    <th> Wednesday </th>\n");
      out.write("                    <th> Thursday </th>\n");
      out.write("                    <th>Friday</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
while (t>0) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");
if(resultMon.next()){
      out.write("\n");
      out.write("                    <td><center>");
      out.print( resultMon.getString("start"));
      out.write('-');
      out.print( resultMon.getString("end"));
      out.write(" \n");
      out.write("                    <br> <strong>");
      out.print( resultMon.getString("cid"));
      out.write(' ');
      out.print( resultMon.getString("LT"));
      out.write(" </strong><br>\n");
      out.write("                    <em> ");
      out.print(resultMon.getString("venue"));
      out.write(" </em></center></td>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");
if(resultTue.next()){
      out.write("\n");
      out.write("                    <td><center>");
      out.print( resultTue.getString("start"));
      out.write('-');
      out.print( resultTue.getString("end"));
      out.write(" \n");
      out.write("                    <br> <strong>");
      out.print( resultTue.getString("cid"));
      out.write(' ');
      out.print( resultTue.getString("LT"));
      out.write("</strong><br>\n");
      out.write("                    <em> ");
      out.print(resultTue.getString("venue"));
      out.write(" </em></center></td>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
if(resultWed.next()){
      out.write("\n");
      out.write("                    <td><center>");
      out.print( resultWed.getString("start"));
      out.write('-');
      out.print( resultWed.getString("end"));
      out.write(" \n");
      out.write("                    <br> <strong>");
      out.print( resultWed.getString("cid"));
      out.write(' ');
      out.print( resultWed.getString("LT"));
      out.write(" </strong><br>\n");
      out.write("                    <em> ");
      out.print(resultWed.getString("venue"));
      out.write(" </em></center></td>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
if(resultThu.next()){
      out.write("\n");
      out.write("                    <td><center>");
      out.print( resultThu.getString("start"));
      out.write('-');
      out.print( resultThu.getString("end"));
      out.write(" \n");
      out.write("                    <br><strong>");
      out.print( resultThu.getString("cid"));
      out.write(' ');
      out.print( resultThu.getString("LT"));
      out.write(" </strong><br>\n");
      out.write("                    <em> ");
      out.print(resultThu.getString("venue"));
      out.write(" </em></center></td>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
if(resultFri.next()){
      out.write("\n");
      out.write("                    <td><center>");
      out.print( resultFri.getString("start"));
      out.write('-');
      out.print( resultFri.getString("end"));
      out.write(" \n");
      out.write("                    <br> <strong>");
      out.print( resultFri.getString("cid"));
      out.write(' ');
      out.print( resultFri.getString("cid"));
      out.write("  </strong><br>\n");
      out.write("                    <em> ");
      out.print(resultFri.getString("venue"));
      out.write(" </em></center></td>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
t--; } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write(" </div>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- / section 1 --> \n");
      out.write("<!-- section 2 --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<!--<div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <div class=\"container clear\"> \n");
      out.write("    \n");
      out.write("      <div class=\"group btmspace-5\">\n");
      out.write("        <div class=\"one_quarter first\">1/4</div>\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"group btmspace-5\">\n");
      out.write("        <div class=\"one_quarter first\">1/4</div>\n");
      out.write("        <div class=\"one_quarter\">1/4</div>\n");
      out.write("        <div class=\"two_quarter\">2/4 or 1/2</div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"group\">\n");
      out.write("        <div class=\"one_quarter first\">1/4</div>\n");
      out.write("        <div class=\"three_quarter\">3/4</div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
      out.write("      <!-- ################################################################################################ --> \n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ --> \n");
      out.write("<!-- ################################################################################################ -->\n");
      out.write("<div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \n");
      out.write("    <!-- ################################################################################################ -->\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"http://www.iiti.ac.in/\">IIT Indore</a></p>\n");
      out.write("    \n");
      out.write("    <!-- ################################################################################################ --> \n");
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
