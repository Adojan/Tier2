package TierTwo.networking.communication;

import TierTwo.networking.network.NetworkRequest;

public interface SocketClient
{
    void startClient();
    String communication(NetworkRequest networkPackage);
    void disconnect();

}
