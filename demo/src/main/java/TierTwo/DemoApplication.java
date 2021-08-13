package TierTwo;

import TierTwo.networking.communication.ClientConnection;
import TierTwo.networking.communication.SocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SocketClient client = new ClientConnection();
		client.startClient();
		SpringApplication.run(DemoApplication.class, args);

	}

}
