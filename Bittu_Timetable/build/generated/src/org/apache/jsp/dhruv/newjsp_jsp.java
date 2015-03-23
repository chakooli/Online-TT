package org.apache.jsp.dhruv;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
Class.forName("com.mysql.jdbc.Driver");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Timetable</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Welcome to Timetable Portal</h1>\r\n");
      out.write("        ");

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
      out.write("                    <td>");
      out.print( resultMon.getString("start"));
      out.write('-');
      out.print( resultMon.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <center><strong>");
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
      out.write("                    <td>");
      out.print( resultTue.getString("start"));
      out.write('-');
      out.print( resultTue.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <center><strong>");
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
      out.write("                    <td>");
      out.print( resultWed.getString("start"));
      out.write('-');
      out.print( resultWed.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <center><strong>");
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
      out.write("                    <td>");
      out.print( resultThu.getString("start"));
      out.write('-');
      out.print( resultThu.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <center><strong>");
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
      out.write("                    <td>");
      out.print( resultFri.getString("start"));
      out.write('-');
      out.print( resultFri.getString("end"));
      out.write(" \r\n");
      out.write("                    <br> <center><strong>");
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
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
