package com.mukesh.fast.one.one__Speed__Rf;

import com.mukesh.fast.one.one_fad__Sanata.one_ed__Loan_Santa;
import com.mukesh.fast.one.one_fad__Sanata.one_ied__Loan_PJ;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface one_Loan_UI {
    @GET("getApps/mukesh/loan_one/as54sd5a4d/Api_V1.json")
    Call<ArrayList<one_ed__Loan_Santa>> getRandomApps();

    @GET("getApps/mukesh/loan_one/as54sd5a4d/Api_V1.json")
    Call<one_ied__Loan_PJ> getSdkData();

}