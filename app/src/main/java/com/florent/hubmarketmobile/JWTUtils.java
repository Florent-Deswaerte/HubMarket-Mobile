package com.florent.hubmarketmobile;

import android.util.Base64;
import android.util.Log;

import java.io.UnsupportedEncodingException;

public class JWTUtils {

    public static String getJson(String strEncoded) throws UnsupportedEncodingException{
        String[] split = strEncoded.split("\\.");
        byte[] decodedBytes = Base64.decode(split[1], Base64.URL_SAFE);
        return new String(decodedBytes, "UTF-8");
    }
}