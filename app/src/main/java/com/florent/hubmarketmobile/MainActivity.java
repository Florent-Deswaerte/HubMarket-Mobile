package com.florent.hubmarketmobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences cacheStorage = PreferenceManager
                .getDefaultSharedPreferences(this);

        // Récupération du token à partir du cache
        String tokenCachedString = cacheStorage.getString("UserToken", null);
        // Si le token est null
        if(tokenCachedString == null) {
            System.out.println("No user cached");
        }
        // Sinon on décode le token et on réstore la session
        else {
            String decodedToken = null;
            try {
                decodedToken = JWTUtils.getJson(tokenCachedString);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            System.out.println(decodedToken);

            Gson gson = new Gson();

            User user = gson.fromJson(decodedToken, User.class);
            Singleton.getInstance().setUser(user);
            Singleton.getInstance().setToken(tokenCachedString);

            System.out.println("USER RESTORED SESSION: " + user);
            startActivity(new Intent(MainActivity.this, UserActivity.class));
        }

        Button connexion_btn = (Button) findViewById(R.id.connexion_btn);

        connexion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConnexionActivity.class));
            }
        });
    }
}