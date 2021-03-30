package be.geertmoris.eurder.repositories;

import be.geertmoris.eurder.customers.Address;
import be.geertmoris.eurder.customers.Customer;
import be.geertmoris.eurder.items.Item;
import be.geertmoris.eurder.orders.ItemGroup;
import be.geertmoris.eurder.orders.Order;
import be.geertmoris.eurder.services.ItemGroupService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Configuration
public class DummyData {

    private ItemGroupService itemGroupService;

    private final Item item1 = new Item("Dell 2021", "laptop", 950.23, 3);
    private final Item item2 = new Item("Nikon 530", "camera", 350.50, 1);
    private final Item item3 = new Item("Samsung Galaxy 7", "smartphone", 250.44, 2);

    private final Customer customer1 = new Customer("Geert", "Moris", "geert@mail.com",
            new Address("Straat", "72", "3217", "Averbode"), "0494878787");
    private final Customer customer2 = new Customer("Karel", "Van Roey", "karel@mail.com",
            new Address("Weggetje", "2A", "3000", "Leuven"), "0474323232");

    private final ItemGroup itGr1 = new ItemGroup(item1.getId(),1);
    private final ItemGroup itGr2 = new ItemGroup(item2.getId(),1);

    private final List<ItemGroup>itemGroupList=new ArrayList<>();

    private final Order order1 = new Order(customer1, itemGroupList, itemGroupService.calculateTotalPrice(itemGroupList));

    @Bean
    public Collection<Item> getItems() {
        return List.of(item1, item2, item3);
    }

    @Bean
    public Collection<Customer>getCustomers(){
        return List.of(customer1,customer2);
    }

    @Bean
    public Collection<ItemGroup>getItemGroup(){
        return List.of(itGr1,itGr2);
    }

}
