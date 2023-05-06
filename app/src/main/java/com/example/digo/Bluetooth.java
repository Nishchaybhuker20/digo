package com.example.digo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Bluetooth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        getSupportActionBar().hide();
    }
}