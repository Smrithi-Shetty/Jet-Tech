package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AutoCompleteTextView;


public class Second2 extends AppCompatActivity {
    TextView tv1_value,tv2_value,tv3_value;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        tv1_value = (TextView) findViewById(R.id.tv1_value);
        tv2_value = (TextView) findViewById(R.id.tv2_value);
        tv3_value = (TextView) findViewById(R.id.tv3_value);

            final AutoCompleteTextView edit_class=(AutoCompleteTextView) findViewById(R.id.edit_class);
        ImageView image10=(ImageView)findViewById(R.id.image10);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Economy);
        edit_class.setAdapter(adapter);

        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit_class.showDropDown();
            }
        });

    }
        public void incr1 (View view){
            count++;
            tv1_value.setText("" + count);
        }

        public void decr1 (View view){
            if (count <= 0) count = 0;
            else count--;

            tv1_value.setText("" + count);
        }

        public void incr2 (View view){
            count++;
            tv2_value.setText("" + count);
        }

        public void decr2 (View view){
            if (count <= 0) count = 0;
            else count--;

            tv2_value.setText("" + count);
        }

        public void incr3 (View view){
            count++;
            tv3_value.setText("" + count);
        }

        public void decr3 (View view){
            if (count <= 0) count = 0;
            else count--;

            tv3_value.setText("" + count);
        }

        private static final String[] Economy = new String[]{"Economy", "Business", "First"};


    public void searching(View view) {
        Intent search= new Intent(Second2.this, Third3.class);
        startActivity(search);
    }
}