package com.umservodemaria.appcommaria.entity.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Criado Por Um Servo De Maria by hsn on 08/09/2018.
 * Para Evangelização
 * Salve Maria
 */
public class Temp {

    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("min")
    @Expose
    private String min;
    @SerializedName("max")
    @Expose
    private String max;
    @SerializedName("night")
    @Expose
    private String night;
    @SerializedName("eve")
    @Expose
    private String eve;
    @SerializedName("morn")
    @Expose
    private String morn;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMin() {
        Double t=Double.parseDouble(this.min);
        long m =Math.round(t);
        String  min_r=m+"";
        return min_r;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        Double t=Double.parseDouble(this.max);
        long m =Math.round(t);
        String  max_r=m+"";
        return max_r;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }

    public String getEve() {
        return eve;
    }

    public void setEve(String eve) {
        this.eve = eve;
    }

    public String getMorn() {
        return morn;
    }

    public void setMorn(String morn) {
        this.morn = morn;
    }


}