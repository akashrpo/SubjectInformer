package com.example.akash.marksuploader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.Date;

public class TeacherFrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_front_page);
        String user = "Teachers";
        setTitle("Howdy, " + user + "!");
        Date date = new Date();
        Toast.makeText(TeacherFrontPage.this,"Welcome, "+user+"!\n"+date.toString(),Toast.LENGTH_LONG).show();


        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.relativeLayout3);

        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherFrontPage.this, Uploader.class));
            }
        });

        RelativeLayout rl2 = (RelativeLayout) findViewById(R.id.relativeLayout2);

        rl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherFrontPage.this, Uploader.class));
            }
        });

        RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.relativeLayout4);

        rl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherFrontPage.this, Uploader.class));
            }
        });

        RelativeLayout rl4 = (RelativeLayout) findViewById(R.id.relativeLayout5);

        rl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherFrontPage.this, Uploader.class));
            }
        });

        RelativeLayout rl5 = (RelativeLayout) findViewById(R.id.relativeLayout6);

        rl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherFrontPage.this, Uploader.class));
            }
        });

        RelativeLayout rl8 = (RelativeLayout) findViewById(R.id.relativeLayout8);

        rl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherFrontPage.this, Uploader.class));
            }
        });

    }
}
