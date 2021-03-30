package be.geertmoris.eurder.items;

import java.util.UUID;

public class Item {

    private final String id;
    private String itemName;
    private String description;
    private double price;
    private int stock;

    public Item(String itemName, String description, double price, int stock) {
        this(UUID.randomUUID().toString(), itemName, description, price, stock);

    }

    public Item(String id, String itemName, String description, double price, int stock) {
        assertItemName(itemName);
        assertDescription(description);
        assertPrice(price);
        assertStock(stock);

        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    private void assertItemName(String itemName) {
        if (itemName  == null) {
            throw new IllegalArgumentException("the name of the item must be specified");
        }
    }

    private void assertDescription(String description) {
        if (description  == null) {
            throw new IllegalArgumentException("you have to give a description");
        }
    }

    private void assertPrice(double price) {
        if (price  == 0) {
            throw new IllegalArgumentException("the price of the item must be specified");
        }
    }

    private void assertStock(int stock) {
        if (stock  == 0) {
            throw new IllegalArgumentException("the stock amount of the item must be specified");
        }
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
