package com.mukesh.fast.one;

import android.content.Context;
import android.net.ConnectivityManager;

public class one_Loan_YT {
    public static int click = 1;
    public static int gclick = 0;
    public static String privacy = null;


//    public static boolean isNetworkAvailable(Activity activity) {
//        NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
//        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
//    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}
