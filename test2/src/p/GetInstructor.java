package p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetInstructor {
	Dbcon databasecon = new Dbcon();
	Connection con = databasecon.dbconnect();
	public int instructor() throws SQLException{
		GetCourses g = new GetCourses();
		int regcourses;
		int i = 0, count = 0 ;
		regcourses = g.courses();
		String countq = "select count(*) from course_instructor where coursecode = "+regcourses+";";
		PreparedStatement ps= con.prepareStatement(countq);
		ResultSet countrs = ps.executeQuery(countq);
		while(countrs.next()){
			count = countrs.getInt(1);
        }
		String instructorno[] = new String[count];
		String query = "select instructor.shorthand from instructor inner join course_instructor" +
				" on instructor.instructor_id = course_instructor.instructor_id " +
				"where course_instructor.coursecode = "+regcourses+";";
		ResultSet rs = ps.executeQuery(query);
        while(rs.next()){
            }
		return regcourses;
		
		
			
	}
	
	

}
