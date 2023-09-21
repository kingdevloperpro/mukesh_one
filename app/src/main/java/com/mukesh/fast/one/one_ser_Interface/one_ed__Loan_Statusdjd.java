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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.one_d_ADP.one_jamad__Loan_ST;
import com.mukesh.fast.one.one_Pojo.one_lued_Foan_Ln_Dt;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.mukesh.fast.one.one_Mani.one_aavechebahiLoan_MBit;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

import java.util.ArrayList;

@SuppressLint("WrongConstant")

public class one_ed__Loan_Statusdjd extends AppCompatActivity {
    private static final String TAG = "ActLoanStatus";

    public Activity activity;
    public int f46i = 0;
    public Intent intent;
    FrameLayout frame11;
    FrameLayout frameLayout;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private LinearLayout btnApply;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<one_lued_Foan_Ln_Dt> list = new ArrayList<>();
    private LinearLayout llNoLoan;
    private one_jamad__Loan_ST VBLoanStatusAdapter;
    private RecyclerView recyclerView;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_loan_status);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);

        Trans_Aud_Id.NativeAddShow(this, findViewById(R.id.adsContainer));


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_ed__Loan_Statusdjd.this.progressDialog.isShowing();
                    one_ed__Loan_Statusdjd.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        this.activity = this;
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        llNoLoan = (LinearLayout) findViewById(R.id.llNoLoan);
        btnApply = (LinearLayout) findViewById(R.id.btnApply);
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.loan_status);

        ArrayList<one_lued_Foan_Ln_Dt> arrayList = (ArrayList) one_aavechebahiLoan_MBit.SFLoanDB.getAllLoan();
        this.list = arrayList;
        if (arrayList.size() == 0) {
            this.llNoLoan.setVisibility(0);
        } else {
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.activity);
            linearLayoutManager = linearLayoutManager2;
            recyclerView.setLayoutManager(linearLayoutManager2);
            one_jamad__Loan_ST VBLoanStatusAdapter2 = new one_jamad__Loan_ST(this.activity, this.list);
            VBLoanStatusAdapter = VBLoanStatusAdapter2;
            recyclerView.setAdapter(VBLoanStatusAdapter2);
        }
        this.btnApply.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_ed__Loan_Statusdjd.this.ironfullscreen(1);
                } else {
                    one_ed__Loan_Statusdjd.this.click(1);
                }
            }
        });
    }


    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        this.progressBar.setMessage("Ads Loading ...");
        this.progressBar.setProgressStyle(0);
        this.progressBar.show();
        one_ed__Loan_Statusdjd.this.progressBar.dismiss();
        one_ed__Loan_Statusdjd.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, one_med__Loan_Prkar.class);
            this.intent = intent2;
            startActivity(intent2);
//            finish();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
