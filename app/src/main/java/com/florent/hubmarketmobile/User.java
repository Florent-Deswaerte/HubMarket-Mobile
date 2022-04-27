package com.florent.hubmarketmobile;

public class User {

    String username;
    String password;
    String nom;
    String id;
    String prenom;
    String phone;
    String address;
    String pays;
    String ville;
    String[] roles;
    private Panier panier;
    private Commandes[] commandes;

    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUserId() {
        return this.id;
    }

    public String getUserEmail() { return this.username; }

    public String getUserNom() {
        return this.nom;
    }

    public String getUserPrenom() {
        return this.prenom;
    }

    public String getUserPhone() {
        return this.phone;
    }

    public String getUserAddress() {
        return this.address;
    }

    public String getUserPays() {
        return this.pays;
    }

    public String getUserVille() {
        return this.ville;
    }

    public String[] getUserRoles() {
        return this.roles;
    }

    public Panier getPanier() {
        return this.panier;
    }

    public Commandes[] getCommandes() {
        return commandes;
    }

    public void setCommandes(Commandes[] commandes) {
        this.commandes = commandes;
    }

    public User resetUser() {
        this.address = null;
        this.password = null;
        this.id = null;
        this.commandes = null;
        this.nom = null;
        this.panier = null;
        this.pays = null;
        this.phone = null;
        this.prenom = null;
        this.roles = null;
        this.ville = null;
        return this;
    }
}
