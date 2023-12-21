package com.matrix.nikhil.java.encapsulation;

public class DetailsPage {
    private  String userName;
    private  String password;

    public String setUserName(){
        if (userName=="standard_user") {

        }
        return userName;
    }
    public String setPassword(){
        if (password=="secret_sauce") {
        }
        return password;
    }
    public void getUserName(String userName){
        this.userName=userName;
    }
    public void getPassword(String password){
        this.password=password;
    }

    protected void details() {
    }
}
