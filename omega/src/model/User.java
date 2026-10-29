package model;

public class User extends BaseEntity {
    private String username;
    private String email;

    public User(String username, String email) {
        super();
        this.username = username;
        this.email = email;
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
}