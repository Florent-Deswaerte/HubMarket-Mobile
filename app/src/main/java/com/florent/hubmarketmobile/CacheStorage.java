package com.florent.hubmarketmobile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class CacheStorage extends AppCompatActivity {
    SharedPreferences storage = this.getSharedPreferences("com.florent.hubmarketmobile", Context.MODE_PRIVATE);

    @SuppressLint("CommitPrefEdits")
    public boolean addToCache(String key, String value) {
        if(key == null || value == null) return false;
        else{
            storage.edit().putString(key, value).apply();
            return true;
        }
    }
}
