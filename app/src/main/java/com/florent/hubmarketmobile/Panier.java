package com.florent.hubmarketmobile;

public class Panier {
    private String id;
    private Produits[] produits;

    public Panier() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Produits[] getProduits() {
        return produits;
    }

    public void setProduits(Produits[] produits) {
    this.produits = produits;
}
}
