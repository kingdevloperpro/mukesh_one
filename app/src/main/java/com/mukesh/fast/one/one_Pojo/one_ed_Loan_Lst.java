package com.mukesh.fast.one.one_Pojo;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class one_ed_Loan_Lst implements Serializable {
    @SerializedName("resultCode")
    @Expose
    private Integer resultCode;
    @SerializedName("resultData")
    @Expose
    private List<one_am_F_Loan_List> resultData = null;
    @SerializedName("totalMoney")
    @Expose
    private Integer totalMoney;

    public static one_ed_Loan_Lst parseJSON(String str) {
        return (one_ed_Loan_Lst) new GsonBuilder().create().fromJson(str, one_ed_Loan_Lst.class);
    }

    public List<one_am_F_Loan_List> getResultData() {
        return this.resultData;
    }

    public void setResultData(List<one_am_F_Loan_List> list) {
        this.resultData = list;
    }

    public Integer getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(Integer num) {
        this.resultCode = num;
    }

    public Integer getTotalMoney() {
        return this.totalMoney;
    }

    public void setTotalMoney(Integer num) {
        this.totalMoney = num;
    }
}
