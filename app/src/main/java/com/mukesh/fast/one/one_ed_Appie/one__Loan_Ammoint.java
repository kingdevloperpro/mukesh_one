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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.In_Cs.one_ed_Ln_Tp;
import com.mukesh.fast.one.one_d_ADP.one_ched__Loan_AM;
import com.mukesh.fast.one.one_d_ADP.one_rbhaid__Loan_TM;
import com.mukesh.fast.one.one_haman.one_eed_TPPP;
import com.mukesh.fast.one.one_haman.one_ddded__PF;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.mukesh.fast.one.one_Mani.one_aavechebahiLoan_MBit;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

import java.util.ArrayList;

@SuppressLint("WrongConstant")

public class one__Loan_Ammoint extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActSelectAmount";
    public String emiTerms = "0";
    public int f46i = 0;
    public ArrayList<String> listAmount = new ArrayList<>();
    public ArrayList<String> listTerms = new ArrayList<>();
    public String loanAmount = "0";
    FrameLayout frame11;
    FrameLayout frameLayout;
    TextView tvTitle;
    ImageView ivBack;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    private Activity activity;
    private one_ched__Loan_AM VBAmountAdapter;
    private LinearLayout btnNext;
    private String emiAmount = "0";
    private GridLayoutManager gridLayoutManager;
    private Intent intent;
    private RecyclerView rvAmount;
    private RecyclerView rvTerms;
    private one_rbhaid__Loan_TM VBTermsAdapter;
    private TextView tvEmi;

    private boolean isOnline() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_select_amount);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {
                /* class com.twadd.instant.instntlngudese.LoanApply.ActSelectAmount.AnonymousClass1 */

                public void run() {
                    one__Loan_Ammoint.this.progressDialog.isShowing();
                    one__Loan_Ammoint.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        activity = this;
        rvAmount = (RecyclerView) findViewById(R.id.rvAmount);
        rvTerms = (RecyclerView) findViewById(R.id.rvTerms);
        tvEmi = (TextView) findViewById(R.id.tvEmi);
        LinearLayout button = (LinearLayout) findViewById(R.id.btnNext);
        btnNext = button;
        button.setOnClickListener(this);
        tvTitle = findViewById(R.id.id_tvTitle);
        ivBack = findViewById(R.id.id_ivBack);
        ivBack.setOnClickListener(v -> onBackPressed());
        tvTitle.setText(one_aavechebahiLoan_MBit.SFLoanTPPP.getName());
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this.activity, 3);
        gridLayoutManager = gridLayoutManager2;
        rvAmount.setLayoutManager(gridLayoutManager2);
        addAmount();
        one_ched__Loan_AM VBAmountAdapter2 = new one_ched__Loan_AM(this.activity, this.listAmount, new one_ched__Loan_AM.CustomItemClickListener() {

            @Override
            public void onItemClick(View view, int i) {
                one__Loan_Ammoint VBActSelectAmount = one__Loan_Ammoint.this;
                VBActSelectAmount.loanAmount = VBActSelectAmount.listAmount.get(i);
                one__Loan_Ammoint.this.calculateEmiAmount();
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
                one__Loan_Ammoint VBActSelectAmount = one__Loan_Ammoint.this;
                VBActSelectAmount.emiTerms = VBActSelectAmount.listTerms.get(i);
                one__Loan_Ammoint.this.calculateEmiAmount();
            }
        });
        VBTermsAdapter = VBTermsAdapter2;
        rvTerms.setAdapter(VBTermsAdapter2);
        loanAmount = this.listAmount.get(0);
        emiTerms = this.listTerms.get(0);
        calculateEmiAmount();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnNext) {
            one_Loan_YT.gclick++;
            if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                one_ddded__PF.editorString("loanAmount", this.loanAmount);
                one_ddded__PF.editorString("emiTerms", this.emiTerms);
                one_ddded__PF.editorString("emiAmount", this.emiAmount);
                ironfullscreen(1);
                return;
            }
            one_ddded__PF.editorString("loanAmount", this.loanAmount);
            one_ddded__PF.editorString("emiTerms", this.emiTerms);
            one_ddded__PF.editorString("emiAmount", this.emiAmount);
            click(1);
        }
    }

    public void calculateEmiAmount() {
        double parseDouble = Double.parseDouble(this.loanAmount) / Double.parseDouble(this.emiTerms);
        TextView textView = this.tvEmi;
        textView.setText("Monthly EMI Amount is Rs." + String.format("%.2f", Double.valueOf(parseDouble)));
        this.emiAmount = String.format("%.2f", Double.valueOf(parseDouble));
    }

    public void addAmount() {
        if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.PERSONAL_LOAN) {
            listAmount.add("1000");
            listAmount.add("5000");
            listAmount.add("10000");
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("150000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.AUTO_LOAN) {
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("200000");
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.HOME_LOAN) {
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
            listAmount.add("2000000");
            listAmount.add("3000000");
            listAmount.add("5000000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.BUSINESS_LOAN) {
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
            listAmount.add("2000000");
            listAmount.add("3000000");
            listAmount.add("5000000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.STUDENT_LOAN) {
            listAmount.add("10000");
            listAmount.add("20000");
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("200000");
            listAmount.add("500000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.MORTGAGES) {
            listAmount.add("500000");
            listAmount.add("1000000");
            listAmount.add("1500000");
            listAmount.add("2000000");
            listAmount.add("3000000");
            listAmount.add("5000000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.PAYDAY_LOAN) {
            listAmount.add("1000");
            listAmount.add("5000");
            listAmount.add("10000");
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("150000");
        } else if (one_aavechebahiLoan_MBit.SFLoanTPPP == one_eed_TPPP.SMALL_BUSINESS) {
            listAmount.add("50000");
            listAmount.add("100000");
            listAmount.add("150000");
            listAmount.add("200000");
            listAmount.add("350000");
            listAmount.add("500000");
        }
    }


    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        one__Loan_Ammoint.this.progressBar.dismiss();
        one__Loan_Ammoint.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, one_ed_Ln_Tp.class);
            intent = intent2;
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
