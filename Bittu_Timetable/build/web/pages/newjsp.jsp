<%-- 
    Document   : newjsp
    Created on : Mar 7, 2015, 11:13:11 PM
    Author     : Dhruva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*"%>
<%Class.forName("com.mysql.jdbc.Driver");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timetable</title>
    </head>
    <%!
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
    %>
    <body>
        <h1>Welcome to Timetable Portal</h1>
        <%
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
        %>
        <table border="1">
            <thead>
                <tr>
                    
                    <th> Monday </th>
                    <th> Tuesday </th>
                    <th> Wednesday </th>
                    <th> Thursday </th>
                    <th>Friday</th>
                </tr>
            </thead>
            <tbody>
                <%while (result.next()) {%>
                <tr>
                    <%if(resultMon.next()){%>
                    <td><%= resultMon.getString("start")%>-<%= resultMon.getString("end")%> 
                    <br> <center><strong><%= resultMon.getString("cid")%> <%= resultMon.getString("LT")%> </strong><br>
                    <em> <%=resultMon.getString("venue")%> </em></center></td>
                    <%}%>
                    
                    <%if(resultTue.next()){%>
                    <td><%= resultTue.getString("start")%>-<%= resultTue.getString("end")%> 
                    <br> <center><strong><%= resultTue.getString("cid")%> <%= resultTue.getString("LT")%></strong><br>
                    <em> <%=resultTue.getString("venue")%> </em></center></td>
                    <%}%>
                    <%if(resultWed.next()){%>
                    <td><%= resultWed.getString("start")%>-<%= resultWed.getString("end")%> 
                    <br> <center><strong><%= resultWed.getString("cid")%> <%= resultWed.getString("LT")%> </strong><br>
                    <em> <%=resultWed.getString("venue")%> </em></center></td>
                    <%}%>
                    <%if(resultThu.next()){%>
                    <td><%= resultThu.getString("start")%>-<%= resultThu.getString("end")%> 
                    <br> <center><strong><%= resultThu.getString("cid")%> <%= resultThu.getString("LT")%> </strong><br>
                    <em> <%=resultThu.getString("venue")%> </em></center></td>
                    <%}%>
                    <%if(resultFri.next()){%>
                    <td><%= resultFri.getString("start")%>-<%= resultFri.getString("end")%> 
                    <br> <center><strong><%= resultFri.getString("cid")%> <%= resultFri.getString("cid")%>  </strong><br>
                    <em> <%=resultFri.getString("venue")%> </em></center></td>
                    <%}%>
                </tr>
                <% } %>
            </tbody>
        </table>

        
    </body>
</html>
