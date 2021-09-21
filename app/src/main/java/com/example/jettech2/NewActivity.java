package com.example.jettech2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void ClickLogout(View view) {
        //close app
        logout(this);
    }

    public static void logout(final Activity activity) {
        //initialize alert dialog
        AlertDialog.Builder builder =new AlertDialog.Builder(activity);
        //set title
        builder.setTitle("Logout");
        //set message
        builder.setMessage("Are you sure you want to logout?");
        //positive yes button
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish activity
                activity.finishAffinity();
                //Exit app
                System.exit(0);
            }
        });
        //Negative no button
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dismiss dialogue
                dialog.dismiss();
            }
        });
        //show dialog
        builder.show();
    }


    public void books(View view) {
        Intent book=new Intent(NewActivity.this,First1.class);
        startActivity(book);
    }

    public void booms(View view) {
        Intent bhoomi=new Intent(NewActivity.this,Nine9.class);
        startActivity(bhoomi);
    }

    public void detailing(View view) {
        Intent Details=new Intent(NewActivity.this, TabbedActivity.class);
        startActivity(Details);
    }

    public void backie(View view) {
        Intent backing= new Intent(Intent.ACTION_VIEW);
        startActivity(backing);
    }
}