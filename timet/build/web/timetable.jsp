<%@page import = "java.sql.*"%>
<%@page import = "p.*"%>
<%Class.forName("com.mysql.jdbc.Driver");%>
<!DOCTYPE html>

<html>
<head>
<title>Time table</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
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
          
          <%
            String ID = request.getParameter("username");
            int t = 10;
            daytimet timeMon = new daytimet("Mon", ID);
            daytimet timeTue = new daytimet("Tue", ID);
            daytimet timeWed = new daytimet("Wed", ID);
            daytimet timeThu = new daytimet("Thu", ID);
            daytimet timeFri = new daytimet("Fri", ID);
            
            ResultSet resultMon = timeMon.ShowDay();//timemachine.showMon();
            ResultSet resultTue = timeTue.ShowDay();//timemachine.showTue();
            ResultSet resultWed = timeWed.ShowDay();//timemachine.showWed();
            ResultSet resultThu = timeThu.ShowDay();//timemachine.showThu();
            ResultSet resultFri = timeFri.ShowDay();
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
                <%while (t>0) {%>
                <tr>
                    <%if(resultMon.next()){%>
                    <td><center><%= resultMon.getString("start")%>-<%= resultMon.getString("end")%> 
                    <br> <strong><%= resultMon.getString("cid")%> <%= resultMon.getString("LT")%> </strong><br>
                    <em> <%=resultMon.getString("venue")%> </em></center></td>
                    <%}%>
                    
                    <%if(resultTue.next()){%>
                    <td><center><%= resultTue.getString("start")%>-<%= resultTue.getString("end")%> 
                    <br> <strong><%= resultTue.getString("cid")%> <%= resultTue.getString("LT")%></strong><br>
                    <em> <%=resultTue.getString("venue")%> </em></center></td>
                    <%}%>
                    <%if(resultWed.next()){%>
                    <td><center><%= resultWed.getString("start")%>-<%= resultWed.getString("end")%> 
                    <br> <strong><%= resultWed.getString("cid")%> <%= resultWed.getString("LT")%> </strong><br>
                    <em> <%=resultWed.getString("venue")%> </em></center></td>
                    <%}%>
                    <%if(resultThu.next()){%>
                    <td><center><%= resultThu.getString("start")%>-<%= resultThu.getString("end")%> 
                    <br><strong><%= resultThu.getString("cid")%> <%= resultThu.getString("LT")%> </strong><br>
                    <em> <%=resultThu.getString("venue")%> </em></center></td>
                    <%}%>
                    <%if(resultFri.next()){%>
                    <td><center><%= resultFri.getString("start")%>-<%= resultFri.getString("end")%> 
                    <br> <strong><%= resultFri.getString("cid")%> <%= resultFri.getString("cid")%>  </strong><br>
                    <em> <%=resultFri.getString("venue")%> </em></center></td>
                    <%}%>
                </tr>
                <%t--; } %>
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
    
    <!-- ################################################################################################ --> 
  </div>
</div>
<!-- JAVASCRIPTS --> 
<script src="layout/scripts/jquery.min.js"></script> 
<script src="layout/scripts/jquery.fitvids.min.js"></script> 
<script src="layout/scripts/jquery.mobilemenu.js"></script>
</body>
</html>