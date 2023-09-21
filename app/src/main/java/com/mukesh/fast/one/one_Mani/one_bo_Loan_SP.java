package com.mukesh.fast.one.one_Mani;

import static com.mukesh.fast.one.pd__Exc.one_ud_Ex_Clinet.getGeoApiService;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.mukesh.fast.one.R;
import com.mukesh.fast.one.pd__Exc.one_ed_Ex_Res;
import com.mukesh.fast.one.pd__Exc.one_ed_Ex_Serc;
import com.mukesh.fast.one.one_ed__Manager.one_ned_Bhasha;
import com.mukesh.fast.one.one_ed__Manager.one_fd_n_LNGG;
import com.mukesh.fast.one.one_ed__Manager.one_rbhaid_oan_PK;
import com.mukesh.fast.one.one_ed__Manager.one_kdd_Loan_PR;
import com.mukesh.fast.one.one_ed__Manager.one_ird__Loan_ST;
import com.mukesh.fast.one.one__Speed__Rf.one_Loan_Api;
import com.mukesh.fast.one.one__Speed__Rf.one_Loan_UI;
import com.mukesh.fast.one.one_fad__Sanata.one_ed_Loan_App_Var;
import com.mukesh.fast.one.one_fad__Sanata.one_d__Loan_Arr;
import com.mukesh.fast.one.one_fad__Sanata.one_ied__Loan_PJ;
import com.mukesh.fast.one.one_fad__Sanata.one_ed_Loan_St;
import com.mukesh.fast.one.one_ser_Interface.one_d_F_Loan_Heart;
import com.speed.loan.mukesh_ads.jahir_Android_Int_Cls;
import com.speed.loan.mukesh_ads.Speed_Android_Main_Pref;
import com.speed.loan.mukesh_ads.Speed_Android_Sp_OP_Ad;
import com.speed.loan.Speed_jitpack_compose.jahirAndroid_Admob_Id;
import com.speed.loan.Speed_jitpack_compose.Trans_Aud_Id;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class one_bo_Loan_SP extends AppCompatActivity {

    public static Class activity_X;
    public boolean excludeChecker = false;
    public boolean includeChecker = false;
    List<one_ed_Loan_App_Var> mVar = new ArrayList<>();
    Speed_Android_Main_Pref transMainPref;
    //verify
    String iType = "";
    int normal_Index = 0;
    int publisher_Index = 1;

    AlertDialog.Builder builder1;
    AlertDialog.Builder builder2;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jahir__loan_act_splash);


        transMainPref = new Speed_Android_Main_Pref(this);


        if (isNetworkConnected()) {
            one_Loan_UI specialApiInterface = one_Loan_Api.getClient().create(one_Loan_UI.class);
            Call<one_ied__Loan_PJ> call = specialApiInterface.getSdkData();
            call.enqueue(new Callback<one_ied__Loan_PJ>() {
                @Override
                public void onResponse(Call<one_ied__Loan_PJ> call, Response<one_ied__Loan_PJ> response) {

                    mVar = response.body().getAppVariables();

                    one_ed_Loan_St app_SFLoanSt = response.body().getSettings();
                    iType = app_SFLoanSt.getLocType();

                    if (iType.equalsIgnoreCase("include") || iType.equalsIgnoreCase("exclude")) {
                        verifyUser(app_SFLoanSt.getLocArray());
                    } else {
                        setVariables(normal_Index);
                    }

                }

                @Override
                public void onFailure(Call<one_ied__Loan_PJ> call, Throwable t) {
                    //Log.e("@@Trans", "onFailure: " + t.getMessage());
                }
            });
        } else {
            checkNetworkConnection();
        }
    }


    private void setVariables(int varIndex) {
        transMainPref.setInterCnt(Integer.parseInt(mVar.get(varIndex).getIntersCnt()));
        transMainPref.setBack_cnt(Integer.parseInt(mVar.get(varIndex).getBackCnt()));
        transMainPref.setFB_app_id(mVar.get(varIndex).getFBAppId());
        transMainPref.setFB_inter(mVar.get(varIndex).getFBInter());
        transMainPref.setFB_native(mVar.get(varIndex).getFBNative());
        transMainPref.setFB_native_banner(mVar.get(varIndex).getFBNativeBanner());
        transMainPref.setFB_banner(mVar.get(varIndex).getFBBanner());
        transMainPref.setAmAppId(mVar.get(varIndex).getAMAppId());
        transMainPref.setAM_native(mVar.get(varIndex).getAMNative());
        transMainPref.setAM_inter(mVar.get(varIndex).getAMInter());
        transMainPref.setAM_banner(mVar.get(varIndex).getAMBanner());
        transMainPref.setAM_App_Open(mVar.get(varIndex).getAMAppOpen());
        transMainPref.setAM_Rectangele(mVar.get(varIndex).getAMRectangle());
        transMainPref.setDuo_Ads(mVar.get(varIndex).getDuo_Ads());
        transMainPref.setQureka_Inter(mVar.get(varIndex).getQureka_Inter());
        transMainPref.setQureka_Inter_Mode(mVar.get(varIndex).getQureka_Inter_Mode());
        transMainPref.setQureka_Inter_CloseTap(mVar.get(varIndex).getQureka_Inter_CloseTap());
        transMainPref.setQureka_Url(mVar.get(varIndex).getQureka_Url());
        transMainPref.setApp_Country(mVar.get(varIndex).getApp_Country());
        transMainPref.setApp_Privacy(mVar.get(varIndex).getApp_Privacy());
        transMainPref.setApp_Language(mVar.get(varIndex).getApp_Language());
        transMainPref.setApp_Permission(mVar.get(varIndex).getApp_Permission());
        transMainPref.setApp_Start(mVar.get(varIndex).getApp_Start());
        transMainPref.setApp_Thankyou(mVar.get(varIndex).getApp_Thankyou());
        transMainPref.setApp_Exit_Dialoge(mVar.get(varIndex).getApp_Exit_Dialoge());

        //ads & next
        jahirAndroid_Admob_Id.LoadInterstitialAds(one_bo_Loan_SP.this);
        Trans_Aud_Id.NativeAddLoad1(one_bo_Loan_SP.this);
        Trans_Aud_Id.NativeBannerAddLoad1(one_bo_Loan_SP.this);
        Speed_Android_Sp_OP_Ad.LoadInterstitialAd(one_bo_Loan_SP.this);
        moveToAppOpen();
    }

    private void verifyUser(List<one_d__Loan_Arr> iArray) {
        one_ed_Ex_Serc apiService = getGeoApiService();
        apiService.getLocation().enqueue(new retrofit2.Callback<one_ed_Ex_Res>() {
            @Override
            public void onResponse(Call<one_ed_Ex_Res> call, Response<one_ed_Ex_Res> response) {

                String uCountryCode = response.body().getCountryCode();
                String uStateCode = response.body().getRegion();
                String uCityName = response.body().getCity();


                switch (iType) {
                    case "include":
                        for (int k = 0; k < iArray.size(); k++) {
                            if (uCountryCode.equalsIgnoreCase(iArray.get(k).getCountryCode()) ||
                                    uStateCode.equalsIgnoreCase(iArray.get(k).getStateCode()) ||
                                    uCityName.equalsIgnoreCase(iArray.get(k).getCityName())) {
                                k = 999;
                                includeChecker = true;
                            }
                        }

                        if (includeChecker) {
                            setVariables(publisher_Index);
                            //Log.e("@@Trans", "exclude - Publisher...");
                        } else {
                            setVariables(normal_Index);
                            //Log.e("@@Trans", "exclude - Normal User...");
                        }
                        break;

                    case "exclude":
                        for (int j = 0; j < iArray.size(); j++) {
                            if (uCountryCode.equalsIgnoreCase(iArray.get(j).getCountryCode()) ||
                                    uStateCode.equalsIgnoreCase(iArray.get(j).getStateCode()) ||
                                    uCityName.equalsIgnoreCase(iArray.get(j).getCityName())) {
                                j = 999;
                                excludeChecker = true;
                            }
                        }

                        if (excludeChecker) {
                            setVariables(publisher_Index);
                            //Log.e("@@Trans", "include - Publisher...");
                        } else {
                            setVariables(normal_Index);
                            //Log.e("@@Trans", "include - Normal User...");
                        }
                        break;

                    default:
                        setVariables(normal_Index);
                        break;
                }
            }

            @Override
            public void onFailure(Call<one_ed_Ex_Res> call, Throwable t) {
                //Log.e("@@Trans", "user verify api issue: " + t.getMessage());
                setVariables(normal_Index);
            }
        });
    }

    private void moveToAppOpen() {
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                if (Speed_Android_Sp_OP_Ad.isAdAvailable()) {
                    onFinish();
                    cancel();
                }
            }

            public void onFinish() {
                Speed_Android_Sp_OP_Ad.ShowInterstitialAd(one_bo_Loan_SP.this, new jahir_Android_Int_Cls() {
                    @Override
                    public void onAdsClose() {
                        loadAppScreen();
                    }
                });
            }

        }.start();
    }

    private void loadAppScreen() {

        activity_X = one_d_F_Loan_Heart.class;

        if (transMainPref.getApp_Country().equalsIgnoreCase("on")) {
            Intent i = new Intent(one_bo_Loan_SP.this, one_fd_n_LNGG.class);
            i.putExtra("app_inter", false);
            startActivity(i);
        } else if (transMainPref.getApp_Privacy().equalsIgnoreCase("on")) {
            Intent i = new Intent(one_bo_Loan_SP.this, one_rbhaid_oan_PK.class);
            i.putExtra("app_inter", false);
            startActivity(i);
        } else if (transMainPref.getApp_Language().equalsIgnoreCase("on")) {
            Intent i = new Intent(one_bo_Loan_SP.this, one_ned_Bhasha.class);
            i.putExtra("app_inter", false);
            startActivity(i);
        } else if (transMainPref.getApp_Permission().equalsIgnoreCase("on")) {
            Intent i = new Intent(one_bo_Loan_SP.this, one_kdd_Loan_PR.class);
            i.putExtra("app_inter", false);
            startActivity(i);
        } else if (transMainPref.getApp_Start().equalsIgnoreCase("on")) {
            Intent i = new Intent(one_bo_Loan_SP.this, one_ird__Loan_ST.class);
            i.putExtra("app_inter", false);
            startActivity(i);
        } else {
            Intent i = new Intent(one_bo_Loan_SP.this, activity_X);
            i.putExtra("app_inter", false);
            startActivity(i);
        }
    }

    public boolean isDevMode() {
        if (Integer.valueOf(android.os.Build.VERSION.SDK) == 16) {
            return android.provider.Settings.Secure.getInt(getApplicationContext().getContentResolver(), android.provider.Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED, 0) != 0;
        } else if (Integer.valueOf(android.os.Build.VERSION.SDK) >= 17) {
            return android.provider.Settings.Secure.getInt(getApplicationContext().getContentResolver(), android.provider.Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0) != 0;
        } else return false;
    }


    public void checkNetworkConnection() {
        builder2 = new AlertDialog.Builder(this);
        builder2.setCancelable(false);
        builder2.setTitle("No internet Connection");
        builder2.setMessage("Please turn on internet connection to continue!");
        builder2.setPositiveButton("Turn On", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialogInterface, int i) {
                one_bo_Loan_SP.this.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                one_bo_Loan_SP.this.finish();
            }
        }).show();
        builder2.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialogInterface, int i) {
                one_bo_Loan_SP.this.finishAffinity();
            }
        }).show();
        builder2.create().show();
    }


    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}
