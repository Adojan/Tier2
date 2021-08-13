package TierTwo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Administrator
{
    @JsonProperty
    private int adminId;
    @JsonProperty
    private String adminUsername;
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
    @JsonProperty
    private List<User> users;

    public Administrator() {
    }

    public int getId() {
        return adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
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

    public List<User> getUsers() {
        return users;
    }

    public void setId(int adminId) {
        this.adminId = adminId;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
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

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
