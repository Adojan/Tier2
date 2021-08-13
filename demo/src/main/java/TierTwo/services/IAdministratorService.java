package TierTwo.services;

import TierTwo.models.Item;
import TierTwo.models.User;

import java.util.List;

public interface IAdministratorService
{
    String addItem(Item item);
    void deleteItem(int itemId);
    String editItem(Item item);
    List<Item> getItem(int itemId);
    List<Item> getItems();

    User validateUser(String username, String password);
    List<User> getUsers();
    List<User> getUser(int userId);
    String registerUser(User user);
    String editUser(User user);
    void deleteUser(int userId);
}
