package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Verifikasi extends AppCompatActivity {
    public void tomenu(View view) {
        Intent tomenu = new Intent(this, Home.class);
        startActivity(tomenu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi);
    }
}