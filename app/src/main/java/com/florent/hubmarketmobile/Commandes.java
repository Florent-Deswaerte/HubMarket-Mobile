package com.florent.hubmarketmobile;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Commandes {
        private String id;
        private String date;
        private Float total_commande;
        private String status;

        public Commandes() {}

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
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
