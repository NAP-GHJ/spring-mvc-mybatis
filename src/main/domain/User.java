package main.domain;

import java.io.Serializable;

public class User implements Serializable{

    //private value field
    private String loginname;
    private String password;



    private String username;

    public User(){
        super();
    }

    public User(String loginname,String password, String username){
        super();
        this.loginname = loginname;
        this.password = password;
        this.username = username;
    }

    public String getLoginname(){
        return  this.loginname;
    }

    public void setLoginname(String loginname){
        this.loginname = loginname;
    }

    public String getPassword(){
        return  this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
