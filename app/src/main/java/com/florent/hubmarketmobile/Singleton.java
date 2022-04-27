package com.florent.hubmarketmobile;

public class Singleton {

    private static Singleton instance;
    private String token;
    private User user;
    private Produits produits;

    private Singleton() {}

    public static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public User getUser() {
        return user;
    }

    public User setUser(User user) {
        this.user = user;
        System.out.println("Set User executed: " + user);
        return this.user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Produits getProduits() { return produits;}
}