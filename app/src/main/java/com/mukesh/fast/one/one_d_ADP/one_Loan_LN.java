package com.mukesh.fast.one.one_d_ADP;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.one_Pojo.one_am_F_Loan_List;
import com.mukesh.fast.one.R;

import java.util.ArrayList;

public class one_Loan_LN extends RecyclerView.Adapter<one_Loan_LN.MyViewHolder> {
    ArrayList<one_am_F_Loan_List> SFLoanListData;
    Context context;
    View.OnClickListener onClickListener;

    public one_Loan_LN(Context context2, ArrayList<one_am_F_Loan_List> arrayList, View.OnClickListener onClickListener2) {
        this.context = context2;
        this.SFLoanListData = arrayList;
        this.onClickListener = onClickListener2;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jahir_loan_item_app_list, viewGroup, false));
    }

    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        one_am_F_Loan_List SFLoanList2 = this.SFLoanListData.get(i);
        myViewHolder.name.setText(SFLoanList2.getAppName());
        myViewHolder.tvInterest.setText(SFLoanList2.getInterest());
        myViewHolder.tvLoan.setText(SFLoanList2.getBorrowRange());
        myViewHolder.tvTerms.setText(SFLoanList2.getBorrowTerm());
        myViewHolder.cvMain.setTag(i);
        myViewHolder.cvMain.setOnClickListener(this.onClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return SFLoanListData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cvMain;
        ImageView icon;
        TextView name;
        TextView tvInterest;
        TextView tvLoan;
        TextView tvTerms;

        public MyViewHolder(View view) {
            super(view);
            cvMain = (CardView) view.findViewById(R.id.cvMain);
            name = (TextView) view.findViewById(R.id.tvName);
            tvInterest = (TextView) view.findViewById(R.id.tvInterest);
            tvTerms = (TextView) view.findViewById(R.id.tvTerms);
            tvLoan = (TextView) view.findViewById(R.id.tvLoan);
            icon = (ImageView) view.findViewById(R.id.icon);
        }
    }
}
