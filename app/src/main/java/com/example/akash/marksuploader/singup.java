package com.example.akash.marksuploader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akash.marksuploader.Retrofit.ApiClient;
import com.example.akash.marksuploader.Retrofit.SIRequestApi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class singup extends AppCompatActivity {

    private Student student;
    private ResponseBody updated;
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

        student = new Student();
        TextView btn = (TextView) findViewById(R.id.link_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(singup.this, Login.class));
            }
        });

        final Spinner myspin = (Spinner) findViewById(R.id.deptSpinner);


        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(singup.this,
                R.layout.layout_spinner_for_singup,
                getResources().getStringArray(R.array.department));

        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspin.setAdapter(myadapter);


        final EditText regdNoView = (EditText) findViewById(R.id.regdNo);  //reg no
        final EditText passwordView = (EditText) findViewById(R.id.password); //password
        final EditText nameView = (EditText) findViewById(R.id.nameInput); //name
        final EditText rollNoView = (EditText) findViewById(R.id.rollNo); //phone no

        Button btn2 = (Button) findViewById(R.id.btn_signup);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyField((EditText) findViewById(R.id.regdNo))) { //Reg No.
//                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                    regdNoView.setError("Field cannot be empty!");
                } else if (isEmptyField((EditText) findViewById(R.id.nameInput))) { //Name
//                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                    nameView.setError("Field cannot be empty!");

                } else if (isEmptyField((EditText) findViewById(R.id.rollNo))) { //Phone
//                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                    rollNoView.setError("Field cannot be empty!");
                } else if (isEmptyField((EditText) findViewById(R.id.password))) { //Password
//                    Toast.makeText(getApplicationContext(), "Fill all fields!!", Toast.LENGTH_SHORT).show();
                    passwordView.setError("Field cannot be empty!");

                } else {
                    if (isSpin(myspin).equals("Select Department")) {
                        ((TextView)myspin.getSelectedView()).setError("Select Your Department");
                    }  else if (isEmptyFieldpass((EditText) findViewById(R.id.password))) { //Password
                        passwordView.setError("Password atleast 8 char long");

                    } else {
                        student.regdNo = regdNoView.getText().toString();
                        student.password = passwordView.getText().toString();
                        student.name = nameView.getText().toString();
                        student.rollNo = rollNoView.getText().toString();
                        student.dept = myspin.getSelectedItem().toString();
                        registerStudent(student);
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

    boolean isEmptyField(EditText rollNo) {
        return rollNo.getText().toString().length() <= 0;
    }

    boolean isEmptyFieldpass(EditText rollNo) {
        return rollNo.getText().toString().length() <= 7;
    }

    boolean isEmptyFieldph(EditText rollNo) {
        boolean flag = true;
        if (rollNo.getText().toString().length() == 10) {
            flag = false;
        }
        return flag;
    }

    private void registerStudent(Student student){
        SIRequestApi apiService = ApiClient.getClient().create(SIRequestApi.class);
        Call<ResponseBody> call = apiService.registerStudent(student);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    Log.e("Successful","Uploaded Student "+response.body());
                    updated = response.body();
                }
                else{
                    updated = response.errorBody();
                    Log.e("Failure",updated.toString());
                    // Snackbar.make(signInLayout,"cant receive student",Snackbar.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                updated = null;
                //Snackbar.make(signInLayout,"network error",Snackbar.LENGTH_LONG).show();
                Log.e("Network Failure",t.getMessage());
            }
        });
    }
}
