package p;
import java.sql.*;

public class Dbcon{
	
	Dbcon(){
		this.dbconnect();
	}
	
	public Connection dbconnect() {
		// TODO Auto-generated method stub
		try{
	        Class.forName("com.mysql.jdbc.Driver");
	                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "");
	                return con;
		}
		catch(Exception e){
	    	e.printStackTrace();
		}
		return null;
	}
}


                                   