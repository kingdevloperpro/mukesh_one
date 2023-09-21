package com.mukesh.fast.one.one_eed__Page;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
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

public class one_ge_Details extends AppCompatActivity implements View.OnClickListener {
    TextView detailsloan;
    ProgressDialog progressBar;
    TextView tvTitle;
    ImageView ivBack;
    private ImageView imgAutoLoan;
    private ImageView imgBusinessLoan;
    private ImageView imgHomeLoan;
    private ImageView imgMortgages;
    private ImageView imgPaydayLoan;
    private ImageView imgPersonalLoan;
    private ImageView imgSmallBusiness;
    private ImageView imgStudentLoan;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.jahir__loan_act_full_loan_details);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));

        ivBack = findViewById(R.id.id_ivBack);
        tvTitle = findViewById(R.id.id_tvTitle);

        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(R.string.loan_information);

        detailsloan = findViewById(R.id.detailsloan);

        imgPersonalLoan = (ImageView) findViewById(R.id.imgPersonalLoan);
        imgAutoLoan = (ImageView) findViewById(R.id.imgAutoLoan);
        imgHomeLoan = (ImageView) findViewById(R.id.imgHomeLoan);
        imgBusinessLoan = (ImageView) findViewById(R.id.imgBusinessLoan);
        imgStudentLoan = (ImageView) findViewById(R.id.imgStudentLoan);
        imgMortgages = (ImageView) findViewById(R.id.imgMortgages);
        imgPaydayLoan = (ImageView) findViewById(R.id.imgPaydayLoan);
        imgSmallBusiness = (ImageView) findViewById(R.id.imgSmallBusiness);

        imgPersonalLoan.setOnClickListener(this);
        imgAutoLoan.setOnClickListener(this);
        imgHomeLoan.setOnClickListener(this);
        imgBusinessLoan.setOnClickListener(this);
        imgStudentLoan.setOnClickListener(this);
        imgMortgages.setOnClickListener(this);
        imgPaydayLoan.setOnClickListener(this);
        imgSmallBusiness.setOnClickListener(this);

        if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.HOME_LOAN) {
            detailsloan.setText(R.string.homeloandata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.AUTO_LOAN) {
            detailsloan.setText(R.string.autoloandata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.BUSINESS_LOAN) {
            detailsloan.setText(R.string.bussinessloandata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.MORTGAGES) {
            detailsloan.setText(R.string.moratagesdata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.PAYDAY_LOAN) {
            detailsloan.setText(R.string.paydayloandata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.PERSONAL_LOAN) {
            detailsloan.setText(R.string.personaldata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.SMALL_BUSINESS) {
            detailsloan.setText(R.string.smallbusinessdata);
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.STUDENT_LOAN) {
            detailsloan.setText(R.string.studentloandata);
        }
    }


    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressBar = progressDialog;
        progressDialog.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        one_ge_Details.this.progressBar.dismiss();
        one_ge_Details.this.click(i);
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
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
