package TierTwo.networking.User;

import TierTwo.models.User;

import java.util.List;

public interface IUserNetworking
{
  User validateUser(String username, String password);
  String register(User user);
  List<User> getUsers();
  List<User> getUser(int userId);
  String editUser(User user);
  void deleteUser(int userId);
}
