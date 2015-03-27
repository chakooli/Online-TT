
package p;

import java.sql.*;

/*
 * @author Dhruva
 */
public class getBranch {
    Connection c;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public getBranch(){
        DBconn con = new DBconn();
        c = con.dbconnect();
    }
      public String getRes(String U){
        String S = null;
        try{    
        ps = c.prepareStatement("select branch from stud where sid = '"+U+"'");
        }catch(SQLException e){
        e.printStackTrace();
        }
        
        try {
        rs = ps.executeQuery();
        }catch(SQLException e){
        e.printStackTrace();
        }
        
        try{
            if(rs.next())
                S = rs.getString("branch");
        }catch(SQLException e){
        e.printStackTrace();
        }
       return S;
      }
}