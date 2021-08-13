package TierTwo.networking.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkRequest
{
    @JsonProperty private NetworkType type;
    @JsonProperty private String content;

    public NetworkRequest(NetworkType type, String content)
    {
        this.type = type;
        this.content = content;
    }

    public NetworkRequest(NetworkType type)
    {
        this.type = type;
    }

    public NetworkType getType()
    {
        return type;
    }

    public String getContent()
    {
        return content;
    }

    @Override public String toString() {
        return "NetworkRequest{" + "networkType=" + type
                + ", content='" + content + '\'' + '}';
    }
}
