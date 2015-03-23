package p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetInstructor {
	Dbcon databasecon = new Dbcon();
	Connection con = databasecon.dbconnect();
	public String[][] instructor(String username, String regcourses[])
	throws SQLException{
		int i = 0, k;
		String[][] ins = new String[regcourses.length][4];
		for(i=0;i<regcourses.length;i++){
		PreparedStatement ps = con.prepareStatement("select instructor.shorthand from instructor inner join course_instructor" +
				" on instructor.instructor_id = course_instructor.instructor_id " +
				"where course_instructor.coursecode = ?");
		ps.setString(1, regcourses[i]);
		ResultSet rs = ps.executeQuery();
		k=0;
        while(rs.next()){
        	ins[i][k] = rs.getString(1);
        	k++;
        }
		}
		return ins;
	}
	
	

}
