package p;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetName {
	
		Dbcon databasecon = new Dbcon();
		Connection con = databasecon.dbconnect();
		public String getname(String uname)
		throws SQLException{
			
			String t = null;
			PreparedStatement ps = con.prepareStatement("select stud_name from student where stud_rollno = ?");
					ps.setString(1, uname);
					ResultSet rs = ps.executeQuery();
					while(rs.next()){
						t = rs.getString(1);
					}
			
			return t;
	}
	}


