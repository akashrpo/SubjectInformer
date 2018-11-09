package com.example.akash.marksuploader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Login extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn = (TextView) findViewById(R.id.login_singup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, singup.class));
            }
        });


        Button btn3 = (Button) findViewById(R.id.button007);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, teacher.class));
            }
        });

        final EditText ed2 = (EditText) findViewById(R.id.editText4);
        final EditText ed3 = (EditText) findViewById(R.id.editText2);

        Button btn2 = (Button) findViewById(R.id.button_l);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyField((EditText) findViewById(R.id.editText4))) {
//                    Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                    ed2.setError("Invalid Credentials!");

                }
                else if(isEmptyField((EditText) findViewById(R.id.editText2))) {
//                    Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                    ed3.setError("Invalid Credentials!");

                } else {
                    startActivity(new Intent(getApplicationContext(), InternalMarks.class));
                }
            }
        });

    }

    boolean isEmptyField(EditText editText) {
        return editText.getText().toString().length() <= 0;
    }
}