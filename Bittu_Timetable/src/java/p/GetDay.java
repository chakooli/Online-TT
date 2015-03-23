package p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetDay {	
	Dbcon databasecon = new Dbcon();
	Connection con = databasecon.dbconnect();
	public String[] getday(String[] regcourses, String day) throws SQLException{
		String course[] = new String[regcourses.length];
		int k = 0;
		for(int i=0;i<regcourses.length;i++){
			PreparedStatement ps = con.prepareStatement("select coursecode from course_details where coursecode = ? and day = ?");
			ps.setString(1, regcourses[i]);
			ps.setString(2, day);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				course[k] = rs.getString("coursecode");
				k++;
			}
		}
		return course;
	}
}
