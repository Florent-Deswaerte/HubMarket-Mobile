package com.florent.hubmarketmobile;

import com.florent.hubmarketmobile.Entity.Produit;
import com.google.gson.annotations.SerializedName;

public class ProduitsList {

    @SerializedName("api:responseCode")
    private String responseCode;
    @SerializedName("api:responseInfo")
    private String responseInfo;
    @SerializedName("api:membersCount")
    private String responseAmount;
    @SerializedName("api:members")
    private Produit[] responseMembers;

    public String getResponseCode() {
        return responseCode;
    }
    public String getResponseInfo() {
        return responseInfo;
    }
    public String getResponseAmount() {
        return responseAmount;
    }
    public Object[] getResponseMembers() { return responseMembers; }

}

