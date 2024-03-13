package ku.cs.posfinalproject.models;

import ku.cs.posfinalproject.services.WriteAble;

public class Account implements WriteAble {
    private String name;
    private String username;
    private String password;
    private String role;

    public Account(String name, String username, String password, String role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public boolean verify(String password) {
        return this.password.equals(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toCsvFormat() {
        return String.format("%s,%s,%s,%s",name,username,password,role);
    }
}
