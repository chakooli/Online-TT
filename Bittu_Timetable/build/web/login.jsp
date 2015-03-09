<%-- 
    Document   : hall_T
    Created on : Mar 8, 2015, 10:19:36 PM
    Author     : bittu
--%>

<%@ page import ="java.sql.*" language ="java" %>
<%@ page import ="javax.sql.*" %>

<%
String userid = request.getParameter("uname");
String pwd = request.getParameter("pass");

try {
     if(userid.equals("bittu")&&pwd.equals("bittu")){ 
         session.setAttribute("uname",userid);
         response.sendRedirect("Time_Table.jsp");
}
     else{
response.sendRedirect("Invalid_Login.jsp");}
}
catch(Exception e){
e.printStackTrace();
}
%>