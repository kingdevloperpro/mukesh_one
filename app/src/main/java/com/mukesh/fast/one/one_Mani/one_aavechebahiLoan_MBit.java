package com.mukesh.fast.one.one_Mani;

import android.content.Context;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.mukesh.fast.one.one_haman.one_amd_DB_DB;
import com.mukesh.fast.one.one_haman.one_eed_TPPP;
import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.one_haman.one_ddded__PF;
import com.speed.loan.one_Android_MBit;


public class one_aavechebahiLoan_MBit extends one_Android_MBit {
    public static final String TAG = "MyApplicationClass";
    public static one_aavechebahiLoan_MBit one_aavechebahiLoan_MBit;
    public static Context context = null;
    public static one_amd_DB_DB SFLoanDB = null;
    public static boolean isDownloaded = false;
    public static one_eed_TPPP SFLoanTPPP;
    private RequestQueue mRequestQueue;


    public static synchronized one_aavechebahiLoan_MBit getInstance() {
        one_aavechebahiLoan_MBit SFLoanMBit;
        synchronized (one_aavechebahiLoan_MBit.class) {
            SFLoanMBit = one_aavechebahiLoan_MBit;
        }
        return SFLoanMBit;
    }

    public static Context getContext() {
        return context;
    }

    public void onCreate() {
        super.onCreate();
        one_aavechebahiLoan_MBit = this;
        context = getApplicationContext();
        one_ddded__PF.sharedPreferences();
        if (!one_ddded__PF.sharedPreferences().contains("spin")) {
            one_ddded__PF.editorString("spin", one_ddded__PF.SPIN);
        }
        SFLoanDB = new one_amd_DB_DB(getApplicationContext());
        one_oklaeed__CMM.setDefaultFont(this, "DEFAULT", "fonts/MyFont.ttf");
        one_oklaeed__CMM.setDefaultFont(this, "MONOSPACE", "fonts/MyFont.ttf");
        one_oklaeed__CMM.setDefaultFont(this, "SERIF", "fonts/MyFont.ttf");
        one_oklaeed__CMM.setDefaultFont(this, "SANS_SERIF", "fonts/MyFont.ttf");
    }

    public RequestQueue getRequestQueue() {
        if (this.mRequestQueue == null) {
            this.mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return this.mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request, String str) {
        if (TextUtils.isEmpty(str)) {
            str = TAG;
        }
        request.setTag(str);
        getRequestQueue().add(request);
    }

    public <T> void addToRequestQueue(Request<T> request) {
        request.setTag(TAG);
        getRequestQueue().add(request);
    }

    public void cancelPendingRequests(Object obj) {
        RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.cancelAll(obj);
        }
    }


}
