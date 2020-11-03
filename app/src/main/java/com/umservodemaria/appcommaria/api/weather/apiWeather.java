package com.umservodemaria.appcommaria.api.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.umservodemaria.appcommaria.entity.weather.weatherResponse;
import com.umservodemaria.appcommaria.entity.weather.weatherResponseCurrent;

/**
 * Criado Por Um Servo De Maria by hsn on 08/09/2018.
 * Para Evangelização
 * Salve Maria
 */

public interface apiWeather {
    @GET("forecast/daily")
    Call<weatherResponse> getFiveDayWeather(@Query("lat") String lat,@Query("lon") String lon,@Query("mode") String mode,@Query("appid") String appid,@Query("units") String units);
    @GET("weather")
    Call<weatherResponseCurrent> getCurrentWeather(@Query("lat") String lat,@Query("lon") String lon,@Query("mode") String mode,@Query("appid") String appid,@Query("units") String units);


}

