package com.mukesh.fast.one.one_ed__Manager;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.R;
import com.mukesh.fast.one.one_Mani.one_bo_Loan_SP;
import com.speed.loan.mukesh_ads.Speed_Android_Main_Pref;

import org.jetbrains.annotations.NotNull;

public class one_peed_Loan_LG_ADP extends RecyclerView.Adapter<one_peed_Loan_LG_ADP.MyHolder> {

    Activity context;
    int[] langs;
    Speed_Android_Main_Pref transMainPref;


    public one_peed_Loan_LG_ADP(Activity context, int[] langs) {
        this.context = context;
        this.langs = langs;
        transMainPref = new Speed_Android_Main_Pref(context);
    }


    @NotNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jahir_loan_langs_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyHolder holder, int position) {
        holder.imgCountry.setImageResource(langs[position]);
        holder.imgCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (transMainPref.getApp_Permission().equalsIgnoreCase("on")) {
                    context.startActivity(new Intent(context, one_kdd_Loan_PR.class).putExtra("app_inter", true));
                } else if (transMainPref.getApp_Start().equalsIgnoreCase("on")) {
                    context.startActivity(new Intent(context, one_ird__Loan_ST.class).putExtra("app_inter", true));
                } else {
                    context.startActivity(new Intent(context, new one_bo_Loan_SP().activity_X).putExtra("app_inter", true));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return langs.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView imgCountry, imgCheck;


        public MyHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgCountry = itemView.findViewById(R.id.imgCountry);
            imgCheck = itemView.findViewById(R.id.imgCheck);

        }
    }
}
