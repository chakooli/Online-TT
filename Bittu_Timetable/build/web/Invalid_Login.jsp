<%-- 
    Document   : hall_T
    Created on : Mar 8, 2015, 10:45:25 PM
    Author     : bittu
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<meta charset="utf-8">
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
<img src = "images/logo.png">
<br><br><br><h1><font size = 18>Login</font></h1>
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
<li class ="active"><a href="#">Home</a></li>
<li><a href="#">Profile</a></li>
<li><a href="#">Course Registration</a></li>
<li><a href="Time_Table.jsp">Time Table</a></li>
<li><a href="hall_T.jsp">Hall Ticket</a></li>
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
<div align="center">
    Either your Username or Password was wrong</br>
    Please Try again</br></br>
<form action="login.jsp" method="post">
<div class="one_third_first">
<label for="username">User Name <span>*</span></label>
<input type="text" name="uname" id="username" value="" size="22">
</div><br>
<div class="one_third_first">
<label for="password">Password <span>*</span></label>
<input type="text" name="pass" id="password" value="" size="22">
</div><br>
<div>
<input name="submit" type="submit" value="Submit Form">
&nbsp;
</div></font>
</div></div>
<!-- ################################################################################################ -->
<!-- / section content -->
<div class="clear"></div>
</div>
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
<figure class="center"><img class="btmspace-15" src="images/map.png" alt="">
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
<p class="fl_right">Designed by Dhruva and Parul, a little bit by Bittu :)</p>
<!-- ################################################################################################ -->
</div>
</div>
<!-- JAVASCRIPTS -->
<script src="../layout/scripts/jquery.min.js"></script>
<script src="../layout/scripts/jquery.fitvids.min.js"></script>
<script src="../layout/scripts/jquery.mobilemenu.js"></script>
</body>
</html>
<title>IIT INDORE</title>
</head>
<body>
<form method="post" action="login.jsp">
    Either your Username or Password was wrong</br>
    Please Try again</br>
Login Here</br>
User Name:<input type="text" name="uname" /></br>
Password:<input type="password" name="pass" /></br>
<input type="submit" value="Login" /></br>
<input type="reset" value="Reset" /></br>
</form>
</body>
</html>