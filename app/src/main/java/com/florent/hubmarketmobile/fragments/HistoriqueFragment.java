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

import com.florent.hubmarketmobile.Commandes;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.Singleton;
import com.florent.hubmarketmobile.UserActivity;
import com.florent.hubmarketmobile.historique.HistoriqueListAdapter;

public class HistoriqueFragment extends Fragment {

    private RecyclerView userHistoriqueListRecyclerView;
    private RecyclerView.Adapter userHistoriqueListAdapter;
    private RecyclerView.LayoutManager userHistoriqueListManager;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userHistoriqueListRecyclerView = view.findViewById(R.id.historiqueRecyclerView);
        Commandes[] commandes = Singleton.getInstance().getUser().getCommandes();
        System.out.println(userHistoriqueListRecyclerView);
        userHistoriqueListRecyclerView.setHasFixedSize(true);
        userHistoriqueListManager = new LinearLayoutManager(getContext());
        userHistoriqueListRecyclerView.setLayoutManager(userHistoriqueListManager);
        userHistoriqueListAdapter = new HistoriqueListAdapter(commandes);
        userHistoriqueListRecyclerView.setAdapter(userHistoriqueListAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_historique, null);
    }
}
