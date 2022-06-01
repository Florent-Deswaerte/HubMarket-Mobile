package com.florent.hubmarketmobile.Entity;

import com.google.gson.annotations.SerializedName;

public class Fournisseur {

    @SerializedName("id")
    private Integer idFournisseur;
    @SerializedName("libelle")
    private String libelleFournisseur;
    @SerializedName("pays")
    private String paysFournisseur;
    @SerializedName("addresse")
    private String addresseFournisseur;
    @SerializedName("cp")
    private Integer cpFournisseur;

    public Fournisseur(Integer idFournisseur, String libelleFournisseur, String paysFournisseur, String addresseFournisseur, Integer cpFournisseur) {
        this.idFournisseur = idFournisseur;
        this.libelleFournisseur = libelleFournisseur;
        this.paysFournisseur = paysFournisseur;
        this.addresseFournisseur = addresseFournisseur;
        this.cpFournisseur = cpFournisseur;
    }

    public Integer getIdFournisseur() {
        return idFournisseur;
    }

    public String getLibelleFournisseur() {
        return libelleFournisseur;
    }

    public String getPaysFournisseur() {
        return paysFournisseur;
    }

    public String getAddresseFournisseur() {
        return addresseFournisseur;
    }

    public Integer getCpFournisseur() {
        return cpFournisseur;
    }
}
