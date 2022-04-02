package com.florent.hubmarketmobile;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.florent.hubmarketmobile.fragments.HistoriqueFragment;
import com.florent.hubmarketmobile.fragments.PanierFragment;
import com.florent.hubmarketmobile.fragments.ProduitsFragment;
import com.florent.hubmarketmobile.fragments.UserProfilFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    Fragment HistoriqueFragment;
    Fragment PanierFragment;
    Fragment ProduitsFragment;
    Fragment UserProfilFragment;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        HistoriqueFragment = new HistoriqueFragment();
        PanierFragment = new PanierFragment();
        ProduitsFragment = new ProduitsFragment();
        UserProfilFragment = new UserProfilFragment();

        loadFragment(UserProfilFragment);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        System.out.println(Singleton.getInstance().getUser().getCommandes());
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch(item.getItemId()){
            case R.id.action_produits:
                fragment = ProduitsFragment;
                break;
            case R.id.action_panier:
                fragment = PanierFragment;
                break;
            case R.id.action_historique:
                fragment = HistoriqueFragment;
                break;
            case R.id.action_profil:
                fragment = UserProfilFragment;
                break;
        }
        return loadFragment(fragment);
    }
}