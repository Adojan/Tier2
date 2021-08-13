package TierTwo.networking.Admin;

import TierTwo.models.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IAdministratorNetworking
{
    String addItem(Item item);
    String editItem(Item editItem);
    void removeItem(int adminId);
    List<Item> getItem(int adminId);
    List<Item> getItems();
}
