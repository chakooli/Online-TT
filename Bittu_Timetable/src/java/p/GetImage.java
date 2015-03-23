package p;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetImage {
		Dbcon databasecon = new Dbcon();
		Connection con = databasecon.dbconnect();
		public String getimage(String uname)
		throws SQLException{
			String t = null;
			PreparedStatement ps = con.prepareStatement("select imagepath from student where stud_rollno = ?");
					ps.setString(1, uname);
					ResultSet rs = ps.executeQuery();
					while(rs.next()){
						t = rs.getString(1);
					}
			return t;
		}
}

