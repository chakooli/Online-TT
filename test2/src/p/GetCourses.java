package p;
import java.sql.*;

public class GetCourses {
		Dbcon databasecon = new Dbcon();
		Connection con = databasecon.dbconnect();
		public String[] courses(String username) throws SQLException{
			int i=0, count = 0;
			int u = Integer.parseInt(username);
			PreparedStatement ps= con.prepareStatement("select " +
					"count(*) from reg_courses where stud_rollno = ?");
			ps.setLong(1, u);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				count = rs.getInt(1);
            }
			String regcourses[] = new String[count];
			ps = con.prepareStatement("select coursecode" +
					" from reg_courses where stud_rollno = ?");
			ps.setLong(1, u);
			rs = ps.executeQuery();
            while(rs.next()){
                regcourses[i] = rs.getString("coursecode");
                i++;
                }
			return regcourses;
		}
}
