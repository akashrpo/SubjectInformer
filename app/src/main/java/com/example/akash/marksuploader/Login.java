package com.example.akash.marksuploader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akash.marksuploader.Retrofit.GetStudents;


public class Login extends AppCompatActivity {

    EditText UserIdView;
    EditText PasswordView;
    GetStudents getStudents;
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
        UserIdView = findViewById(R.id.editText4);
        PasswordView = findViewById(R.id.editText2);
        //Initialization of GetStudents Class that fetches student data from the server
        getStudents = new GetStudents();
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

        Button btn2 = (Button) findViewById(R.id.button_l);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyField((EditText) findViewById(R.id.editText4))) {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                }
                else if(isEmptyField((EditText) findViewById(R.id.editText2))) {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                } else {
                    //Call to Retrofit class is done here
                    Student student = getStudents.getStudent(UserIdView.getText().toString(),PasswordView.getText().toString());
                    if(student != null) {
                        Intent intent = new Intent(Login.this, student.class);
                        intent.putExtra("studentParcel",student);
                        startActivity(intent);
                    }
                    else {
                        Log.d("User not received","not received");
                    }
                }
            }
        });

    }

    boolean isEmptyField(EditText editText) {
        return editText.getText().toString().length() <= 0;
    }
}