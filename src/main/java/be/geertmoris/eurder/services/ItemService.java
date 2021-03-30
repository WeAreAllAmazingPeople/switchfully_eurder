package be.geertmoris.eurder.services;

import be.geertmoris.eurder.items.Item;
import be.geertmoris.eurder.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public Item getItemById(String id) {
        return itemRepository.getItemById(id);
    }
}
