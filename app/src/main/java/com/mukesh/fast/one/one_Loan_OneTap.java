package com.mukesh.fast.one;

import android.os.SystemClock;
import android.view.View;

public abstract class one_Loan_OneTap implements View.OnClickListener {

    protected int defaultInterval;
    private long lastTimeClicked = 0;

    public one_Loan_OneTap() {
        this(1000);
    }

    public one_Loan_OneTap(int minInterval) {
        this.defaultInterval = minInterval;
    }

    @Override
    public void onClick(View v) {
        if (SystemClock.elapsedRealtime() - lastTimeClicked < defaultInterval) {
            return;
        }
        lastTimeClicked = SystemClock.elapsedRealtime();
        performClick(v);
    }

    public abstract void performClick(View v);
}