package com.mukesh.fast.one.one_fad__Sanata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class one_ed_Loan_St {

    @SerializedName("loc_type")
    @Expose
    private String locType;
    @SerializedName("loc_array")
    @Expose
    private List<one_d__Loan_Arr> SFLoanArr;

    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType;
    }

    public List<one_d__Loan_Arr> getLocArray() {
        return SFLoanArr;
    }

    public void setLocArray(List<one_d__Loan_Arr> SFLoanArr) {
        this.SFLoanArr = SFLoanArr;
    }

}