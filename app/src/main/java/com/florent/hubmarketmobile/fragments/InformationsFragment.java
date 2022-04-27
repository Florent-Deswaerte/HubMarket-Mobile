package com.florent.hubmarketmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.florent.hubmarketmobile.Commandes;
import com.florent.hubmarketmobile.Panier;
import com.florent.hubmarketmobile.Produits;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.Singleton;

public class InformationsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Panier paniers = Singleton.getInstance().getUser().getPanier();
            for (Produits produit : paniers.getProduits()) {
                System.out.println(produit.getId());
                System.out.println(produit.getNom());
                System.out.println(produit.getPrix());
                System.out.println(produit.getQty());
            }

        return inflater.inflate(R.layout.fragment_information, null);
    }
}
