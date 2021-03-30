package be.geertmoris.eurder.repositories;

import be.geertmoris.eurder.items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Repository
public class ItemRepository {

private final HashMap<String, Item> itemsById = new HashMap();

    @Autowired
    public ItemRepository(Collection<Item> items) {
        if (items != null) {
            items.stream()
                    .filter(item -> item != null)
                    .forEach(item -> itemsById.put(item.getId(), item));
        }
    }

    public List<Item> getAllItems() {
         return new ArrayList<>(itemsById.values());
    }

    public Item getItemById(String id) {
        if (itemsById.get(id) == null) {
            throw new IllegalArgumentException("Item with id " + id + " does not exist");
        }
        return itemsById.get(id);
    }
}
