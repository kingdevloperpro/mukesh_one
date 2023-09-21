package com.mukesh.fast.one.one_ed_Appie;

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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.mukesh.fast.one.one_Mani.one_aavechebahiLoan_MBit;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

@SuppressLint("WrongConstant")

public class one_eed_n_AP_DT extends AppCompatActivity {
    private static final String TAG = "ActLoanDetails";

    public Activity activity;
    public int f46i = 0;
    public Intent intent;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    ImageView ivBack;
    private LinearLayout btnApplyForLoan;
    private TextView tvDescription;
    private TextView tvName, tvTitle;

    private boolean isOnline() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_loan_details);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeAddShow(this, findViewById(R.id.adsContainer));

        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_eed_n_AP_DT.this.progressDialog.isShowing();
                    one_eed_n_AP_DT.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.personal_loan);
        tvDescription = (TextView) findViewById(R.id.tvDescription);
        btnApplyForLoan = (LinearLayout) findViewById(R.id.btnApplyForLoan);
        TextView textView = this.tvTitle;
        if (!one_aavechebahiLoan_MBit.SFLoanTPPP.getName().equals("")) {
            textView.setText(one_aavechebahiLoan_MBit.SFLoanTPPP.getName() + " Information");
        }
        tvDescription.setText(one_aavechebahiLoan_MBit.SFLoanTPPP.getDescription());
        btnApplyForLoan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_eed_n_AP_DT.this.ironfullscreen(1);
                } else {
                    one_eed_n_AP_DT.this.click(1);
                }
            }
        });
    }

    @Override
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

        one_eed_n_AP_DT.this.progressBar.dismiss();
        one_eed_n_AP_DT.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, one__Loan_Ammoint.class);
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
