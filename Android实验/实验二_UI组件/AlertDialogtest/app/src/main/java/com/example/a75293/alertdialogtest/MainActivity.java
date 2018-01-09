package com.example.a75293.alertdialogtest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        View view= (LinearLayout) getLayoutInflater().inflate(R.layout.activity_main,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Android App");
        builder.setView(view);
        builder.setPositiveButton("cancel",null);
        builder.setNegativeButton("Sign in",null);
        builder.create().show();
    }
}
