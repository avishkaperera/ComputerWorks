package model;

import beans.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Avishka Perera
 */
public class UserClass {

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public boolean validateLogin(String username, String password) {
        try {
            sql = "SELECT Username,Password,Verify FROM customer WHERE Username=? AND Password=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getBoolean("Verify")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }

    public int registerUser(User obj) {
        try {
            String pass = User.encryptPassword(obj.getPassword(), obj.getUsername());
            sql = "INSERT INTO customer (Username,Password,FName,LName,Address,Email,Contact) VALUES (?,?,?,?,?,?,?)";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, obj.getUsername());
            ps.setString(2, pass);
            ps.setString(3, obj.getFname());
            ps.setString(4, obj.getLname());
            ps.setString(5, obj.getAddress());
            ps.setString(6, obj.getEmail());
            ps.setString(7, obj.getContact());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            return 0;
        }

    }

    public int verifyAccount(String username) {
        try {
            sql = "UPDATE customer SET Verify=1 WHERE Username=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        }
    }

    public boolean checkUsername(String username) {
        try {
            sql = "SELECT Username FROM customer WHERE Username=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public int resetPassword(String username,String password){
        try {
            String pass = User.encryptPassword(password, username);
            sql = "UPDATE customer SET Password=? WHERE Username=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, username);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    public User getUser(String username){
        try {
            sql = "SELECT * FROM customer WHERE Username=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if(rs.next()){
                User obj = new User();
                obj.setAddress(rs.getString("Address"));
                obj.setContact(rs.getString("Contact"));
                obj.setEmail(rs.getString("Email"));
                obj.setFname(rs.getString("FName"));
                obj.setLname(rs.getString("LName"));
                return obj;
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public int updateUser(User obj){
        try {
            sql = "UPDATE customer SET FName=?,LName=?,Email=?,Address=?,Contact=? WHERE Username=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, obj.getFname());
            ps.setString(2, obj.getLname());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getAddress());
            ps.setString(5, obj.getContact());
            ps.setString(6, obj.getUsername());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        }
    }

}
