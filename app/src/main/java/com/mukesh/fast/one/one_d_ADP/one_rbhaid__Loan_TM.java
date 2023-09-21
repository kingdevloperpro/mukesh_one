package com.mukesh.fast.one.one_d_ADP;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.R;

import java.util.ArrayList;

public class one_rbhaid__Loan_TM extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public int selectedPos;
    CustomItemClickListener listener;
    private int ITEM_DATA = 0;
    private Activity activity;
    private ArrayList<String> list;

    public one_rbhaid__Loan_TM(Activity activity2, ArrayList<String> arrayList, CustomItemClickListener customItemClickListener) {
        this.activity = activity2;
        this.list = arrayList;
        this.listener = customItemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jahir_loan_item_terms, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ItemHolder itemHolder = (ItemHolder) viewHolder;
        itemHolder.tvTerms.setText(this.list.get(i));

        itemHolder.llMain.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                one_rbhaid__Loan_TM VBTermsAdapter = one_rbhaid__Loan_TM.this;
                VBTermsAdapter.notifyItemChanged(VBTermsAdapter.selectedPos);
                one_rbhaid__Loan_TM VBTermsAdapter2 = one_rbhaid__Loan_TM.this;
                VBTermsAdapter2.selectedPos = i;
                VBTermsAdapter2.notifyItemChanged(VBTermsAdapter2.selectedPos);
                one_rbhaid__Loan_TM.this.listener.onItemClick(view, i);


            }
        });
        if (this.selectedPos == i) {
            itemHolder.llMain.setBackground(this.activity.getResources().getDrawable(R.drawable.selected_bg));
            itemHolder.tvTerms.setTextColor(ContextCompat.getColor(this.activity, R.color.white));

            return;
        }
        itemHolder.llMain.setBackground(this.activity.getResources().getDrawable(R.drawable.unselected_bgss));
        itemHolder.tvTerms.setTextColor(ContextCompat.getColor(this.activity, R.color.black));


    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.ITEM_DATA;
    }

    public interface CustomItemClickListener {
        void onItemClick(View view, int i);
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        public LinearLayout llMain = ((LinearLayout) this.itemView.findViewById(R.id.llMain));
        public TextView tvTerms = ((TextView) this.itemView.findViewById(R.id.tvTerms));


        public ItemHolder(View view) {
            super(view);
            int i = this.itemView.getResources().getDisplayMetrics().widthPixels;
            int i2 = this.itemView.getResources().getDisplayMetrics().heightPixels;
            double dpToPx = (double) ((i - one_oklaeed__CMM.dpToPx(10)) / 3);
            one_oklaeed__CMM.dpToPx(10);
        }
    }
}
