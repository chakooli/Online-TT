<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@  page import="p.Validateup"%>
<%@  page import="p.Getup" %>
<%@  page import="p.GetCourses" %>
<jsp:useBean  id="v" class="p.Validateup" scope="session"></jsp:useBean>
<jsp:useBean  id="g" class="p.Getup" scope="session"></jsp:useBean>
<jsp:useBean  id="c" class="p.GetCourses" scope="session"></jsp:useBean>
<jsp:useBean  id="ins" class="p.GetInstructor" scope="session"></jsp:useBean>
<jsp:useBean  id="t" class="p.GetType" scope="session"></jsp:useBean>
<jsp:useBean  id="d" class="p.GetDay" scope="session"></jsp:useBean>
<html>

<%
String uname = request.getParameter("username");
String pass = request.getParameter("password");
g.setUsername(uname);
g.setPassword(pass);
if(v.check(uname, pass)==1){%>
<body>login successful!
<%
try{
	String[] regcourses = c.courses(uname);
 	int i = 0, j;
 	for(i=0;i<regcourses.length;i++){
 	out.println("\t"+regcourses[i]);
 	}
 	String[][] instruc = ins.instructor(uname, regcourses);
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
 String courseday[] = d.getday(regcourses, "Monday");
 for(j=0;j<courseday.length;j++){
 if(courseday[j]!=null){
 out.println("\t"+courseday[j]);
 }
 }
 	}catch(Exception e){
 	e.printStackTrace();}%>
 </body>
<%
}
else{
response.sendRedirect("index.html");
%>
<%
} 
 %>
</html>