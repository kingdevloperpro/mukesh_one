package com.mukesh.fast.one.one_d_ADP;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.mukesh.fast.one.one_haman.one_oklaeed__CMM;
import com.mukesh.fast.one.one_haman.one_ddded__PF;
import com.mukesh.fast.one.one_Pojo.one_lued_Foan_Ln_Dt;
import com.mukesh.fast.one.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class one_jamad__Loan_ST extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Activity activity;
    public Intent intent;
    String strCALLBACK_URL;
    String strCURRENCY;
    String strEMAIL = "";
    String strMID;
    String strMOBILE_NO;
    String strORDERID;
    String strORDER_ID = "orderID";
    String strSTATUS;
    String strTXNAMOUNT;
    String strTXNDATE;
    String strTXNID;
    String strTXN_AMOUNT = "1";
    private int ITEM_DATA = 0;
    private ArrayList<one_lued_Foan_Ln_Dt> list;

    public one_jamad__Loan_ST(Activity activity2, ArrayList<one_lued_Foan_Ln_Dt> arrayList) {
        this.activity = activity2;
        this.list = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == this.ITEM_DATA) {
            return new ItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jahir_loan_item_loan_status, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == this.ITEM_DATA) {
            final ItemHolder itemHolder = (ItemHolder) viewHolder;
            final one_lued_Foan_Ln_Dt SFLoanLnDt = this.list.get(i);
            TextView textView = itemHolder.tvLoanDate;
            textView.setText("Loan Status For Issued Date Of " + SFLoanLnDt.getDate());
            itemHolder.tvLoanType.setText(SFLoanLnDt.getLoanType());
            itemHolder.tvAmount.setText(SFLoanLnDt.getAmount());
            itemHolder.tvName.setText(SFLoanLnDt.getName());
            itemHolder.tvEmail.setText(SFLoanLnDt.getEmail());
            itemHolder.tvDateOfBirth.setText(SFLoanLnDt.getDateOfBirth());
            TextView textView2 = itemHolder.tvDocumentType;
            textView2.setText(SFLoanLnDt.getDocumentType() + " No. : ");
            itemHolder.tvDocumentNumber.setText(SFLoanLnDt.getDocumentNumber());
            itemHolder.tvAddress.setText(SFLoanLnDt.getAddress());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Calendar instance = Calendar.getInstance();
            try {
                instance.setTime(simpleDateFormat.parse(SFLoanLnDt.getDate()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            instance.add(5, 2);
            String format = simpleDateFormat.format(instance.getTime());
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            try {
                instance3.setTime(simpleDateFormat.parse(format));
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
            long days = TimeUnit.MILLISECONDS.toDays(instance3.getTimeInMillis() - instance2.getTimeInMillis());
            if (days > 0) {
                itemHolder.tvStatus.setText("In Review");
                itemHolder.tvStatus.setTextColor(ContextCompat.getColor(this.activity, R.color.blue));
                TextView textView3 = itemHolder.tvDayRemaining;
                textView3.setText(days + " Days");
            } else {
                itemHolder.tvStatus.setText("In Progress");
                itemHolder.tvStatus.setTextColor(ContextCompat.getColor(this.activity, R.color.green));
                itemHolder.tvDayRemaining.setText("0 Days");
                itemHolder.btnProcess.setText("Confirm Loan Application");
            }
            itemHolder.btnProcess.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    if (itemHolder.btnProcess.getText().toString().equals("Confirm Loan Application")) {
                        one_oklaeed__CMM.alertDialog(one_jamad__Loan_ST.this.activity, R.layout.jahir_loan_layout_dialog_loan_process, new one_oklaeed__CMM.DialogCreated() {

                            @Override
                            public void onDialogCreated(final AlertDialog alertDialog) {
                                ((Button) alertDialog.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View view) {
                                        alertDialog.dismiss();
                                        one_jamad__Loan_ST.this.strTXN_AMOUNT = String.valueOf((Double.parseDouble(SFLoanLnDt.getAmount()) / 100.0d) * 0.5d);
                                        long currentTimeMillis = System.currentTimeMillis();
                                        Random random = new Random(System.currentTimeMillis());
                                        one_jamad__Loan_ST VBLoanStatusAdapter = one_jamad__Loan_ST.this;
                                        VBLoanStatusAdapter.strORDER_ID = "orderID1" + currentTimeMillis + ((random.nextInt(2) + 1) * 10000) + random.nextInt(10000);
                                        one_jamad__Loan_ST VBLoanStatusAdapter2 = one_jamad__Loan_ST.this;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(one_jamad__Loan_ST.this.strORDER_ID);
                                        VBLoanStatusAdapter2.strCALLBACK_URL = sb.toString();
                                    }
                                });
                            }
                        });
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    @Override
    public int getItemViewType(int i) {
        return this.ITEM_DATA;
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        public Button btnProcess = ((Button) this.itemView.findViewById(R.id.btnProcess));
        public LinearLayout llMain = ((LinearLayout) this.itemView.findViewById(R.id.llMain));
        public TextView tvAddress = ((TextView) this.itemView.findViewById(R.id.tvAddress));
        public TextView tvAmount = ((TextView) this.itemView.findViewById(R.id.tvAmount));
        public TextView tvDateOfBirth = ((TextView) this.itemView.findViewById(R.id.tvDateOfBirth));
        public TextView tvDayRemaining = ((TextView) this.itemView.findViewById(R.id.tvDayRemaining));
        public TextView tvDocumentNumber = ((TextView) this.itemView.findViewById(R.id.tvDocumentNumber));
        public TextView tvDocumentType = ((TextView) this.itemView.findViewById(R.id.tvDocumentType));
        public TextView tvEmail = ((TextView) this.itemView.findViewById(R.id.tvEmail));
        public TextView tvLoanDate = ((TextView) this.itemView.findViewById(R.id.tvLoanDate));
        public TextView tvLoanType = ((TextView) this.itemView.findViewById(R.id.tvLoanType));
        public TextView tvName = ((TextView) this.itemView.findViewById(R.id.tvName));
        public TextView tvStatus = ((TextView) this.itemView.findViewById(R.id.tvStatus));

        public ItemHolder(View view) {
            super(view);
            one_jamad__Loan_ST.this.strMOBILE_NO = one_ddded__PF.getNumber();
            one_jamad__Loan_ST.this.strMID = one_ddded__PF.getMID();
            one_jamad__Loan_ST.this.strEMAIL = one_ddded__PF.getEmail();
        }
    }
}
