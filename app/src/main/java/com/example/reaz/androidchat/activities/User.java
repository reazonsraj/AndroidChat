package com.example.reaz.androidchat.activities;

/**
 * Created by reaz on 8/24/2017.
 */

public class User {
    public String username;
    public String firstname;
    public String lastname;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username,String firstname,String lastname) {
        this.username = username;
        this.firstname=firstname;
        this.lastname=lastname;


    }


}
