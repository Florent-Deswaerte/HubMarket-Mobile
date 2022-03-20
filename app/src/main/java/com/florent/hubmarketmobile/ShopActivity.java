package com.florent.hubmarketmobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppExtension {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        System.out.println(AppExtension.getUser());
    }
}
