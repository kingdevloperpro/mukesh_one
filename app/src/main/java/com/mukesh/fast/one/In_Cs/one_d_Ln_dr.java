package com.mukesh.fast.one.In_Cs;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.one_Pojo.one_am_F_Loan_List;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;

@SuppressLint("WrongConstant")

public class one_d_Ln_dr extends AppCompatActivity {
    private static final String TAG = "ActLoanDetils";
    public static String Data = "data";
    public int f46i = 0;
    TextView amount;
    one_am_F_Loan_List SFLoanList;
    TextView app_name;
    TextView apply_loan;
    ImageView back2;
    FrameLayout frameLayout;
    TextView interest;
    int position;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    TextView term;

    private boolean isOnline() {
        @SuppressLint("WrongConstant") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_activity_act_loan_detils);


        frameLayout = (FrameLayout) findViewById(R.id.fl_adplaceholder);

        banneriron();

        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_d_Ln_dr.this.progressDialog.isShowing();
                    one_d_Ln_dr.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        Intent intent = getIntent();
        if (intent != null) {
            SFLoanList = (one_am_F_Loan_List) intent.getSerializableExtra(Data);
        }
        one_oklaeed__CMM.toolbar(this, "Loan Details", false);
        app_name = (TextView) findViewById(R.id.app_name);
        amount = (TextView) findViewById(R.id.amount);
        interest = (TextView) findViewById(R.id.interest);
        term = (TextView) findViewById(R.id.term);
        apply_loan = (TextView) findViewById(R.id.apply_loan);
        app_name.setText(this.SFLoanList.getAppName());
        amount.setText(this.SFLoanList.getBorrowRange());
        interest.setText(this.SFLoanList.getInterest());
        term.setText(this.SFLoanList.getBorrowTerm());
        apply_loan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                one_Loan_YT.gclick++;
                if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                    one_d_Ln_dr.this.ironfullscreen(1);
                } else {
                    one_d_Ln_dr.this.click(1);
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void banneriron() {
        final FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.bannerContainer);
        frameLayout2.setVisibility(0);

        frameLayout2.removeAllViews();
        one_d_Ln_dr.this.showgbanner();
    }

    public void showgbanner() {
        View findViewById = findViewById(R.id.banner_container);
        findViewById.setVisibility(0);
    }


    public void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();

        one_d_Ln_dr.this.progressBar.dismiss();
        one_d_Ln_dr.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + this.SFLoanList.getPackageNameStr())));
        } else if (i == 2) {
            startActivity(new Intent(this, one_ed_Ln_Tp.class));
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
