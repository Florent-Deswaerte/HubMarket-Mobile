package com.florent.hubmarketmobile.panier;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.Categorie;
import com.florent.hubmarketmobile.Produits;
import com.florent.hubmarketmobile.R;

import java.util.Arrays;
import java.util.Comparator;

public class PanierListAdapter extends RecyclerView.Adapter<PanierCellHolder> {
    private Produits[] dataSource;

    public PanierListAdapter(Produits[] dataSource) { this.dataSource = dataSource; }

    @NonNull
    @Override
    public PanierCellHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.panier_list_cell, parent,false);
        return new PanierCellHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PanierCellHolder holder, int position) {

        holder.nomTextView.setText(dataSource[position].getNom());
        System.out.println(dataSource[position].getNom());
        holder.categorieTextView.setText(dataSource[position].getCategories()[0].getNom());
        System.out.println(dataSource[position].getCategories());
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
