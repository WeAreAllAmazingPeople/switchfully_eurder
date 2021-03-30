package be.geertmoris.eurder.services;

import be.geertmoris.eurder.orders.ItemGroup;
import be.geertmoris.eurder.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemGroupService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemGroupService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public double calculateTotalPrice(List<ItemGroup> itemGroupList){
        if(itemGroupList.isEmpty()){
            throw new IllegalArgumentException("No items in order list");
        }
        return itemGroupList.stream().mapToDouble(item -> item.getItemGroupPrice())
                .sum();

    }


}
