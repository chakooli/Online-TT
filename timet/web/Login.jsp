<%-- 
    Document   : Login
    Created on : Mar 11, 2015, 6:23:56 PM
    Author     : Dhruva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Welcome!! Login to see your timetable</h1>
        <form name="login_form" action="timetable.jsp" method="POST">
            Username  <input type="text" name="username" value="" size="20" /> <br>
            Password  <input type="password" name="password" value="" size="20" /><br>
            <input type="submit" value="Login" name="login_button" />
        </form>
    </body>
</html>
