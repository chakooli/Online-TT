
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@  page import="p.GetBranch"%>
<%@  page import="p.GetExamDate" %>
<%@  page import="p.GetExamTime" %>
<%@  page import="p.Getup" %>
<%@  page import="p.GetCourses" %>
<%@  page import="p.GetImage" %>
<%@  page import="p.GetEndTime" %>
<%@  page import="p.GetName" %>
<jsp:useBean  id="v" class="p.GetBranch" scope="session"></jsp:useBean>
<jsp:useBean  id="n" class="p.GetName" scope="session"></jsp:useBean>
<jsp:useBean  id="g" class="p.GetExamDate" scope="session"></jsp:useBean>
<jsp:useBean  id="c" class="p.GetExamTime" scope="session"></jsp:useBean>
<jsp:useBean  id="a" class="p.Getup" scope="session"></jsp:useBean>
<jsp:useBean  id="gc" class="p.GetCourses" scope="session"></jsp:useBean>
<jsp:useBean  id="e" class="p.GetEndTime" scope="session"></jsp:useBean>
<jsp:useBean  id="i" class="p.GetImage" scope="session"></jsp:useBean>

<%
String uname = request.getParameter("username");
String pass = request.getParameter("password");
a.setUsername(uname);
a.setPassword(pass);
int j=0;
String name = n.getname(uname);
String image = i.getimage(uname);
String regcourses[] = gc.courses(uname);
String branch = v.getbranch(uname);
String date[] = g.getexamdate(regcourses);
String starttime[] = c.getstarttime(regcourses);
String endtime[] = e.getendtime(regcourses);
%>


<html>
<head>
<title>Hall Ticket</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all"></link>
<!-- / Demo styling - remove before use -->
<style type="text/css">

.container .group{text-align:center;}
.container .group div{padding:8px 0; font-size:16px; font-family:Verdana, Geneva, sans-serif;}
.container .group div:nth-child(odd){color:#FFFFFF; background:#CCCCCC;}
.container .group div:nth-child(even){color:#FFFFFF; background:#979797;}
@media screen and (min-width:180px) and (max-width:900px) {
	.container .group div{margin-bottom:0;}
}
</style>
<!-- / Demo styling -->
</head>
<body id="top">

<div class="wrapper row0">
  <div id="topbar" class="clear"> 
    
  </div>
</div>

<div class="wrapper row1"> 
  <br><header id="header" class="clear"> 
    <!-- ################################################################################################ -->
    <div id="logo" class="fl_left">
	<img src = "logo.png">
      <br><br><br><h1><font size = 18><a href="../index.html">Hall Ticket</a></font></h1>
      
    </div>
    
    <!-- ################################################################################################ --> 
  </header>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row2">
  <div class="rounded">
    <nav id="mainav" class="clear"> 
      <!-- ################################################################################################ -->
      <ul class="clear">
        <li><a href="#">Home</a></li>
		<li><a href="#">Profile</a></li>
		
		<li><a href="#">Course Registration</a></li>
		<li><a href="timet.html">Time Table</a></li>
		<li class ="active"><a href="hallt.jsp">Hall Ticket</a></li>
		<li><a href="#">View grade sheet</a></li>
		<li><a href="#">Logout</a></li>
      </ul>
      <!-- ################################################################################################ --> 
    </nav>
  </div>
</div>
<!-- section 1 --> 
<div class="wrapper row3">
  <div class="rounded">
    <div class="container clear"> 
      <!-- section content --> 
      <!-- ################################################################################################ -->
      <div class="group">
        <div class="one_half first">Academic session : 2015</div>
        <div class="one_half">Branch : <%=branch%></div>
      </div>
      <!-- ################################################################################################ --> 
      <!-- / section content -->
      <div class="clear"></div>
    </div>
  </div>
</div>
<!-- / section 1 --> 
<!-- ################################################################################################ -->
<div class="wrapper row3">
  <div class="rounded">
    <main class="container clear"> 
      <!-- main body --> 
      <!-- ################################################################################################ -->
     <img class="imgl borderedbox" src="" alt="image">
      <p><h1>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=name %></h1>
        <h1>Roll no. &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=uname%></h1> 
        <h1>Examination &nbsp;&nbsp;&nbsp;Mid Semester</h1></p>
      <div class="scrollable">
        <table>
          <thead>
            <tr>
              <th>Course Code</th>
              <th>Date</th>
        <th>Start Time</th>
        <th>End Time</th>
            </tr>
          </thead>
          <tbody>
            <tr>
            <%for(j=0;j<regcourses.length;j++){ %>
              <td><%=regcourses[j]%></td>
              <td><%=date[j]%></td>
              <td><%=starttime[j]%></td>
              <td><%=endtime[j]%></td>
            </tr>
            <%} %>
          </tbody>
        </table>
 </div>
<a>Print</a>
      <!-- / main body -->
      <div class="clear"></div>
    </main>
  </div>
</div>

<!-- / section 2 --> 


<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row4">
  <div class="rounded">
    <footer id="footer" class="clear"> 
      <!-- ################################################################################################ -->
      <div class="one_third first">
        <figure class="center"><img class="btmspace-15" src="map.png" alt="">
          <figcaption><a href="https://www.google.co.in/maps/place/IIT+Indore/@22.680911,75.876066,15z/data=!4m2!3m1!1s0x0:0xbc4a94ecc5ad388">Find Us With Google Maps &raquo;</a></figcaption>
        </figure>
      </div>
      <div class="one_third">
        <address>
		Indian Institute of Technology Indore,<br>
		Opposite to Veterinary College Mhow,<br> 
		Survey No. 113/2-B,Mhow Road,<br> 
	    Indore 453446, India<br>
        <br>
        <i class="fa fa-phone pright-10"></i> +91-732-4240777<br>
        <i class="fa fa-envelope-o pright-10"></i> <a href="#">securityhelpdesk@iiti.ac.in</a>
        </address>
   
      <!-- ################################################################################################ --> 
  </footer>
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row5">
  <div id="copyright" class="clear"> 
    <!-- ################################################################################################ -->
    <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - <a href="http://www.iiti.ac.in/">IIT Indore</a></p>
    <p class="fl_right">Designed by Dhruva and Parul</p>
    <!-- ################################################################################################ --> 
  </div>
</div>
<!-- JAVASCRIPTS --> 
<script src="layout/scripts/jquery.min.js"></script> 
<script src="layout/scripts/jquery.fitvids.min.js"></script> 
<script src="layout/scripts/jquery.mobilemenu.js"></script>
</body>
</html>

