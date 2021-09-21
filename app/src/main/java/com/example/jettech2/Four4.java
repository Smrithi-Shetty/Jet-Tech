package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Four4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four4);
    }

    public void smrithi(View view) {
        Intent smr=new Intent(Four4.this,Five5.class);
        startActivity(smr);
    }
}