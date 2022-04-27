package com.florent.hubmarketmobile;

public class Produits {
    private String id;
    private String nom;
    private String qty;
    private Float prix;
    private String[] fournisseur;
    private Categorie[] categories;

    public Produits() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String[] getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String[] fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Categorie[] getCategories() {
        return categories;
    }

    public void setCategories(Categorie[] categories) {
        this.categories = categories;
    }
}
