package com.florent.hubmarketmobile.historique;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.Commandes;
import com.florent.hubmarketmobile.R;
import com.florent.hubmarketmobile.Singleton;
import com.florent.hubmarketmobile.User;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class HistoriqueListAdapter extends RecyclerView.Adapter<HistoriqueCellHolder> {
    private Commandes[] dataSource;

    public HistoriqueListAdapter(Commandes[] dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public HistoriqueCellHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.historique_list_cell, parent,false);
        HistoriqueCellHolder historiqueCellHolder = new HistoriqueCellHolder(view);

        return historiqueCellHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoriqueCellHolder holder, int position) {
        Commandes[] commandes = Singleton.getInstance().getUser().getCommandes();
        System.out.println(Singleton.getInstance().getUser().getCommandes());
        for(int i = 0; i < commandes.length; i++) {
            for (Commandes commande : commandes) {
                holder.idTextView.setText(commande.getId());
                System.out.println(commande.getId());
                holder.dateTextView.setText(commande.getDate());
                System.out.println(commande.getDate());
                holder.prixTextView.setText(String.valueOf(commande.getTotal_commande()));
                System.out.println(String.valueOf(commande.getTotal_commande()));
                holder.statusTextView.setText(commande.getStatus());
                System.out.println(commande.getStatus());
            }
        }
    }

    @Override
    public int getItemCount() {
        if (this.dataSource != null) {
            return this.dataSource.length;
        }
        return 0;
    }
}
