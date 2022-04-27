package com.florent.hubmarketmobile.panier;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.R;

public class PanierCellHolder extends RecyclerView.ViewHolder {
    public TextView nomTextView;
    public TextView categorieTextView;
    public TextView qtyTextView;
    public TextView totalTextView;

    public PanierCellHolder(@NonNull View itemView) {
        super(itemView);
        nomTextView = itemView.findViewById(R.id.nomTextView);
        categorieTextView = itemView.findViewById(R.id.categorieTextView);
        qtyTextView = itemView.findViewById(R.id.qtyTextView);
        totalTextView = itemView.findViewById(R.id.totalTextView);
    }
}
