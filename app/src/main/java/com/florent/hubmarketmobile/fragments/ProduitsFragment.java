package com.florent.hubmarketmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.florent.hubmarketmobile.Entity.Categorie;
import com.florent.hubmarketmobile.Entity.Fournisseur;
import com.florent.hubmarketmobile.Entity.Produit;
import com.florent.hubmarketmobile.ProduitsList;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.WebInterface;
import com.florent.hubmarketmobile.shop.ProduitListAdapter;

import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ProduitsFragment extends Fragment {

    private RecyclerView produitsRecyclerView;
    private RecyclerView.Adapter produitsListAdapter;
    private RecyclerView.LayoutManager produitsManager;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://s4-8014.nuage-peda.fr/Hubmarket/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WebInterface webInterface = retrofit.create(WebInterface.class);
        Call<ProduitsList> getMyProduits = webInterface.getProduits();

        getMyProduits.enqueue(new Callback<ProduitsList>() {
            @Override
            public void onResponse(@NonNull Call<ProduitsList> call, @NonNull Response<ProduitsList> response) {
                assert response.body() != null;

                System.out.println("---------- ON RESPONSE ----------");

                System.out.println("RESPONSE " + response.body().getResponseCode());
                System.out.println("RESPONSE " + response.body().getResponseInfo());
                System.out.println("RESPONSE " + response.body().getResponseAmount());

                Produit[] produitList = (Produit[]) response.body().getResponseMembers();
                System.out.println("TABLEAU PRODUITS :");
                System.out.println(Arrays.toString(produitList));

                System.out.println("---------- DETAILS PRODUITS -----------");

                for (Produit p : produitList) {
                    System.out.println("---------------------------------------");
                    System.out.println(p.getProduitId());
                    System.out.println(p.getProduitNom());
                    System.out.println(p.getProduitQty());
                    System.out.println(p.getProduitPrix());
                    System.out.println(p.getProduitDescription());
                    System.out.println(p.getImagePath());

                    Categorie[] categories = (Categorie[]) p.getProduitCategorie();
                    for (Categorie c : categories) {
                        System.out.println("---------------");
                        System.out.println("ID CATEGORIE " + c.getIdCategorie());
                        System.out.println("NOM CATEGORIE " + c.getNomCategorie());
                    }

                    Fournisseur[] fournisseurs = (Fournisseur[]) p.getProduitFournisseur();
                    for (Fournisseur f : fournisseurs) {
                        System.out.println("---------------");
                        System.out.println("ID FOURNISSEUR " + f.getIdFournisseur());
                        System.out.println("NOM FOURNISSEUR " +f.getLibelleFournisseur());
                        System.out.println("PAYS FOURNISSEUR " +f.getPaysFournisseur());
                        System.out.println("CP FOURNISSEUR " +f.getCpFournisseur());
                        System.out.println("ADDRESSE FOURNISSEUR " +f.getAddresseFournisseur());

                    }

                }

                System.out.println("---------- RECYCLER VIEW ----------");

                produitsRecyclerView = view.findViewById(R.id.produitsRecylerView);
                produitsRecyclerView.setHasFixedSize(true);
                System.out.println("---------- RECYCLER OK ----------");

                produitsManager = new LinearLayoutManager(getContext());
                produitsRecyclerView.setLayoutManager(produitsManager);
                System.out.println("---------- MANAGER SET OK ----------");

                produitsListAdapter = new ProduitListAdapter(produitList);
                produitsRecyclerView.setAdapter(produitsListAdapter);
                System.out.println("---------- ADAPTER OK ----------");


                System.out.println("---------- FIN ON RESPONSE ----------");

            }

            @Override
            public void onFailure(@NonNull Call<ProduitsList> call, @NonNull Throwable t) {
                System.out.println("FAILURE " + t.getMessage());
            }
        });

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_produits, container, false);
    }

}
