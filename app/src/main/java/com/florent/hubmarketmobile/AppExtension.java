package com.florent.hubmarketmobile;

import androidx.appcompat.app.AppCompatActivity;

public class AppExtension extends AppCompatActivity {

    private static User user;

    public static User getUser() {
        return user;
    }

    public static void setUser(User newUser) {
        user = newUser;
    }
}
