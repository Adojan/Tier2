package TierTwo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User
{
    @JsonProperty
    private int userId;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private String address;
    @JsonProperty
    private String name;
    @JsonProperty
    private String email;
    @JsonProperty
    private String dob;
    @JsonProperty
    private List<Item> items;

    public User()
    {

    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override public String toString()
    {
        return "id:" + userId +
                "username:"+ username+ "   " +
                "password:"+password+ "   " +
                "address:"+address+ "   " +
                "email:"+email+ "   " +
                "dob:"+dob;
    }
}
