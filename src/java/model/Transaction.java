package model;

import beans.Items;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Avishka Perera
 */
public class Transaction {

    String sql;
    PreparedStatement ps;
    ResultSet rs;
    

    public ArrayList<Items> getPurchaseHistory(String username) {

        try {
            sql = "SELECT o.itemID as 'ItemId',o.itemQuantity as 'ItemQty',o.itemPrice as 'ItemPrice'";
            sql += ",i.itemName as 'ItemName',i.itemBrand as 'ItemBrand',i.itemCategory as 'ItemCategory'";
            sql += " FROM orders as o,items as i WHERE o.Username=? ";
            sql += "AND i.itemID=o.itemID";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            Items item;
            ArrayList<Items> list = new ArrayList<Items>();
            while (rs.next()) {
                item = new Items();
                item.setItemId(rs.getInt("ItemId"));
                item.setItemQuantity(rs.getInt("ItemQty"));
                item.setItemPrice(rs.getDouble("ItemPrice"));
                item.setItemName(rs.getString("ItemName"));
                item.setItemBrand(rs.getString("ItemBrand"));
                item.setItemCategory(rs.getString("ItemCategory"));
                list.add(item);
            }
            return list;
        } catch (SQLException ex) {
            return null;
        }

    }

    public byte[] getImage(int id) {
        try {
            sql = "SELECT itemImage FROM items WHERE itemID=?";
            ps = Database.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getBytes("itemImage");
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
    

    
}
