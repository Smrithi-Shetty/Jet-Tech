package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Calendar;



public class First1 extends AppCompatActivity {
    EditText ed_date1;
    EditText ed_date2;
    int year;
    int month;
    int day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);
        ed_date1=findViewById(R.id.ed_date1);
        ed_date2=findViewById(R.id.ed_date2);
        Calendar calendar= Calendar.getInstance();

        ed_date1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year= calendar.get(Calendar.YEAR);
                month= calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(First1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ed_date1.setText(SimpleDateFormat.getDateInstance().format(calendar.getTime()));

                    }
                },year,month,day);
                datePickerDialog.show();

            }
        });

        ed_date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year= calendar.get(Calendar.YEAR);
                month= calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(First1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ed_date2.setText(SimpleDateFormat.getDateInstance().format(calendar.getTime()));

                    }
                },year,month,day);
                datePickerDialog.show();

            }
        });




        final AutoCompleteTextView actv1 =(AutoCompleteTextView)findViewById(R.id.actv1);
        final AutoCompleteTextView actv2 =(AutoCompleteTextView)findViewById(R.id.actv2);
        Button nextButton =(Button)findViewById(R.id.nextButton);
        ImageView image1=(ImageView)findViewById(R.id.image1);
        ImageView image2=(ImageView)findViewById(R.id.image2);
        actv1.setThreshold(2);
        actv2.setThreshold(2);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,From);
        actv1.setAdapter(adapter);
        ArrayAdapter<String>adapter1 =new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,To);
        actv2.setAdapter(adapter1);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actv1.showDropDown();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actv2.showDropDown();
            }
        });




    }
    private static final String[] From =new String[] {"Bengaluru","Chennai","Mumbai","Kolkata","Delhi","Hyderabad","Chandigarh"};
    private static final String[] To =new String[] {"Bengaluru","Chennai","Mumbai","Kolkata","Delhi","Hyderabad","Chandigarh"};


    public void next(View view) {
        Intent xyz=new Intent(First1.this,Second2.class);
        startActivity(xyz);
    }
}
