package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onclick(View view) {
        Intent ink=new Intent(LoginActivity.this , SignupActivity.class);
        startActivity(ink);
    }

    public void clickhere(View view) {
        Intent jet=new Intent(LoginActivity.this, NewActivity.class);
        startActivity(jet);
    }
}