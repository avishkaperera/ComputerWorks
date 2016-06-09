package model;

import beans.Review;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Avishka Perera
 */
public class Comments {

    String sql;
    PreparedStatement ps;
    ResultSet rs;
    int noOfRecords;

    public ArrayList<Review> getLessComments(int id) {
        try {
            sql = "SELECT * FROM comments WHERE itemID=? ORDER BY timestamp DESC LIMIT 3";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            ArrayList list = new ArrayList();
            Review obj;
            while (rs.next()) {
                obj = new Review();
                obj.setProductId(rs.getString("itemID"));
                obj.setName(rs.getString("name"));
                obj.setComment(rs.getString("comment"));
                obj.setTimestamp(rs.getString("timestamp"));
                list.add(obj);
            }
            return list;

        } catch (SQLException ex) {
            return null;
        }

    }

    public int insertComment(String id, String name, String comment) {
        try {
            sql = "INSERT INTO comments (itemID,name,comment) VALUES (?,?,?)";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, comment);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        }

    }

    public ArrayList<Review> getAllComments(String id, int offset, int records) {
        try {
            sql = "SELECT SQL_CALC_FOUND_ROWS * FROM comments WHERE itemID=? ORDER BY timestamp DESC LIMIT ?,?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, id);
            ps.setInt(2, offset);
            ps.setInt(3, records);
            ArrayList<Review> list = new ArrayList<Review>();
            Review obj;
            rs = ps.executeQuery();
            while (rs.next()) {
                obj = new Review();
                obj.setProductId(rs.getString("itemID"));
                obj.setName(rs.getString("name"));
                obj.setComment(rs.getString("comment"));
                obj.setTimestamp(rs.getString("timestamp"));
                list.add(obj);
            }
            rs.close();
            rs = ps.executeQuery("SELECT FOUND_ROWS()");
            if (rs.next()) {
                this.noOfRecords = rs.getInt(1);
            }
            return list;
        } catch (SQLException ex) {
            return null;
        }
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }
}
