package com.florent.hubmarketmobile.shop;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.R;

public class ProduitCellHolder extends RecyclerView.ViewHolder {

    public TextView nomProduitTextView;
    public TextView nomCategorieTextView;
    public TextView qtyProduitTextView;
    public TextView prixProduitTextView;
    public TextView descriptionProduitTextView;
    public TextView fournisseurProduitTextView;
    public ImageView imageProduitView;

    public ProduitCellHolder(@NonNull View itemView) {
        super(itemView);
        nomProduitTextView = itemView.findViewById(R.id.nomProduitTextView);
        nomCategorieTextView = itemView.findViewById(R.id.nomCategorieTextView);
        qtyProduitTextView = itemView.findViewById(R.id.qtyProduitTextView);
        prixProduitTextView = itemView.findViewById(R.id.prixProduitTextView);
        descriptionProduitTextView = itemView.findViewById(R.id.descriptionProduitTextView);
        fournisseurProduitTextView = itemView.findViewById(R.id.fournisseurProduitTextView);
        imageProduitView = itemView.findViewById(R.id.imageProduitView);
    }
}
