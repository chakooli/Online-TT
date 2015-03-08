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
        <title>Selecting data</title>
    </head>
    <%!
        public class timet{
            String URL = "jdbc:mysql://localhost:3306/timetable";
            String user = "root";
            String pass = "";
            
            Connection con = null;
            PreparedStatement selectMon = null;
            PreparedStatement selectTue = null;
            PreparedStatement selectWed = null;
            PreparedStatement selectThu = null;
            PreparedStatement selectFri = null;
            ResultSet rs1 = null;
            ResultSet rs2 = null;
            ResultSet rs3 = null;
            ResultSet rs4 = null;
            ResultSet rs5 = null;
            
            public timet()
            {
                try{
                    con = DriverManager.getConnection(URL, user, pass);
                    selectMon = con.prepareStatement("select * from timet where day = 'Mon'"); // if it works we can copy
                    selectTue = con.prepareStatement("select * from timet where day = 'Tue'");
                    selectWed = con.prepareStatement("select * from timet where day = 'Wed'");
                    selectThu = con.prepareStatement("select * from timet where day = 'Thu'");
                    selectFri = con.prepareStatement("select * from timet where day = 'Fri'");
                } catch(SQLException e){
                e.printStackTrace();
                }
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
            timet timemachine = new timet();
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
                <%while (resultMon.next() /*|| resultTue.next() ||resultWed.next() || resultThu.next() ||resultFri.next()*/) {%>
                <tr>
                    <td><%= resultMon.getString("start")%>-<%= resultMon.getString("end")%> 
                    <br> <center><strong><%= resultMon.getString("cid")%> </strong><br>
                    <em> <%=resultMon.getString("venue")%> </em></center></td>
                    <%--
                    <td><%= resultTue.getString("start")%>-<%= resultTue.getString("end")%> 
                    <br> <center><strong><%= resultTue.getString("cid")%> </strong><br>
                    <em> <%=resultTue.getString("venue")%> </em></center></td>
                    
                    <td><%= resultWed.getString("start")%>-<%= resultWed.getString("end")%> 
                    <br> <center><strong><%= resultWed.getString("cid")%> </strong><br>
                    <em> <%=resultWed.getString("venue")%> </em></center></td>
                    
                    <td><%= resultThu.getString("start")%>-<%= resultThu.getString("end")%> 
                    <br> <center><strong><%= resultThu.getString("cid")%> </strong><br>
                    <em> <%=resultThu.getString("venue")%> </em></center></td>
                    
                    <td><%= resultFri.getString("start")%>-<%= resultFri.getString("end")%> 
                    <br> <center><strong><%= resultFri.getString("cid")%> </strong><br>
                    <em> <%=resultFri.getString("venue")%> </em></center></td>--%>
                </tr>
                <%}%>
            </tbody>
        </table>

        
    </body>
</html>
