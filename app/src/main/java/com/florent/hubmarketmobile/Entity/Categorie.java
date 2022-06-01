package com.florent.hubmarketmobile.Entity;

import com.google.gson.annotations.SerializedName;

public class Categorie {

    @SerializedName("id")
    private Integer idCategorie;
    @SerializedName("nom")
    private String nomCategorie;


    public Categorie(Integer idCategorie, String nomCategorie) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }
}
