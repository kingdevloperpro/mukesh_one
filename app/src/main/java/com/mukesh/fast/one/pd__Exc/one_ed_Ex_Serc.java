package com.mukesh.fast.one.pd__Exc;

import retrofit2.Call;
import retrofit2.http.GET;

public interface one_ed_Ex_Serc {
    @GET("json")
    Call<one_ed_Ex_Res> getLocation();
}