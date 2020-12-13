package com.example.accountbook;

public class User {
    public int id;
    public String username;
    public String password;
    public User(int id,String username,String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public User(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
