package com.florent.hubmarketmobile.shop;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.Entity.Categorie;
import com.florent.hubmarketmobile.Entity.Fournisseur;
import com.florent.hubmarketmobile.Entity.Produit;
import com.florent.hubmarketmobile.R;
import com.squareup.picasso.Picasso;

public class ProduitListAdapter extends RecyclerView.Adapter<ProduitCellHolder> {
    private Produit[] dataSource;

    public ProduitListAdapter(Produit[] dataSource) { this.dataSource = dataSource; }

    @NonNull
    @Override
    public ProduitCellHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.produit_list_cell, parent,false);
        return new ProduitCellHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ProduitCellHolder holder, int position) {

        Categorie[] categories = (dataSource[position].getProduitCategorie());
        Fournisseur[] fournisseurs = (dataSource[position].getProduitFournisseur());

        holder.nomProduitTextView.setText(dataSource[position].getProduitNom());
        holder.prixProduitTextView.setText("Prix : " +dataSource[position].getProduitPrix());
        holder.qtyProduitTextView.setText("Quantitée :" +dataSource[position].getProduitQty().toString());
        holder.nomCategorieTextView.setText("Catégorie :"+ categories[0].getNomCategorie());
        holder.descriptionProduitTextView.setText(dataSource[position].getProduitDescription());
        holder.fournisseurProduitTextView.setText("Fournisseur :"+ fournisseurs[0].getLibelleFournisseur());

        Picasso.get()
                .load(dataSource[position].getImagePath())
                .into(holder.imageProduitView);

    }

    @Override
    public int getItemCount() {
        if (this.dataSource != null) {
            return this.dataSource.length;
        }
        return 0;
    }
}
