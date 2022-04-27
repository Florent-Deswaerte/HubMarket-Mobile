package com.florent.hubmarketmobile.panier;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.Produits;
import com.florent.hubmarketmobile.R;

public class PanierListAdapter extends RecyclerView.Adapter<PanierCellHolder> {
    private Produits[] dataSource;

    public PanierListAdapter(Produits[] dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public PanierCellHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.panier_list_cell, parent,false);
        PanierCellHolder panierCellHolder = new PanierCellHolder(view);

        return panierCellHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PanierCellHolder holder, int position) {
        holder.nomTextView.setText(dataSource[position].getNom());
        System.out.println(dataSource[position].getNom());
        holder.qtyTextView.setText("x " + dataSource[position].getQty());
        System.out.println(dataSource[position].getQty());
        holder.totalTextView.setText(String.valueOf(dataSource[position].getPrix()) + " €");
        System.out.println(String.valueOf(dataSource[position].getPrix()));
    }

    @Override
    public int getItemCount() {
        if (this.dataSource != null) {
            return this.dataSource.length;
        }
        return 0;
    }
}
