<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@  page import="p.Validateup"%>
<%@  page import="p.Getup" %>
<%@  page import="p.GetCourses" %>
<jsp:useBean  id="v" class="p.Validateup" scope="session"></jsp:useBean>
<jsp:useBean  id="g" class="p.Getup" scope="session"></jsp:useBean>
<jsp:useBean  id="c" class="p.GetCourses" scope="session"></jsp:useBean>

<html>

<%
String uname = request.getParameter("username");
String pass = request.getParameter("password");
g.setUsername(uname);
g.setPassword(pass);
if(v.check(uname, pass)==1){%>
<body>login successful!
<%
try{int regcourses = c.courses();
 	out.println("d");
 	int i = 0;
 	out.println("d"+g.getUsername());
 	for(i = 0;i<2;i++){
 	out.println("d"+regcourses);
 	}}catch(Exception e){
 	e.printStackTrace();}%>
 </body>
<%
}
else{
response.sendRedirect("index.jsp");
%>
<%
} 
 %>
</html>