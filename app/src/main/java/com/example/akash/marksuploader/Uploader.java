package com.example.akash.marksuploader;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akash.marksuploader.Retrofit.ApiClient;
import com.example.akash.marksuploader.Retrofit.SIRequestApi;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Uploader extends AppCompatActivity {

    private static final String TAG = "Uploader";

    private List<Student> students;
    private List<Student> updatedStudents;
    private String subCode;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private int studentCount;
    private ResponseBody updated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_uploader);
        Log.d(TAG, "onCreate: started");
        updatedStudents = new ArrayList<Student>();
        //Retreive subCode and List of Students
        students = getIntent().getParcelableArrayListExtra("studentDetails");
        subCode = getIntent().getStringExtra("subCode");
        //Error Check
        if (students == null) {
            Log.e("PutExtra Failure", "Students not passed through intent");
        }

        //select();

        initRecyclerView();
        final String str = "Success";
        Button btn = (Button) findViewById(R.id.button1234);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentCount = adapter.getItemCount();
                for (int i = 0; i < studentCount; i++) {
                    getStudents(i);
                }


                if (str.equals("Success"))
                    Toast.makeText(Uploader.this, "Upload Success!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Uploader.this, "Upload Failed.", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void getStudents(int i) {
        View view = recyclerView.getLayoutManager().findViewByPosition(i);
        EditText marksView = view.findViewById(R.id.editText167);
        //The student is the same as that was passed to this activity
        Student student = students.get(i);
        //Only update the subject specific marks
        if (subCode.equals("stochastic"))
            student.Stochastic_Processes = marksView.getText().toString();
        else if (subCode.equals("se"))
            student.Software_Engineering = marksView.getText().toString();
        else if (subCode.equals("os"))
            student.Operating_Systems = marksView.getText().toString();
        else if (subCode.equals("ds"))
            student.Discrete_Structures = marksView.getText().toString();
        else if (subCode.equals("java"))
            student.Advanced_Java = marksView.getText().toString();
        else if (subCode.equals("dcn"))
            student.Data_Communications = marksView.getText().toString();

        Log.e("Subject---->", student.Stochastic_Processes);
        //Return Updated Data

        SIRequestApi apiService = ApiClient.getClient().create(SIRequestApi.class);
        Call<ResponseBody> call = apiService.updateStudentDetails(student.regdNo, student);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Log.e("Successful", "Received Student " + response.body());
                    updated = response.body();
                } else {
                    updated = response.errorBody();
                    Log.e("Failure", updated.toString());
                    // Snackbar.make(signInLayout,"cant receive student",Snackbar.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                updated = null;
                //Snackbar.make(signInLayout,"network error",Snackbar.LENGTH_LONG).show();
                Log.e("Network Failure", t.getMessage());
            }
        });

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        recyclerView = findViewById(R.id.recyclerid);
        //passing subcode to adapter since the view values are set in the adapter
        adapter = new RecyclerViewAdapter(this, students, subCode);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
