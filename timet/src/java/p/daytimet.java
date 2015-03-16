package p;

import p.DBconn;
import java.sql.*;
public class daytimet {
        PreparedStatement selectday = null;
        ResultSet rs = null;
    
    public daytimet(String D, String U)
    {
        DBconn con = new DBconn();
        Connection c = con.dbconnect();
   
        try{
        selectday = c.prepareStatement("select start, end, timet.cid, venue, LT from timet inner join regis on (timet.cid = regis.cid) where sid = '"+U+"' and day = '"+D+"'");
        } catch(SQLException e){
        e.printStackTrace();
        }
    }
    public ResultSet ShowDay(){
                try {
                    rs = selectday.executeQuery();
                }catch(SQLException e){
                e.printStackTrace();
                }
                return rs;
            }
    
}
