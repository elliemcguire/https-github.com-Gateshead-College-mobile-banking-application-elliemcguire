package mobilebanking;

public class User {
    private String name;
    private String dateOfBirth;
    private String username;
    private String password;

    public User(String name, String dateOfBirth, String username, String password) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
