package com.example.digo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Brightness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brightness);
        getSupportActionBar().hide();
    }
}