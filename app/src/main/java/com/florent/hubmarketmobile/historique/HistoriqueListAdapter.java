package com.florent.hubmarketmobile.historique;

import android.graphics.Color;
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
        holder.idTextView.setText(dataSource[position].getId());
        System.out.println(dataSource[position].getId());
        holder.dateTextView.setText(dataSource[position].getDate());
        System.out.println(dataSource[position].getDate());
        holder.prixTextView.setText(String.valueOf(dataSource[position].getTotal_commande()) + " €");
        System.out.println(String.valueOf(dataSource[position].getTotal_commande()));
        if (dataSource[position].getStatus() == "succeeded"){
            holder.statusTextView.setText(dataSource[position].getStatus());
            holder.statusTextView.setTextColor(Color.RED);
        } else {
            holder.statusTextView.setText(dataSource[position].getStatus());
            holder.statusTextView.setTextColor(Color.GREEN);
        }
        System.out.println(dataSource[position].getStatus());
    }

    @Override
    public int getItemCount() {
        if (this.dataSource != null) {
            return this.dataSource.length;
        }
        return 0;
    }
}
