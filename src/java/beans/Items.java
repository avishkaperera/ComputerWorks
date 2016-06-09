
package beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Avishka Perera
 */
public class Items implements Serializable{
    
    private int itemId;
    private String itemName;
    private String itemBrand;
    private String itemDescription;
    private String itemCategory;
    private double itemPrice;
    private int itemWarranty;
    private int itemQuantity;
    private byte[] itemImage;
    private ArrayList<Review> list;

    public ArrayList<Review> getList() {
        return list;
    }

    public void setList(ArrayList<Review> list) {
        this.list = list;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemWarranty() {
        return itemWarranty;
    }

    public void setItemWarranty(int itemWarranty) {
        this.itemWarranty = itemWarranty;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public byte[] getItemImage() {
        return itemImage;
    }

    public void setItemImage(byte[] itemImage) {
        this.itemImage = itemImage;
    }
    
}
