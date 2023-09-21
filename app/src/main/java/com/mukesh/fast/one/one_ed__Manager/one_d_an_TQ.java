package com.mukesh.fast.one.one_ed__Manager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Mani.one_bo_Loan_SP;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;


public class one_d_an_TQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jahir_loan_activity_thankyou);

        Trans_Aud_Id.NativeAddShow(this, findViewById(R.id.native_container));
        if (getIntent().getBooleanExtra("app_inter", false)) {
            jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        }

        findViewById(R.id.llYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(1);
            }
        });
        findViewById(R.id.llNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(one_d_an_TQ.this, new one_bo_Loan_SP().activity_X).putExtra("app_inter", true));
                finish();
            }
        });


    }


    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(1);
    }
}