package com.florent.hubmarketmobile.historique;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.florent.hubmarketmobile.R;

public class HistoriqueCellHolder extends RecyclerView.ViewHolder {
    public TextView idTextView;
    public TextView prixTextView;
    public TextView statusTextView;

    public HistoriqueCellHolder(@NonNull View itemView) {
        super(itemView);
        idTextView = itemView.findViewById(R.id.idTextView);
        prixTextView = itemView.findViewById(R.id.qtyTextView);
        statusTextView = itemView.findViewById(R.id.totalTextView);
    }
}
