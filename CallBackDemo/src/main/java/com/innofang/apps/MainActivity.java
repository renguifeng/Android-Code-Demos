package com.innofang.apps;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.innofang.apps.call_back_demo_2.LoadeImageActivity;
import com.innofang.apps.call_back_demo_1.ClickRecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callBackDemo1(View view) {
        startActivity(new Intent(this, ClickRecyclerViewActivity.class));
    }

    public void callBackDemo2(View view) {
        startActivity(new Intent(this, LoadeImageActivity.class));
    }
}
