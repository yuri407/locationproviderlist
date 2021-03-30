package com.exampley.buttonwilnnerclass;

import android.view.View;

import androidx.core.app.ComponentActivity;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        mainActivity.mTextView1.setText("You clicked YR's button");
    }
}
