package com.mukesh.fast.one.one_ed__Manager;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Mani.one_bo_Loan_SP;
import com.speed.loan.mukesh_ads.Speed_Android_Main_Pref;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

import java.util.ArrayList;

public class one_fd_n_LNGG extends AppCompatActivity {

    RecyclerView rvV;
    ArrayList<one_ned_F_Loan_MC> one_ned_F_Loan_MCS;
    Speed_Android_Main_Pref transMainPref;
    //back------------------------------------------------------------------------------------------
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jahir__loan_activity_count);

        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.native_container));

        if (getIntent().getBooleanExtra("app_inter", false)) {
            jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        }

        transMainPref = new Speed_Android_Main_Pref(this);
        addData();
        init();
    }

    private void addData() {
        one_ned_F_Loan_MCS = new ArrayList<>();
        one_ned_F_Loan_MCS.add(new one_ned_F_Loan_MC("United Kingdom", "gb", R.drawable.uk));
        one_ned_F_Loan_MCS.add(new one_ned_F_Loan_MC("United States", "us", R.drawable.us));
        one_ned_F_Loan_MCS.add(new one_ned_F_Loan_MC("Canada", "ca", R.drawable.canada));
        one_ned_F_Loan_MCS.add(new one_ned_F_Loan_MC("Australia", "au", R.drawable.au));
        one_ned_F_Loan_MCS.add(new one_ned_F_Loan_MC("Switzerland", "ch", R.drawable.ch));
        one_ned_F_Loan_MCS.add(new one_ned_F_Loan_MC("World Wide", "all", R.drawable.globalcall));
    }

    private void init() {
        rvV = findViewById(R.id.rvV);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvV.setLayoutManager(gridLayoutManager);

        one_ireed_an_Lang countryAdapter = new one_ireed_an_Lang(this, one_ned_F_Loan_MCS, new one_akhoSpd_an_BV() {
            @Override
            public void callback(String code) {
                if (transMainPref.getApp_Privacy().equalsIgnoreCase("on")) {
                    startActivity(new Intent(one_fd_n_LNGG.this, one_rbhaid_oan_PK.class).putExtra("app_inter", true));
                } else if (transMainPref.getApp_Language().equalsIgnoreCase("on")) {
                    startActivity(new Intent(one_fd_n_LNGG.this, one_ned_Bhasha.class).putExtra("app_inter", true));
                } else if (transMainPref.getApp_Permission().equalsIgnoreCase("on")) {
                    startActivity(new Intent(one_fd_n_LNGG.this, one_kdd_Loan_PR.class).putExtra("app_inter", true));
                } else if (transMainPref.getApp_Start().equalsIgnoreCase("on")) {
                    startActivity(new Intent(one_fd_n_LNGG.this, one_ird__Loan_ST.class).putExtra("app_inter", true));
                } else {
                    startActivity(new Intent(one_fd_n_LNGG.this, new one_bo_Loan_SP().activity_X).putExtra("app_inter", true));
                }
            }
        });

        rvV.setAdapter(countryAdapter);
    }

    @Override
    public void onBackPressed() {
        exitMode(this);
    }

    private void exitMode(Activity context) {

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
