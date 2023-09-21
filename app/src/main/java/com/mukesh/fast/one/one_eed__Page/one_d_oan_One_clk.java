package com.mukesh.fast.one.one_eed__Page;

import android.os.SystemClock;
import android.view.View;

public abstract class one_d_oan_One_clk implements View.OnClickListener {

    protected int defaultInterval;
    private long lastTimeClicked = 0;

    public one_d_oan_One_clk() {
        this(1000);
    }

    public one_d_oan_One_clk(int minInterval) {
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