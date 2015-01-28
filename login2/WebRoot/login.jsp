<%@ page import ="java.sql.*" language ="java" %>
<%@ page import ="javax.sql.*" %>
<%

    String userid = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    try{
    Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_new", "root", "");
                Statement s = con.createStatement();
                String query = "select login_id, password from member";
                ResultSet rs = s.executeQuery(query);
                while(rs.next()){
                    if(userid.equals(rs.getString("login_id"))&&pwd.equals(rs.getString("password"))){
                    	con.close();
                    	response.sendRedirect("success.jsp");
                    }
                }
        }catch(Exception e){
        e.printStackTrace();
        }        
%>