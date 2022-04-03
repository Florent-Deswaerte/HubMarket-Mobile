package com.florent.hubmarketmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.Singleton;

public class PanierFragment extends Fragment {

    Button buttonPayer;
    Fragment InformationsFragments;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panier, container, false);
        Button buttonPayer = (Button) view.findViewById(R.id.buttonPayer);
        buttonPayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformationsFragments = new InformationsFragment();
                loadFragment(InformationsFragments);
            }
        });
        return view;
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            return true;
        }
        return false;
    }
}
