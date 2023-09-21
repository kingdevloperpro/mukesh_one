package com.mukesh.fast.one.In_Cs;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.mukesh.fast.one.one_d_ADP.one_Loan_LN;
import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.one_Pojo.one_am_F_Loan_List;
import com.mukesh.fast.one.one_Pojo.one_ed_Loan_Lst;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.mukesh.fast.one.one_Mani.one_aavechebahiLoan_MBit;
import com.mukesh.fast.one.one_ser_Interface.one_n_Turant_Pesa;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressLint("WrongConstant")

public class one_ed_Ln_Tp extends AppCompatActivity {
    private static final String TAG = "ActInstantLoanTypes";
    public static ArrayList<one_am_F_Loan_List> resultData;

    public int f46i = 0;
    FrameLayout frameLayout;
    RecyclerView loan_list;
    LinearLayout id_ll_dataNotFound;
    LinearLayout lottie_anim;
    ImageView imageView;
    ProgressDialog progressBar;
    View.OnClickListener onClickListener = new View.OnClickListener() {

        public void onClick(View view) {
            one_Loan_YT.gclick++;
            if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                one_ed_Ln_Tp.this.ironfullscreen(1);
                int intValue = ((Integer) view.getTag()).intValue();
                Intent intent = new Intent(one_ed_Ln_Tp.this.getApplicationContext(), one_d_Ln_dr.class);
                intent.putExtra(one_d_Ln_dr.Data, one_ed_Ln_Tp.resultData.get(intValue));
                one_ed_Ln_Tp.this.startActivity(intent);
                return;
            }
            int intValue2 = ((Integer) view.getTag()).intValue();
            Intent intent2 = new Intent(one_ed_Ln_Tp.this.getApplicationContext(), one_d_Ln_dr.class);
            intent2.putExtra(one_d_Ln_dr.Data, one_ed_Ln_Tp.resultData.get(intValue2));
            one_ed_Ln_Tp.this.startActivity(intent2);
        }
    };
    ProgressDialog progressDialog;

    private boolean isOnline() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_activity_act_instant_loan_types);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));


 //       progressDialog = new ProgressDialog(this);
//        if (isOnline()) {
//            progressDialog.setTitle("Loading Data");
//            progressDialog.setMessage("Please Wait a second");
//            progressDialog.hide();
//            new Handler().postDelayed(new Runnable() {
//                public void run() {
//                    one_ed_Ln_Tp.this.progressDialog.isShowing();
//                    one_ed_Ln_Tp.this.progressDialog.dismiss();
//                }
//            }, 3000);
//        }
        loan_list = (RecyclerView) findViewById(R.id.loan_list);
        id_ll_dataNotFound = findViewById(R.id.id_llNotFound);
        lottie_anim = findViewById(R.id.lottie_anim);
//        MS_CommonClass.toolbar(this, "Speed Loan Coach", false);
//        if (one_oklaeed__CMM.isNetworkConnected(getApplicationContext())) {
//            getList();
//        }

    }

    public void setData() {

        loan_list.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        loan_list.setAdapter(new one_Loan_LN(getApplicationContext(), resultData, this.onClickListener));
        if (resultData.size() == 0) {
            loan_list.setVisibility(View.VISIBLE);
            id_ll_dataNotFound.setVisibility(View.GONE);
        } else {
            loan_list.setVisibility(View.GONE);
            id_ll_dataNotFound.setVisibility(View.GONE);
            lottie_anim.setVisibility(View.VISIBLE);
        }
    }

    public void getList() {
        one_oklaeed__CMM.progressDialogShow(this);
        one_aavechebahiLoan_MBit.getInstance().addToRequestQueue(new StringRequest(0, "http://androidsolution.xyz/folder/aadharloan/listapp.json", new Response.Listener<String>() {

            public void onResponse(String str) {
                try {
                    one_ed_Ln_Tp.resultData = (ArrayList) one_ed_Loan_Lst.parseJSON(str).getResultData();

                    one_ed_Ln_Tp.this.setData();
                } catch (Exception unused) {
                }
                one_oklaeed__CMM.progressDialogDismiss();
            }
        }, new Response.ErrorListener() {

            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                one_oklaeed__CMM.progressDialogDismiss();
            }
        }) {

            @Override // com.android.volley.Request
            public Map<String, String> getParams() {
                HashMap hashMap = new HashMap();
                return checkParams(hashMap);
            }

            private Map<String, String> checkParams(Map<String, String> map) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getValue() == null) {
                        map.put(entry.getKey(), "");
                    }
                }
                return map;
            }
        }, "FORGOT PASSWORD");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }


    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        one_ed_Ln_Tp.this.progressBar.dismiss();
    }

    public void click(int i) {
        if (i != 1 && i == 2) {
            startActivity(new Intent(this, one_n_Turant_Pesa.class));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
