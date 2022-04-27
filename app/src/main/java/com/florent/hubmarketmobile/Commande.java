package com.florent.hubmarketmobile;

public class Commande {
    private String id;
    private Integer total_commande;
    private boolean status;
    private lCommandes[] lCommandes;

    public Commande() {}

    public com.florent.hubmarketmobile.lCommandes[] getlCommandes() {
        return lCommandes;
    }

    public void setlCommandes(com.florent.hubmarketmobile.lCommandes[] lCommandes) {
        this.lCommandes = lCommandes;

    } 

    public Integer getTotal_commande() {
        return total_commande;
    }

    public void setTotal_commande(Integer total_commande) {
        this.total_commande = total_commande;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
