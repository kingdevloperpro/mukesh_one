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

import com.mukesh.fast.one.In_Cs.one_ed_Ln_Tp;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;


@SuppressLint("WrongConstant")

public class one_n_Turant_Pesa extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActInstantCash";

    public Activity activity;
    public int f46i = 0;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private TextView btnApplyNow;
    private Intent intent;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir_loan_act_instant_cash);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_n_Turant_Pesa.this.progressDialog.isShowing();
                    one_n_Turant_Pesa.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        TextView button = (TextView) findViewById(R.id.btnApplyNow);
        btnApplyNow = button;
        button.setOnClickListener(this);

        ivBack = findViewById(R.id.id_ivBack);
        tvTitle = findViewById(R.id.id_tvTitle);

        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText("Loan Amount");

    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnApplyNow) {
            one_Loan_YT.gclick++;
            if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                ironfullscreen(1);
            } else {
                click(1);
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();
        one_n_Turant_Pesa.this.progressBar.dismiss();
        one_n_Turant_Pesa.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, one_ed_Ln_Tp.class);
            intent = intent2;
            startActivity(intent2);
        } else if (i == 2) {
            startActivity(new Intent(this, one_d_F_Loan_Heart.class));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
