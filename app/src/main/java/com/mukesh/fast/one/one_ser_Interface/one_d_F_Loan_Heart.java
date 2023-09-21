package com.mukesh.fast.one.one_ser_Interface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.mukesh.fast.one.one_eed__Page.one_e_CashCount;
import com.mukesh.fast.one.one_eed__Page.one_i_n_Web;
import com.mukesh.fast.one.one_ed__Manager.one_fd_n_LNGG;
import com.mukesh.fast.one.one_ed__Manager.one_ned_Bhasha;
import com.mukesh.fast.one.one_ed__Manager.one_kdd_Loan_PR;
import com.mukesh.fast.one.one_ed__Manager.one_rbhaid_oan_PK;
import com.mukesh.fast.one.one_ed__Manager.one_ird__Loan_ST;
import com.mukesh.fast.one.one_ed__Manager.one_d_an_TQ;
import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.one_peed__Bnk.one_ed__BB;
import com.mukesh.fast.one.one_peed__Bnk.one_ed__Lst_Act;
import com.mukesh.fast.one.one_haman.one_ddded__PF;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.speed.loan.mukesh_ads.Speed_Android_Main_Pref;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;


@SuppressLint("WrongConstant")

public class one_d_F_Loan_Heart extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ActMainLayout";
    public Activity activity;
    public int f46i = 0;
    public Intent intent;
    Speed_Android_Main_Pref transMainPref;
    RelativeLayout cvcashcounter;
    boolean isBack = false;
    ProgressDialog progressBar;
    ProgressDialog progressDialog;
    //back------------------------------------------------------------------------------------------
    boolean doubleBackToExitPressedOnce = false;
    private LinearLayout cvBankBalance;
    private RelativeLayout cvInstantCash;
    private LinearLayout cvLoanStatus;
    private RelativeLayout cvLoanTypes;
    private ImageView cvLuckySpinner;
    private ImageView cvVideoStatus;
    private LinearLayout ifsc_code;
    private TextView tvAccountName;
    private TextView tvName;
    private TextView tvNumber;

    private boolean isOnline() {
        @SuppressLint({"MissingPermission", "WrongConstant"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_main);

        activity = this;
        transMainPref = new Speed_Android_Main_Pref(this);



        if (getIntent().getBooleanExtra("app_inter", false)) {
            jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        }
        Trans_Aud_Id.NativeAddShow(this, findViewById(R.id.adsContainer));


        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    one_d_F_Loan_Heart.this.progressDialog.isShowing();
                    one_d_F_Loan_Heart.this.progressDialog.dismiss();
                }
            }, 3000);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvAccountName = (TextView) findViewById(R.id.tvAccountName);
        ifsc_code = (LinearLayout) findViewById(R.id.ifsc_code);
        cvBankBalance = (LinearLayout) findViewById(R.id.cvBankBalance);
        cvLoanStatus = (LinearLayout) findViewById(R.id.cvLoanStatus);
        cvLoanTypes = (RelativeLayout) findViewById(R.id.cvLoanTypes);
        cvInstantCash = (RelativeLayout) findViewById(R.id.cvInstantCash);
        cvcashcounter = (RelativeLayout) findViewById(R.id.cvcashcounter);
        TextView textView = this.tvAccountName;
        textView.setText("Hello " + one_ddded__PF.getName() + "!");
        cvBankBalance.setOnClickListener(this);
        cvLoanStatus.setOnClickListener(this);
        cvLoanTypes.setOnClickListener(this);
        cvInstantCash.setOnClickListener(this);
        cvcashcounter.setOnClickListener(this);
        ifsc_code.setOnClickListener(this);
        findViewById(R.id.cvCalc).setOnClickListener(this);
    }

    public void onClick(View view) {
        if (one_oklaeed__CMM.isNetworkConnected(this.activity)) {
            switch (view.getId()) {
                case R.id.cvBankBalance:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(6);
                        return;
                    } else {
                        click(6);
                        return;
                    }
                case R.id.cvCalc:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(3);
                        return;
                    } else {
                        click(3);
                        return;
                    }
                case R.id.cvInstantCash:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(5);
                        return;
                    } else {
                        click(5);
                        return;
                    }
                case R.id.cvLoanStatus:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(7);
                        return;
                    } else {
                        click(7);
                        return;
                    }
                case R.id.cvLoanTypes:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(1);
                        return;
                    } else {
                        click(1);
                        return;
                    }
                case R.id.cvcashcounter:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(15);
                        return;
                    } else {
                        click(15);
                        return;
                    }
                case R.id.ifsc_code:
                    one_Loan_YT.gclick++;
                    if (one_Loan_YT.gclick % one_Loan_YT.click == 0) {
                        ironfullscreen(8);
                        return;
                    } else {
                        click(8);
                        return;
                    }
                default:
                    return;
            }
        } else {
            Toast.makeText(this.activity, getResources().getString(R.string.strNoInternet), 0).show();
        }
    }

    private void ironfullscreen(final int i) {
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        progressBar = progressDialog2;
        progressDialog2.setCancelable(false);
        progressBar.setMessage("Ads Loading ...");
        progressBar.setProgressStyle(0);
        progressBar.show();
        one_d_F_Loan_Heart.this.progressBar.dismiss();
        one_d_F_Loan_Heart.this.click(i);
    }

    public void click(int i) {
        if (i == 1) {
            Intent intent2 = new Intent(this.activity, one_med__Loan_Prkar.class);
            this.intent = intent2;
            startActivity(intent2);
        } else if (i == 3) {
            Intent intent3 = new Intent(this.activity, one_sd__Loan_Maths.class);
            this.intent = intent3;
            startActivity(intent3);
        } else if (i == 5) {
            Intent intent4 = new Intent(this.activity, one_n_Turant_Pesa.class);
            this.intent = intent4;
            startActivity(intent4);
        } else if (i == 6) {
            Intent intent5 = new Intent(this.activity, one_ed__BB.class);
            this.intent = intent5;
            startActivity(intent5);
        } else if (i == 7) {
            Intent intent6 = new Intent(this.activity, one_ed__Loan_Statusdjd.class);
            this.intent = intent6;
            startActivity(intent6);
        } else if (i == 8) {
            Intent intent7 = new Intent(this.activity, one_ed__Lst_Act.class);
            this.intent = intent7;
            startActivity(intent7);
        } else if (i == 10) {
            Intent intent8 = new Intent(this.activity, one_ed__Loan_Statusdjd.class);
            this.intent = intent8;
            startActivity(intent8);
        } else if (i == 12) {
            Intent intent9 = new Intent(this.activity, one_i_n_Web.class);
            this.intent = intent9;
            intent9.putExtra("title", "Terms & Condition");
            this.intent.putExtra("link", one_Loan_YT.privacy);
            startActivity(this.intent);
        } else if (i == 15) {
            startActivity(new Intent(this, one_e_CashCount.class));
        }
    }

    @Override
    public void onBackPressed() {
        exitMode(this);
    }

    private void exitMode(Activity context) {

        if (transMainPref.getApp_Start().equalsIgnoreCase("on")) {
            startActivity(new Intent(context, one_ird__Loan_ST.class).putExtra("app_inter", true));
            finish();
        } else if (transMainPref.getApp_Permission().equalsIgnoreCase("on")) {
            startActivity(new Intent(context, one_kdd_Loan_PR.class).putExtra("app_inter", true));
            finish();
        } else if (transMainPref.getApp_Language().equalsIgnoreCase("on")) {
            startActivity(new Intent(context, one_ned_Bhasha.class).putExtra("app_inter", true));
            finish();
        } else if (transMainPref.getApp_Privacy().equalsIgnoreCase("on")) {
            startActivity(new Intent(context, one_rbhaid_oan_PK.class).putExtra("app_inter", true));
            finish();
        } else if (transMainPref.getApp_Country().equalsIgnoreCase("on")) {
            startActivity(new Intent(context, one_fd_n_LNGG.class).putExtra("app_inter", true));
            finish();
        } else {
            if (transMainPref.getApp_Exit_Dialoge().equalsIgnoreCase("on")) {
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.jahir_loan_more_exit_dialog);
                dialog.setCancelable(true);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                Window window = dialog.getWindow();
                WindowManager.LayoutParams wlp = window.getAttributes();
                dialog.setCancelable(true);
                wlp.gravity = Gravity.BOTTOM;
                window.setAttributes(wlp);

                Trans_Aud_Id.NativeAddShow(this, dialog.findViewById(R.id.native_container));

                TextView txt_yes = dialog.findViewById(R.id.yes);
                txt_yes.setOnClickListener(v -> {
                    dialog.dismiss();
                    if (transMainPref.getApp_Thankyou().equalsIgnoreCase("on")) {
                        startActivity(new Intent(this, one_d_an_TQ.class).putExtra("app_inter", true));
                    } else {
                        finishAffinity();
                    }
                });
                dialog.show();
            } else {
                if (doubleBackToExitPressedOnce) {
                    ((Activity) context).finishAffinity();
                    System.exit(1);
                    return;
                }

                doubleBackToExitPressedOnce = true;
                Toast.makeText(context, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        doubleBackToExitPressedOnce = false;
                    }
                }, 2000);
            }
        }
    }

}
