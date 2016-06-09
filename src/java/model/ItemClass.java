package model;

import beans.Items;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Avishka Perera
 */
public class ItemClass {

    String sql;
    PreparedStatement ps;
    ResultSet rs;
    int noOfRecords;

    public ArrayList<Items> getLatestItems() {
        try {
            sql = "SELECT * FROM items ORDER BY itemID DESC LIMIT 8";
            ps = Database.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            ArrayList<Items> list = new ArrayList<>();
            Items item;
            while (rs.next()) {
                item = new Items();
                item.setItemId(rs.getInt("itemID"));
                item.setItemName(rs.getString("itemName"));
                item.setItemDescription(rs.getString("itemDescription"));
                item.setItemPrice(rs.getDouble("itemPrice"));
                list.add(item);
            }
            return list;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Items> getOneItem(int itemID) {
        try {
            sql = "SELECT * FROM items WHERE itemID=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setInt(1, itemID);
            rs = ps.executeQuery();
            Comments objComments = new Comments();
            Items item;
            ArrayList<Items> list = new ArrayList<Items>();
            while (rs.next()) {
                item = new Items();
                item.setItemId(rs.getInt("itemID"));
                item.setItemName(rs.getString("itemName"));
                item.setItemDescription(rs.getString("itemDescription"));
                item.setItemPrice(rs.getDouble("itemPrice"));
                item.setItemCategory(rs.getString("itemCategory"));
                item.setItemWarranty(rs.getInt("itemWarranty"));
                item.setItemBrand(rs.getString("itemBrand"));
                item.setList(objComments.getLessComments(itemID));
                list.add(item);
            }
            return list;
        } catch (SQLException ex) {
            return null;
        }

    }

    public ArrayList<Items> getAllProducts(int offset, int records) {
        try {

            sql = "SELECT SQL_CALC_FOUND_ROWS * FROM items LIMIT ?,?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setInt(1, offset);
            ps.setInt(2, records);
            rs = ps.executeQuery();
            ArrayList<Items> list = new ArrayList<Items>();
            Items item;
            while (rs.next()) {
                item = new Items();
                item.setItemId(rs.getInt("itemID"));
                item.setItemName(rs.getString("itemName"));
                item.setItemDescription(rs.getString("itemDescription"));
                item.setItemPrice(rs.getDouble("itemPrice"));
                list.add(item);
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

    public ArrayList<Items> getAllProductsByCategory(String category, int offset, int records) {
        try {
            sql = "SELECT SQL_CALC_FOUND_ROWS * FROM items WHERE itemCategory=? LIMIT ?,?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, category);
            ps.setInt(2, offset);
            ps.setInt(3, records);
            rs = ps.executeQuery();
            ArrayList<Items> list = new ArrayList<Items>();
            Items item;
            while (rs.next()) {
                item = new Items();
                item.setItemId(rs.getInt("itemID"));
                item.setItemName(rs.getString("itemName"));
                item.setItemDescription(rs.getString("itemDescription"));
                item.setItemPrice(rs.getDouble("itemPrice"));
                list.add(item);
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
