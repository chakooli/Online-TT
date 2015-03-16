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


<%
String uname = request.getParameter("username");
String pass = request.getParameter("password");
g.setUsername(uname);
g.setPassword(pass);
if(v.check(uname, pass)==1){
	String[] regcourses = c.courses(uname);
	String[][] instruc = ins.instructor(uname, regcourses);
 	int i = 0, j;%>
 	
 	<%/*String[][] instruc = ins.instructor(uname, regcourses);
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
 */%>

<html>
<head>
<title>Time table</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="../layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
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
  <header id="header" class="clear"> 
    <!-- ################################################################################################ -->
    <div id="logo" class="fl_left">
	<img src = "logo.png">
      <br><br><br><h1><font size = 18><a href="../index.html">Time Table</a></font></h1>
      
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
		<li class ="active"><a href="timet.html">Time Table</a></li>
		<li><a href="hallt.html">Hall Ticket</a></li>
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
        <div class="one_half first">Academic year : XXXX</div>
        <div class="one_half">Branch : XXX</div>
      </div>
      <!-- ################################################################################################ --> 
      <!-- / section content -->
      <div class="clear"></div>
    </div>
  </div>
</div>
<div class="wrapper row3">
  <div class="rounded">
    <main class="container clear"> 
<h1>Updated</h1>
      <div class="scrollable">
        <table>
          <thead>
              <td></td>
              <td>Monday</td>
              <td>Tuesday</td>
              <td>Wednesday</td>
			  <td>Thursday</td>
			  <td>Friday</td>
            
          </thead>
          <tbody>
          	<tr>    
              <% for(i=0;i<regcourses.length;i++){%>
              <td>Slot#</td>
              <td><%=regcourses[i]%>
              <%
              for(j=0;j<instruc[i].length;j++){
 				if(instruc[i][j]!=null){%>
 				</b><%=instruc[i][j]%>
             </td>
              </tr>
              <%}}}}%>
          </tbody>
        </table>
 </div>
  <div class="clear"></div>
    </main>
  </div>
</div>

<!-- / section 1 --> 
<!-- section 2 --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<!--<div class="wrapper row3">
  <div class="rounded">
    <div class="container clear"> 
    
      <div class="group btmspace-5">
        <div class="one_quarter first">1/4</div>
        <div class="one_quarter">1/4</div>
        <div class="one_quarter">1/4</div>
        <div class="one_quarter">1/4</div>
      </div>
      <div class="group btmspace-5">
        <div class="one_quarter first">1/4</div>
        <div class="one_quarter">1/4</div>
        <div class="two_quarter">2/4 or 1/2</div>
      </div>
      <div class="group">
        <div class="one_quarter first">1/4</div>
        <div class="three_quarter">3/4</div>
      </div>
      
      <div class="clear"></div>
    </div>
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
<script src="../layout/scripts/jquery.min.js"></script> 
<script src="../layout/scripts/jquery.fitvids.min.js"></script> 
<script src="../layout/scripts/jquery.mobilemenu.js"></script>
</body>
</html>