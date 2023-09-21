package com.mukesh.fast.one.one_eed__Page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Loan_YT;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

@SuppressLint("WrongConstant")

public class one_i_n_Web extends AppCompatActivity {
    private static final String TAG = "WebViewActivity";
    public Activity activity;
    public int f46i = 0;
    ProgressDialog progressDialog;
    private WebView webView;

    private boolean isOnline() {
        @SuppressLint("MissingPermission") NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir_loan_activity_web_view);


        jahirAndroid_Admob_Id.ShowInterstitialAdsOnCreate(this);
        Trans_Aud_Id.NativeBannerAddShow(this, findViewById(R.id.adsContainer));

        progressDialog = new ProgressDialog(this);
        if (isOnline()) {
            progressDialog.setTitle("Loading Data");
            progressDialog.setMessage("Please Wait a second");
            progressDialog.hide();
            new Handler().postDelayed(new Runnable() {

                public void run() {
                    one_i_n_Web.this.progressDialog.isShowing();
                    one_i_n_Web.this.progressDialog.dismiss();
                }
            }, 3000);
        }
        this.activity = this;
        String string = getIntent().getExtras().getString("title");
        String str = one_Loan_YT.privacy;
        one_oklaeed__CMM.toolbar(this.activity, string, false);
        WebView webView2 = (WebView) findViewById(R.id.webView);
        webView = webView2;
        webView2.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(str);
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jahirAndroid_Admob_Id.ShowInterstitialAdsOnBack(this);
    }
}
