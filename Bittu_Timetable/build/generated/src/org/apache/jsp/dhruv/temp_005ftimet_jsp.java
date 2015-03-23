package org.apache.jsp.dhruv;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class temp_005ftimet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        public class timet{
            String URL = "jdbc:mysql://localhost:3306/timetable";
            String user = "root";
            String pass = "";
            
            Connection con = null;
            PreparedStatement selectall = null;
            PreparedStatement selectMon = null;
            PreparedStatement selectTue = null;
            PreparedStatement selectWed = null;
            PreparedStatement selectThu = null;
            PreparedStatement selectFri = null;
            ResultSet rs = null;
            ResultSet rs1 = null;
            ResultSet rs2 = null;
            ResultSet rs3 = null;
            ResultSet rs4 = null;
            ResultSet rs5 = null;
            
            public timet(String U)
            {
                try{
                    con = DriverManager.getConnection(URL, user, pass);
                    selectall = con.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where sid = '"+U+"'");
                    selectMon = con.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where day = 'Mon' and sid = '"+U+"' order by start");
                    selectTue = con.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where day = 'Tue' and sid = '"+U+"' order by start");
                    selectWed = con.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where day = 'Wed' and sid = '"+U+"' order by start");
                    selectThu = con.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where day = 'Thu' and sid = '"+U+"' order by start");
                    selectFri = con.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where day = 'Thu' and sid = '"+U+"' order by start");
                    //problem is students will have to register for free slot also :-|
                } catch(SQLException e){
                e.printStackTrace();
                }
            }
            public ResultSet showAll(){
                try {
                    rs = selectall.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs;
            }
            public ResultSet showMon(){
                try {
                    rs1 = selectMon.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs1;
            }
            public ResultSet showTue(){
                try {
                    rs2 = selectTue.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs2;
            }
            public ResultSet showWed(){
                try {
                    rs3 = selectWed.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs3;
            }
            public ResultSet showThu(){
                try {
                    rs4 = selectThu.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs4;
            }
            public ResultSet showFri(){
                try {
                    rs5 = selectFri.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs5;
            }
        }
    
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

      out.write('\r');
      out.write('\n');
Class.forName("com.mysql.jdbc.Driver");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Time table</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("          \r\n");
      out.write("          ");

            String ID = request.getParameter("username");
            //String pass =request.getParameter("password");
            timet timemachine = new timet(ID);
            //PreparedStatement psu = timemachine.con.prepareStatement("select pass from stud where user = '"+ID+"'");
            //ResultSet rsu = psu.executeQuery();
   
            ResultSet result = timemachine.showAll();
            ResultSet resultMon = timemachine.showMon();
            ResultSet resultTue = timemachine.showTue();
            ResultSet resultWed = timemachine.showWed();
            ResultSet resultThu = timemachine.showThu();
            ResultSet resultFri = timemachine.showFri();
        
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <th> Monday </th>\r\n");
      out.write("                    <th> Tuesday </th>\r\n");
      out.write("                    <th> Wednesday </th>\r\n");
      out.write("                    <th> Thursday </th>\r\n");
      out.write("                    <th>Friday</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                ");
while (result.next()) {
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    ");
if(resultMon.next()){
      out.write("\r\n");
      out.write("                    <td><center>");
      out.print( resultMon.getString("start"));
      out.write('-');
      out.print( resultMon.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <strong>");
      out.print( resultMon.getString("cid"));
      out.write(' ');
      out.print( resultMon.getString("LT"));
      out.write(" </strong><br>\r\n");
      out.write("                    <em> ");
      out.print(resultMon.getString("venue"));
      out.write(" </em></center></td>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    ");
if(resultTue.next()){
      out.write("\r\n");
      out.write("                    <td><center>");
      out.print( resultTue.getString("start"));
      out.write('-');
      out.print( resultTue.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <strong>");
      out.print( resultTue.getString("cid"));
      out.write(' ');
      out.print( resultTue.getString("LT"));
      out.write("</strong><br>\r\n");
      out.write("                    <em> ");
      out.print(resultTue.getString("venue"));
      out.write(" </em></center></td>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    ");
if(resultWed.next()){
      out.write("\r\n");
      out.write("                    <td><center>");
      out.print( resultWed.getString("start"));
      out.write('-');
      out.print( resultWed.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <strong>");
      out.print( resultWed.getString("cid"));
      out.write(' ');
      out.print( resultWed.getString("LT"));
      out.write(" </strong><br>\r\n");
      out.write("                    <em> ");
      out.print(resultWed.getString("venue"));
      out.write(" </em></center></td>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    ");
if(resultThu.next()){
      out.write("\r\n");
      out.write("                    <td><center>");
      out.print( resultThu.getString("start"));
      out.write('-');
      out.print( resultThu.getString("end"));
      out.write(" \r\n");
      out.write("                    <br><strong>");
      out.print( resultThu.getString("cid"));
      out.write(' ');
      out.print( resultThu.getString("LT"));
      out.write(" </strong><br>\r\n");
      out.write("                    <em> ");
      out.print(resultThu.getString("venue"));
      out.write(" </em></center></td>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    ");
if(resultFri.next()){
      out.write("\r\n");
      out.write("                    <td><center>");
      out.print( resultFri.getString("start"));
      out.write('-');
      out.print( resultFri.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <strong>");
      out.print( resultFri.getString("cid"));
      out.write(' ');
      out.print( resultFri.getString("cid"));
      out.write("  </strong><br>\r\n");
      out.write("                    <em> ");
      out.print(resultFri.getString("venue"));
      out.write(" </em></center></td>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </tbody>\r\n");
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
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script> \r\n");
      out.write("<script src=\"layout/scripts/jquery.fitvids.min.js\"></script> \r\n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\r\n");
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
