package com.fahrulalhidayat.pelayanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickHospital(View view) {
        //gambar hospital di klik
        Intent i = new Intent(this,Hospital.class);
        startActivity(i);
    }
}