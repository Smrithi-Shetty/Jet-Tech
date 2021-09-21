package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Third3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);
    }

    public void clickme(View view) {
        Intent soap=new Intent(Third3.this,Four4.class);
        startActivity(soap);
    }
}