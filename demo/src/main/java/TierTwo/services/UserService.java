package TierTwo.services;

import TierTwo.models.User;
import TierTwo.networking.User.UserNetworking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService
{
    @Autowired UserNetworking userNetworking;

    public UserService(UserNetworking userNetworking)
    {
       this.userNetworking = userNetworking;
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
        return userNetworking.register(user);
    }

    @Override
    public String editUser(User user) {
        return userNetworking.editUser(user);
    }

    @Override
    public void deleteUser(int userId) {
  userNetworking.deleteUser(userId);
    }
}
