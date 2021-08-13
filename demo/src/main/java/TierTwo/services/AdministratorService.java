package TierTwo.services;

import TierTwo.models.Item;
import TierTwo.models.User;
import TierTwo.networking.Admin.AdministratorNetworking;
import TierTwo.networking.User.UserNetworking;

import java.util.List;

public class AdministratorService implements IAdministratorService
{
    private AdministratorNetworking administratorNetworking;
    private UserNetworking userNetworking;

    public AdministratorService(AdministratorNetworking administratorNetworking)
    {
        this.administratorNetworking = administratorNetworking;
    }
    @Override
    public String addItem(Item item)
    {

        return administratorNetworking.addItem(item);
    }

    @Override
    public void deleteItem(int itemId) {
        administratorNetworking.removeItem(itemId);
    }

    @Override
    public String editItem(Item item) {
        return administratorNetworking.editItem(item);
    }

    @Override
    public List<Item> getItem(int itemId) {
        return administratorNetworking.getItem(itemId);
    }

    @Override
    public List<Item> getItems() {
        return administratorNetworking.getItems();
    }

    @Override
    public User validateUser(String username, String password) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return userNetworking.getUsers();
    }

    @Override
    public List<User> getUser(int userId) {
        return userNetworking.getUser(userId);
    }

    @Override
    public String registerUser(User user) {
        return null;
    }

    @Override
    public String editUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }
}
