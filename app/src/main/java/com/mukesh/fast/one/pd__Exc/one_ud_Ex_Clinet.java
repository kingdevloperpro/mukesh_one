package com.mukesh.fast.one.pd__Exc;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class one_ud_Ex_Clinet {

    public static final String BASE_URL = "http://ip-api.com/";

    public static one_ed_Ex_Serc getGeoApiService() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(one_ed_Ex_Serc.class);
    }

}
