package p;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetOnlyCourses {
		DBconn databasecon = new DBconn();
		Connection con = databasecon.dbconnect();
		public String[] getcourses(String username) throws SQLException{
			int i=0, count = 0;
			PreparedStatement ps= con.prepareStatement("select count(*) from regis where sid = ?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				count = Integer.parseInt(rs.getString(1));
            }
			String regcourses[] = new String[count];
			ps = con.prepareStatement("select cid from regis where sid = ?");
			ps.setString(1, username);
			rs = ps.executeQuery();
            while(rs.next()){
                regcourses[i] = rs.getString("cid");
                i++;
                }
           
			return regcourses;
		}
}
