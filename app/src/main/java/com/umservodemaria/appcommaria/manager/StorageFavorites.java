package com.umservodemaria.appcommaria.manager;

/**
 * Created by hsn on 03/07/2017.
 */

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.umservodemaria.appcommaria.entity.news.Article;

import java.lang.reflect.Type;
import java.util.ArrayList;
/**
 * Criado Por Um Servo De Maria by hsn on 08/09/2018.
 * Para Evangelização
 * Salve Maria
 */

public class StorageFavorites {
    private final String STORAGE = "MY_FAVORITE";
    private SharedPreferences preferences;
    private Context context;
    public StorageFavorites(Context context) {
        this.context = context;
    }
    public void storeAudio(ArrayList<Article> arrayList) {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(arrayList);
        editor.putString("favoritesList", json);
        editor.apply();
    }

    public ArrayList<Article> loadFavorites() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = preferences.getString("favoritesList", null);
        Type type = new TypeToken<ArrayList<Article>>() {
        }.getType();
        return gson.fromJson(json, type);
    }
    public void clearCachedAudioPlaylist() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }

}

