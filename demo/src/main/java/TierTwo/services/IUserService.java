package TierTwo.services;

import TierTwo.models.User;

import java.util.List;

public interface IUserService
{
  User validateUser(String username, String password);
  List<User> getUsers();
  List<User> getUser(int userId);
  String registerUser(User user);
  String editUser(User user);
  void deleteUser(int userId);
}
