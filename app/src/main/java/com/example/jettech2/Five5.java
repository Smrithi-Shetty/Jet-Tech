package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

public class Five5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five5);

        final AutoCompleteTextView auto1=(AutoCompleteTextView)findViewById(R.id.auto1);
        final AutoCompleteTextView auto2=(AutoCompleteTextView)findViewById(R.id.auto2);
        ImageView image_auto1=(ImageView)findViewById(R.id.image_auto1);
        ImageView image_auto2=(ImageView)findViewById(R.id.image_auto2);

        ArrayAdapter<String> adapter10=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Mr);
        auto1.setAdapter(adapter10);
        ArrayAdapter<String> adapter11=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Ms);
        auto1.setAdapter(adapter11);

        image_auto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auto1.showDropDown();
            }
        });

        image_auto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auto2.showDropDown();
            }
        });

    }
    private static final String[] Mr = new String[]{"Mr", "Mrs", "Ms"};
    private static final String[] Ms=new  String[]{"Mr", "Mrs", "Ms"};

    public void moveon(View view) {
        Intent move=new Intent(Five5.this,Six6.class);
        startActivity(move);
    }
}