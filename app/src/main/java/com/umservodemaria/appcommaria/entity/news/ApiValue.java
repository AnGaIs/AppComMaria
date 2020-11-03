package com.umservodemaria.appcommaria.entity.news;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Criado Por Um Servo De Maria by hsn on 08/09/2018.
 * Para Evangelização
 * Salve Maria
 */

public class ApiValue {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
