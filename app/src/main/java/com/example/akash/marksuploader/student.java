package com.example.akash.marksuploader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        String user="Akash";
        setTitle("Hello, "+user+"!");
        TextView t = (TextView) findViewById(R.id.textView6);
        t.setText("70");
       // getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.my)));

    }
}
