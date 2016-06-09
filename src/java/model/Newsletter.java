
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Avishka Perera
 */
public class Newsletter {
    String sql;
    PreparedStatement ps;
    ResultSet rs;
    
    public int subscribe(String name,String email){
        try {
            sql = "INSERT INTO subscribers (name,email) VALUES (?,?)";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    public boolean alreadySubscribed(String name,String email){
        try {
            sql = "SELECT * FROM subscribers WHERE email=?";
            ps = Database.getConnection().prepareStatement(sql);            
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
}
