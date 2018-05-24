package com.example.android.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewsActivity extends AppCompatActivity {

    public static final String LOG_TAG = NewsActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
