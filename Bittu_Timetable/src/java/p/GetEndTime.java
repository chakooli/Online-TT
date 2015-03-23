package p;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetEndTime {
	
		Dbcon databasecon = new Dbcon();
		Connection con = databasecon.dbconnect();
		public String[] getendtime(String regcourses[])
		throws SQLException{
			
			String t[] = new String[regcourses.length];
			for(int i=0;i<regcourses.length;i++){
			PreparedStatement ps = con.prepareStatement("select endtime from exam_details where coursecode = ?");
					ps.setString(1, regcourses[i]);
					ResultSet rs = ps.executeQuery();
					while(rs.next()){
						t[i] = rs.getString(1);
					}
			}
			return t;
	}
	}


