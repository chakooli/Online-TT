package p;
import static java.lang.Integer.parseInt;
import java.sql.*;
public class getSemester {
    Connection c = null;
    String Session = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public getSemester()
    {
        DBconn con = new DBconn();
        c = con.dbconnect();
    }
    public String getRes(String U){
        int i;
        try{
        ps = c.prepareStatement("select max(sem) from regis where sid = '"+U+"'");
        }catch(SQLException e){//renaming table every session will be required
        e.printStackTrace();
        }
        
        try {
        rs = ps.executeQuery();
        }catch(SQLException e){
        e.printStackTrace();
        }
        
        try{
            if(rs.next())
                Session = rs.getString("max(sem)");
        }catch(SQLException e){
        e.printStackTrace();
        }
        i = parseInt(Session);
        if(i%2==0)
            return "Spring";
        else
            return "Autumn";
    }
}
