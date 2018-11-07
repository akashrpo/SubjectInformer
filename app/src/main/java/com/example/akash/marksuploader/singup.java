package com.example.akash.marksuploader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class singup extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

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

        final Spinner myspin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(singup.this,
                R.layout.activity_spin_item,
                getResources().getStringArray(R.array.department));

        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspin.setAdapter(myadapter);

        Button btn2 = (Button) findViewById(R.id.btn_signup);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyField((EditText) findViewById(R.id.editText7))) { //Reg No.
                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                } else if (isEmptyField((EditText) findViewById(R.id.editText8))) { //Password
                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                } else if (isEmptyField((EditText) findViewById(R.id.editText))) { //Phone
                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                } else if (isEmptyField((EditText) findViewById(R.id.editText5))) { //Name
                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                } else {
                    if (isSpin(myspin).equals("Select Department")) {
                        Toast.makeText(getApplicationContext(), "Select Your Department.", Toast.LENGTH_SHORT).show();
                    } else if (isEmptyFieldph((EditText) findViewById(R.id.editText))) { //Phone
                        Toast.makeText(getApplicationContext(), "Invalid Phone Number!", Toast.LENGTH_SHORT).show();
                    } else if (isEmptyFieldpass((EditText) findViewById(R.id.editText8))) { //Password
                        Toast.makeText(getApplicationContext(), "Password atleast 8 char long", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Hooray!\nRegistration Succcessful!!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), Login.class));
                    }
                }
            }
        });

    }

    String isSpin(Spinner spinner) {
        String Name = spinner.getSelectedItem().toString();
        return Name;
    }

    boolean isEmptyField(EditText editText) {
        return editText.getText().toString().length() <= 0;
    }

    boolean isEmptyFieldpass(EditText editText) {
        return editText.getText().toString().length() <= 7;
    }

    boolean isEmptyFieldph(EditText editText) {
        boolean flag = true;
        if (editText.getText().toString().length() == 10) {
            flag = false;
        }
        return flag;
    }
}
