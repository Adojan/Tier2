package TierTwo.networking.User;

import TierTwo.models.User;
import TierTwo.networking.communication.SocketClient;
import TierTwo.networking.network.NetworkRequest;
import TierTwo.networking.network.NetworkType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserNetworking implements IUserNetworking
{
    @Autowired
    private SocketClient client;

    @Override
    public User validateUser(String username, String password)
    {
        Gson gson = new Gson();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        String serializedUser = gson.toJson(user);
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOGIN, serializedUser);
        String input = client.communication(networkRequest);
        return gson.fromJson(input, User.class);
    }

    @Override
    public String register(User user) {
        Gson gson = new Gson();
        String serializedUser = gson.toJson(user);
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.REGISTER, serializedUser);
        return client.communication(networkRequest);
    }

    @Override
    public List<User> getUsers() {
        Gson gson = new Gson();
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.USERS, null);
        String input = client.communication(networkRequest);
        System.out.println(input);
        return gson.fromJson(input, new TypeToken<List<User>>(){}.getType());
    }

    @Override
    public List<User> getUser(int userId) {
        Gson gson = new Gson();
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETUSER, String.valueOf(userId));
        String input = client.communication(networkRequest);
        return gson.fromJson(input, new TypeToken<List<User>>(){}.getType());
    }

    @Override
    public String editUser(User user) {
        Gson gson = new Gson();
        String serializedUser = gson.toJson(user);
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITUSER, serializedUser);
        return client.communication(networkRequest);
    }

    @Override
    public void deleteUser(int userId) {
       Gson gson = new Gson();
       NetworkRequest networkRequest = new NetworkRequest(NetworkType.DELETEUSER, String.valueOf(userId));
       client.communication(networkRequest);
    }
}
