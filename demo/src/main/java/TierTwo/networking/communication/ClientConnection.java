package TierTwo.networking.communication;

import TierTwo.networking.network.NetworkRequest;
import TierTwo.networking.network.NetworkType;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

@Component
public class ClientConnection implements SocketClient
{

    @Override
    public void startClient() {
        try{
            new Thread(() -> communication(new NetworkRequest(NetworkType.CONNECTION, "connectionFromTier2"))).start();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String communication(NetworkRequest networkRequest) {
        try {
            Gson gson = new Gson();
            Socket socket = new Socket("localhost", 8070);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            String request = gson.toJson(networkRequest);
            byte[] requestVytes = request.getBytes();
            outputStream.write(requestVytes);

            byte[] data = new byte[2048];
            int count = inputStream.read();
            String string = new String(data, 0, count);
            System.out.println("Got string " + string);
            return string;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void disconnect() {

    }
}
