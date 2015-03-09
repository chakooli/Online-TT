<%-- 
    Document   : hall_T
    Created on : Mar 9, 2015, 12:12:55 AM
    Author     : bittu
--%>
<%@ page import ="java.sql.*" language ="java" %>
<%@ page import ="javax.sql.*" %>

<%

    String year= "bittu";
    String branch= "who gives a damn";
    
    String var11= "math";
    String var12= "math";
    String var13= "math";
    String var14= "math";
    String var15= "math";
    
    String var21= "math";
    String var22= "math";
    String var23= "math";
    String var24= "math";
    String var25= "math";
    
    String var31= "math";
    String var32= "math";
    String var33= "math";
    String var34= "math";
    String var35= "math";
    
    String var41= "math";
    String var42= "math";
    String var43= "math";
    String var44= "math";
    String var45= "math";

%>
<div class="group">
<div class="one_half first">Academic year : <%= year %></div>
<div class="one_half">Branch :  <%= branch %></div>
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
<tr>
<th> </th>
<th>Monday</th>
<th>Tuesday</th>
<th>Wednesday</th>
<th>Thursday</th>
<th>Friday</th>
</tr>
</thead>
<tbody>
<tr>
<td>Slot1</td>
<td> <%= var11 %> </td>
<td><%= var12 %></td>
<td><%= var13 %></td>
<td><%= var14 %></td>
<td><%= var15 %></td>
</tr>
<tr>
<td>Slot2</td>
<td><%= var21 %></td>
<td><%= var22 %></td>
<td><%= var23 %></td>
<td><%= var24 %></td>
<td><%= var25 %></td>
</tr>
<tr>
<td>Slot3</td>
<td><%= var31 %></td>
<td><%= var32 %></td>
<td><%= var33 %></td>
<td><%= var34 %></td>
<td><%= var35 %></td>
</tr>
<tr>
<td>Slot4</td>
<td><%= var41 %></td>
<td><%= var42 %></td>
<td><%= var43 %></td>
<td><%= var44 %></td>
<td><%= var45 %></td>
</tr> 
</tbody>
</table>
</html>