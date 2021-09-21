package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Six6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six6);
    }

    public void comeon(View view) {
        Intent come=new Intent(Six6.this,Seven7.class);
        startActivity(come);
    }
}