package com.florent.hubmarketmobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Commandes[] commandes = Singleton.getInstance().getUser().getCommandes();
        for (Commandes commande : commandes)
        {
            System.out.println(commande.getId());
        }
    }
}
