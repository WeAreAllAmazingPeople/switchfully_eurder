package be.geertmoris.eurder.orders;

import be.geertmoris.eurder.items.Item;
import be.geertmoris.eurder.services.ItemService;

import java.time.LocalDate;


public class ItemGroup {

    private ItemService itemService;

    private final String itemId;
    private int amountOrdered;
    private LocalDate shippingDate;

    public ItemGroup(String itemId, int amountOrdered) {
        this.itemId = itemId;
        this.amountOrdered = amountOrdered;
        calculateShippingDate(searchItem(itemId));

    }

    public LocalDate calculateShippingDate(Item item){
        if(item.getStock()>0){
            this.shippingDate= LocalDate.now().plusDays(1);
        }else{
            this.shippingDate=LocalDate.now().plusDays(7);
        }
        return this.shippingDate;
    }

    public Item searchItem(String itemId){
        return this.itemService.getItemById(itemId);
    }

    public String getItemId() {
        return itemId;
    }

    public int getAmountOrdered() {
        return amountOrdered;
    }

    public double getItemGroupPrice(){
        return searchItem(this.itemId).getPrice() * this.amountOrdered;
    }
}
