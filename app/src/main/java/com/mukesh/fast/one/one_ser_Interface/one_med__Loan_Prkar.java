package com.mukesh.fast.one.one_ser_Interface;

import android.annotation.SuppressLint;
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

import com.mukesh.fast.one.one_haman.one_eed_TPPP;
import com.mukesh.fast.one.one_ed_Appie.one_eed_n_AP_DT;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.mukesh.fast.one.one_Mani.one_aavechebahiLoan_MBit;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;


@SuppressLint("WrongConstant")

public class one_med__Loan_Prkar extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActLoanTypes";


    public int f46i = 0;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private ImageView imgAutoLoan;
    private ImageView imgBusinessLoan;
    private ImageView imgHomeLoan;
    private ImageView imgMortgages;
    private ImageView imgPaydayLoan;
    private ImageView imgPersonalLoan;
    private ImageView imgSmallBusiness;
    private ImageView imgStudentLoan;

    private boolean isOnline() {
        @SuppressLint("MissingPermission") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_loan_types);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);

        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_med__Loan_Prkar.this.progressDialog.isShowing();
                    one_med__Loan_Prkar.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        imgPersonalLoan = (ImageView) findViewById(R.id.imgPersonalLoan);
        imgAutoLoan = (ImageView) findViewById(R.id.imgAutoLoan);
        imgHomeLoan = (ImageView) findViewById(R.id.imgHomeLoan);
        imgBusinessLoan = (ImageView) findViewById(R.id.imgBusinessLoan);
        imgStudentLoan = (ImageView) findViewById(R.id.imgStudentLoan);
        imgMortgages = (ImageView) findViewById(R.id.imgMortgages);
        imgPaydayLoan = (ImageView) findViewById(R.id.imgPaydayLoan);
        imgSmallBusiness = (ImageView) findViewById(R.id.imgSmallBusiness);
        ivBack = findViewById(R.id.id_ivBack);
        tvTitle = findViewById(R.id.id_tvTitle);

        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.loan_type);


        imgPersonalLoan.setOnClickListener(this);
        imgAutoLoan.setOnClickListener(this);
        imgHomeLoan.setOnClickListener(this);
        imgBusinessLoan.setOnClickListener(this);
        imgStudentLoan.setOnClickListener(this);
        imgMortgages.setOnClickListener(this);
        imgPaydayLoan.setOnClickListener(this);
        imgSmallBusiness.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgAutoLoan:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.AUTO_LOAN;
                    ironfullscreen(2);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.AUTO_LOAN;
                click(2);
                return;
            case R.id.imgBusinessLoan:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.BUSINESS_LOAN;
                    ironfullscreen(4);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.BUSINESS_LOAN;
                click(4);
                return;
            case R.id.imgHomeLoan:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.HOME_LOAN;
                    ironfullscreen(3);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.HOME_LOAN;
                click(3);
                return;

            case R.id.imgMortgages:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.MORTGAGES;
                    ironfullscreen(6);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.MORTGAGES;
                click(6);
                return;
            case R.id.imgPaydayLoan:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.PAYDAY_LOAN;
                    ironfullscreen(7);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.PAYDAY_LOAN;
                click(7);
                return;
            case R.id.imgPersonalLoan:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.PERSONAL_LOAN;
                    ironfullscreen(1);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.PERSONAL_LOAN;
                click(1);
                return;
            case R.id.imgSmallBusiness:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.SMALL_BUSINESS;
                    ironfullscreen(8);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.SMALL_BUSINESS;
                click(8);
                return;
            case R.id.imgStudentLoan:
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.STUDENT_LOAN;
                    ironfullscreen(5);
                    return;
                }
                one_aavechebahiLoan_MBit.SFLoanTPPP = one_eed_TPPP.STUDENT_LOAN;
                click(5);
                return;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        this.progressBar.setMessage("Ads Loading ...");
        this.progressBar.setProgressStyle(0);
        this.progressBar.show();
        one_med__Loan_Prkar.this.progressBar.dismiss();
        one_med__Loan_Prkar.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 2) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 3) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 4) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 5) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 6) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 7) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        } else if (i == 8) {
            startActivity(new Intent(this, one_eed_n_AP_DT.class));
//            finish();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
