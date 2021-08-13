package TierTwo.networking.Admin;

import TierTwo.models.Item;
import TierTwo.networking.communication.SocketClient;
import TierTwo.networking.network.NetworkRequest;
import TierTwo.networking.network.NetworkType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministratorNetworking implements IAdministratorNetworking
{
    @Autowired
    SocketClient socketClient;

    @Override
    public String addItem(Item item) {
  Gson gson = new Gson();
  String serializedItem = gson.toJson(item);
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.ADDITEM, serializedItem);
        socketClient.communication(networkRequest);
        return serializedItem;
    }

    @Override
    public String editItem(Item editItem) {
  Gson gson = new Gson();
  String serializedItem = gson.toJson(editItem);
  NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITITEM, serializedItem);
  socketClient.communication(networkRequest);
        return serializedItem;
    }

    @Override
    public void removeItem(int adminId) {
 Gson gson = new Gson();
 NetworkRequest networkRequest = new NetworkRequest(NetworkType.REMOVEITEM, String.valueOf(adminId));
 socketClient.communication(networkRequest);
    }

   @Override
    public List<Item> getItem(int adminId) {
        Gson gson = new Gson();
        NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETITEM, String.valueOf(adminId));
        String input = socketClient.communication(networkRequest);
        return gson.fromJson(input, new TypeToken<List<Item>>(){}.getType());
    }

    @Override
    public List<Item> getItems() {
       Gson gson = new Gson();
       NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETITEMS, null);
       String input = socketClient.communication(networkRequest);
        System.out.println(input);
        return gson.fromJson(input, new TypeToken<List<Item>>(){}.getType());
    }
}
