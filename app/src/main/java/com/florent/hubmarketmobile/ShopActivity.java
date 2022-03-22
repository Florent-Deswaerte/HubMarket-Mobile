package com.florent.hubmarketmobile;

import android.os.Bundle;

public class ShopActivity extends AppUtils {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        System.out.println(AppUtils.getUser().getUserCommandes());
    }
}
