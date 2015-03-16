package p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GetTime {
	Dbcon databasecon = new Dbcon();
	Connection con = databasecon.dbconnect();
	public String[][][] gettime(String days[][]) throws SQLException{
		String time[][][] = new String[days.length][7][2];
		for(int i=0;i<days.length;i++){
			for(int j=0;j<days[i].length;j++){
				PreparedStatement ps = con.prepareStatement("select s_time, e_time from courses_details where coursecode = ? and day = ?");
				
				
			}
		}
		
		return null;
		
	}

}
