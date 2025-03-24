package com.xworkz.Accesscontrol;

public class User {
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login(String pass) {
        return this.password.equals(pass);
    }
}
