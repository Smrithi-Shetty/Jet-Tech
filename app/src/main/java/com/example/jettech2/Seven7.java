package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Seven7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven7);
    }

    public void swipe(View view) {
        Intent swiping=new Intent(Seven7.this, Eight8.class);
        startActivity(swiping);
    }
}