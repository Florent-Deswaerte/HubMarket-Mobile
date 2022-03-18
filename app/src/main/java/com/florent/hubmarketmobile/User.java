package com.florent.hubmarketmobile;

public class User {

    String username;
    String password;
    String name;
    String id;
    String email;
    String surname;
    String phone;
    String address;
    String pays;
    String ville;
    String[] roles;
    Boolean panier;
    String[] commandes;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }
    public String getUserId(){
        return this.id;
    }
    public String getUserEmail(){
        return this.email;
    }
    public String getUserSurname(){
        return this.surname;
    }
    public String getUserName(){
        return this.name;
    }
    public String getUserPhone(){
        return this.phone;
    }
    public String getUserAddress(){
        return this.address;
    }
    public String getUserPays(){
        return this.pays;
    }
    public String getUserVille(){
        return this.ville;
    }
    public String[] getUserRoles(){
        return this.roles;
    }
    public Boolean getUserPanier(){
        return this.panier;
    }
    public String[] getUserCommandes(){
        return this.commandes;
    }

}
