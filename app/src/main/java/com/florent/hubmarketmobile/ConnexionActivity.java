package com.florent.hubmarketmobile;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnexionActivity extends AppUtils {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://s4-8010.nuage-peda.fr/HubMarket-Site/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WebInterface webInterface = retrofit.create(WebInterface.class);
        TextView wrongIdentifiants = findViewById(R.id.wrongIdentifiants);
        EditText email = findViewById(R.id.login);
        EditText password = findViewById(R.id.password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user = new User(email.getText().toString(), password.getText().toString());
                Call<Token> connexionUser = webInterface.connexionUser(user);

                connexionUser.enqueue(new Callback<Token>() {
                    @Override
                    public void onResponse(@NonNull Call<Token> call, @NonNull Response<Token> response) {
                        System.out.println(response.code());
                        if (response.code() != 200) {
                            wrongIdentifiants.setText("Wrong identifiants");

                        } else {
                            assert response.body() != null;
                            String tokenString = response.body().getToken();
                            System.out.println("Token: " + tokenString);

                            try {
                                String decodedToken = JWTUtils.getJson(tokenString);
                                System.out.println(decodedToken);

                                Gson gson = new Gson();

                                User user = gson.fromJson(decodedToken, User.class);
                                AppUtils.setUser(user);

                                startActivity(new Intent(ConnexionActivity.this, UserActivity.class));

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    @Override
                    public void onFailure(@NonNull Call<Token> call, @NonNull Throwable error) {
                        System.out.println(error);
                        wrongIdentifiants.setText("Wrong identifiants");
                    }
                });
            }
        });
    }
}