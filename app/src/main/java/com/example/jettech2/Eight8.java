package com.example.jettech2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eight8 extends AppCompatActivity {

    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight8);

        btn_submit=(Button)findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    public void openDialog() {
        ExampleDialog exampleDialog=new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");

    }

    public void homie(View view) {
        Intent homiee =new Intent(Eight8.this,NewActivity.class);
        startActivity(homiee);
    }
}