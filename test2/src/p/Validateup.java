package p;

import java.sql.*;

public class Validateup {
	Dbcon databasecon = new Dbcon();
	Connection con = databasecon.dbconnect();
	public int check(String u, String p) throws Exception{
        Statement s = con.createStatement();
        String query = "select stud_rollno, password from student";
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){
        	if(u.equals(rs.getString("stud_rollno"))&&p.equals(rs.getString("password"))){
        		return 1;
        	}
        }
return 0;
}
}
