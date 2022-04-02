package com.florent.hubmarketmobile;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Commandes {
        private String id;
        private Date date;
        private Float total_commande;
        private String status;

        public Commandes() {}

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Float getTotal_commande() {
            return total_commande;
        }

        public void setTotal_commande(Float total_commande) {
            this.total_commande = total_commande;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
}
