package com.florent.hubmarketmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.Commandes;
import com.florent.hubmarketmobile.Produits;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.Singleton;
import com.florent.hubmarketmobile.historique.HistoriqueListAdapter;
import com.florent.hubmarketmobile.panier.PanierListAdapter;

public class PanierFragment extends Fragment {

    Button buttonPayer;
    Fragment InformationsFragments;
    private RecyclerView userPanierListRecyclerView;
    private RecyclerView.Adapter userPanierListAdapter;
    private RecyclerView.LayoutManager userPanierListManager;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userPanierListRecyclerView = view.findViewById(R.id.PanierRecyclerView);
        Produits[] produits = Singleton.getInstance().getUser().getPanier().getProduits();
        userPanierListRecyclerView.setHasFixedSize(true);
        userPanierListManager = new LinearLayoutManager(getContext());
        userPanierListRecyclerView.setLayoutManager(userPanierListManager);
        userPanierListAdapter = new PanierListAdapter(produits);
        userPanierListRecyclerView.setAdapter(userPanierListAdapter);
    }

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
