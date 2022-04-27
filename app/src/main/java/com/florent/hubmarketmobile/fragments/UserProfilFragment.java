package com.florent.hubmarketmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.Singleton;


public class UserProfilFragment extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        TextView userNom = (TextView) view.findViewById(R.id.userNom);
        userNom.setText(Singleton.getInstance().getUser().getUserNom());
        //System.out.println("TEST "+Singleton.getInstance().getUser().getUserPrenom());

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_profil, null);
    }
}
