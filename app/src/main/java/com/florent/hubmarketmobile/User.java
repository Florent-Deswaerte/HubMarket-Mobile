package com.florent.hubmarketmobile;

public class User {

    private String username;
    private String password;
    private String nom;
    private String id;
    private String prenom;
    private String phone;
    private String address;
    private String pays;
    private String ville;
    private String[] roles;
    private Object panier;
    private Commande[] commandes;

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

    public Object getUserPanier() {
        return this.panier;
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

    public Commande[] getCommandes() {
        return commandes;
    }

    public void setCommandes(Commande[] commandes) {
        this.commandes = commandes;
    }
}
