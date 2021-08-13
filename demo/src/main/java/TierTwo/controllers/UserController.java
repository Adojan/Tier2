package TierTwo.controllers;

import TierTwo.models.User;
import TierTwo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    IUserService userServices;

    @PostMapping("/login")
    public User validateUser(@RequestBody User user) {
        return userServices.validateUser(user.getName(), user.getPassword());
    }

    @GetMapping("/register")
    public String register(@RequestBody User user)
    {
        System.out.println(user);
        return userServices.registerUser(user);
    }

    @GetMapping("/users")
        public List<User> getUsers ()
        {
          return userServices.getUsers();
        }

    @GetMapping("/user/{id}")
    public List<User> getUser(int userId)
    {
        return userServices.getUser(userId);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int userId)
    {
      userServices.deleteUser(userId);
    }

    @PutMapping("/users/{userId}")
    public String editUser(@RequestBody User user)
    {
      return userServices.editUser(user);
    }
}
