package com.example.akash.marksuploader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class singup extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        TextView btn = (TextView) findViewById(R.id.link_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(singup.this, Login.class));
            }
        });

        Spinner myspin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(singup.this,
                R.layout.activity_spin_item,
                getResources().getStringArray(R.array.department));

        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspin.setAdapter(myadapter);
    }
}
