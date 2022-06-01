package com.florent.hubmarketmobile.Entity;

import com.google.gson.annotations.SerializedName;


public class Produit {

    @SerializedName("id")
    private Integer id;
    @SerializedName("nom")
    private String nom;
    @SerializedName("qty")
    private Integer qty;
    @SerializedName("prix")
    private String prix;
    @SerializedName("description")
    private String description;
    @SerializedName("fournisseurs")
    private Fournisseur[] fournisseur;
    @SerializedName("categories")
    private Categorie[] categories;
    @SerializedName("imagePath")
    private String imagePath;

    public Produit() {}
    public Produit(Integer id, String nom, Integer qty, String prix, String description, Fournisseur[] fournisseur, Categorie[] categories, String imagePath) {

        this.id = id;
        this.nom = nom;
        this.qty = qty;
        this.prix = prix;
        this.description = description;
        this.fournisseur = fournisseur;
        this.categories = categories;
        this.imagePath = imagePath;
    }


    public Integer getProduitId() {
        return id;
    }

    public String getProduitNom() { return nom; }

    public Integer getProduitQty() {
        return qty;
    }

    public String getProduitPrix() { return prix; }

    public String getProduitDescription() {
            return description;
    }

    public Fournisseur[] getProduitFournisseur() {
        return fournisseur;
    }

    public Categorie[] getProduitCategorie() {
        return categories;
    }

    public String getImagePath() { return imagePath; }
}
