package com.mukesh.fast.one.one_d_ADP;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mukesh.fast.one.one_peed__Bnk.one_d_Bnk_Info;
import com.mukesh.fast.one.one_Pojo.one_d_an_Bank_Details;
import com.mukesh.fast.one.R;

import java.util.ArrayList;

public class one_aheed__Loan_BN extends RecyclerView.Adapter<one_aheed__Loan_BN.ViewHolder> {
    public Context activity;
    private int ITEM_DATA = 0;
    private ArrayList<one_d_an_Bank_Details> list;


    public one_aheed__Loan_BN(Activity activity2, ArrayList<one_d_an_Bank_Details> arrayList) {
        this.activity = activity2;
        this.list = arrayList;
    }

    @NonNull
    @Override
    public one_aheed__Loan_BN.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.jahir_loan_custom_bank_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull one_aheed__Loan_BN.ViewHolder holder, int position) {
        one_d_an_Bank_Details SFLoanBankDetails = this.list.get(position);
        Glide.with(this.activity).load(SFLoanBankDetails.getImage()).apply(new RequestOptions().error(R.drawable.ic_launcher)).thumbnail(Glide.with(this.activity).load(R.drawable.ic_loading_gif)).into(holder.imgIcon);
        holder.tvName.setText(SFLoanBankDetails.getTitle());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity.getApplicationContext(), one_d_Bnk_Info.class);
                intent.putExtra("image", SFLoanBankDetails.getImage());
                intent.putExtra("NAME", SFLoanBankDetails.getName());
                intent.putExtra("number", SFLoanBankDetails.getNumber());
                activity.startActivity(intent);
            }
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    public void filterList(ArrayList<one_d_an_Bank_Details> arrayList) {
        this.list = arrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.ITEM_DATA;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgIcon;
        public LinearLayout linearLayout;
        public TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
            this.imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            this.tvName = (TextView) itemView.findViewById(R.id.tvName);
        }
    }
}

