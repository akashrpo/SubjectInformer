package com.example.akash.marksuploader;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Devel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devel);
        setTitle("Developers");

        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.relative1);

        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Devel.this, "Front-End Developer", Toast.LENGTH_SHORT).show();

            }
        });

        RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.relative3);

        rl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Devel.this, "Back-End Developer", Toast.LENGTH_SHORT).show();

            }
        });

        RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.relative2);

        rl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Devel.this, "Computer Networks - I Developer Lol!", Toast.LENGTH_SHORT).show();

            }
        });

        TextView tv = (TextView) findViewById(R.id.textView14);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), feedback.class));


            }
        });


    }
}
