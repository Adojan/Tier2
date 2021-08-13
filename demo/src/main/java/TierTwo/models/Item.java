package TierTwo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item
{
    @JsonProperty
    private int itemId;
    @JsonProperty
    private String itemName;
    @JsonProperty
    private String seller;
    @JsonProperty
    private String description;
    @JsonProperty
    private String price;

    public Item() {
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getSeller() {
        return seller;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id:" + itemId +
                "itemName:" + itemName + "   " +
                "seller:" + seller + "   " +
                "description:" + description + "   " +
                "price:" + price;
    }
}
