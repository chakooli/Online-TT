package p;

import p.DBconn;
import java.sql.*;
public class getPassword {
        
        ResultSet rs = null;
        PreparedStatement ps = null;
        String P;
    
    public String checkpassword(String U)
    {
        DBconn con = new DBconn();
        Connection c = con.dbconnect();
   
        try{
        ps = c.prepareStatement("select pass from stud where sid = ?");
        ps.setString(1, U);
        rs = ps.executeQuery();
        while(rs.next())
            P = rs.getString("pass");
        return P;
        } catch(SQLException e){
        e.printStackTrace();
        }
        return null;
    }
    
}
