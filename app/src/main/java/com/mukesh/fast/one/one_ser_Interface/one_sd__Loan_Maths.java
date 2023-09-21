package com.mukesh.fast.one.one_ser_Interface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.one_d_ADP.one_ched__Loan_AM;
import com.mukesh.fast.one.one_d_ADP.one_rbhaid__Loan_TM;
import com.mukesh.fast.one.R;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

import java.util.ArrayList;

@SuppressLint("WrongConstant")

public class one_sd__Loan_Maths extends AppCompatActivity {
    private static final String TAG = "ActCalc";
    public String emiTerms = "0";
    public int f46i = 0;
    public ArrayList<String> listAmount = new ArrayList<>();
    public ArrayList<String> listTerms = new ArrayList<>();
    public String loanAmount = "0";
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    TextView tvTitle;
    ImageView ivBack;
    private Activity activity;
    private one_ched__Loan_AM VBAmountAdapter;
    private GridLayoutManager gridLayoutManager;
    private RecyclerView rvAmount;
    private RecyclerView rvTerms;
    private one_rbhaid__Loan_TM VBTermsAdapter;
    private TextView tvEmi;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_calc);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_sd__Loan_Maths.this.progressDialog.isShowing();
                    one_sd__Loan_Maths.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        rvAmount = (RecyclerView) findViewById(R.id.rvAmount);
        rvTerms = (RecyclerView) findViewById(R.id.rvTerms);
        tvEmi = (TextView) findViewById(R.id.tvEmi);
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.personal);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this.activity, 3);
        gridLayoutManager = gridLayoutManager2;
        rvAmount.setLayoutManager(gridLayoutManager2);
        addAmount();
        one_ched__Loan_AM VBAmountAdapter2 = new one_ched__Loan_AM(this.activity, this.listAmount, new one_ched__Loan_AM.CustomItemClickListener() {

            @Override
            public void onItemClick(View view, int i) {
                one_sd__Loan_Maths VBActCalc = one_sd__Loan_Maths.this;
                VBActCalc.loanAmount = VBActCalc.listAmount.get(i);
                one_sd__Loan_Maths.this.calculateEmiAmount();
            }
        });
        VBAmountAdapter = VBAmountAdapter2;
        rvAmount.setAdapter(VBAmountAdapter2);
        GridLayoutManager gridLayoutManager3 = new GridLayoutManager(this.activity, 3);
        gridLayoutManager = gridLayoutManager3;
        rvTerms.setLayoutManager(gridLayoutManager3);
        listTerms.add("3");
        listTerms.add("6");
        listTerms.add("12");
        listTerms.add("24");
        listTerms.add("36");
        listTerms.add("48");
        one_rbhaid__Loan_TM VBTermsAdapter2 = new one_rbhaid__Loan_TM(this.activity, this.listTerms, new one_rbhaid__Loan_TM.CustomItemClickListener() {

            @Override
            public void onItemClick(View view, int i) {
                one_sd__Loan_Maths VBActCalc = one_sd__Loan_Maths.this;
                VBActCalc.emiTerms = VBActCalc.listTerms.get(i);
                one_sd__Loan_Maths.this.calculateEmiAmount();
            }
        });
        VBTermsAdapter = VBTermsAdapter2;
        rvTerms.setAdapter(VBTermsAdapter2);
        loanAmount = this.listAmount.get(0);
        emiTerms = this.listTerms.get(0);
        calculateEmiAmount();
    }

    public void calculateEmiAmount() {
        double parseDouble = Double.parseDouble(this.loanAmount) / Double.parseDouble(this.emiTerms);
        double parseDouble2 = Double.parseDouble(this.emiTerms) * parseDouble;
        double parseDouble3 = Double.parseDouble(this.loanAmount) + parseDouble;
        TextView textView = this.tvEmi;
        textView.setText("Rs." + String.format("%.2f", Double.valueOf(parseDouble)));
        ((TextView) findViewById(R.id.tvTotalEmi)).setText("Rs." + String.format("%.2f", Double.valueOf(parseDouble2)));
        ((TextView) findViewById(R.id.tvTotal)).setText("Rs." + String.format("%.2f", Double.valueOf(parseDouble3)));
    }

    public void addAmount() {
        listAmount.add("5000");
        listAmount.add("10000");
        listAmount.add("15000");
        listAmount.add("25000");
        listAmount.add("35000");
        listAmount.add("50000");
        listAmount.add("75000");
        listAmount.add("100000");
        listAmount.add("500000");
        listAmount.add("1000000");
        listAmount.add("5000000");
        listAmount.add("10000000");
    }


    public void click(int i) {
        if (i == 1) {
            startActivity(new Intent(this, one_d_F_Loan_Heart.class));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
