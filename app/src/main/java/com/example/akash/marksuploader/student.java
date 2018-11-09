package com.example.akash.marksuploader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;

public class student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        String user = "Akash";
        String dsp="Howdy, " + user + "!";
        setTitle(dsp);

        Date date = new Date();

        Toast.makeText(student.this,"Welcome, "+user+"!\n"+date.toString(),Toast.LENGTH_LONG).show();
        TextView t = (TextView) findViewById(R.id.textView6);
        t.setText("70");
        // getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.my)));

    }
}
