package com.example.akash.marksuploader;

import android.content.Intent;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.akash.marksuploader.Retrofit.ApiClient;
import com.example.akash.marksuploader.Retrofit.SIRequestApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeacherFrontPage extends AppCompatActivity {


    private List<Student> students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_front_page);
        String user = "Teachers";
        setTitle("Howdy, " + user + "!");
        Date date = new Date();
        Toast.makeText(TeacherFrontPage.this,"Welcome, "+user+"!\n"+date.toString(),Toast.LENGTH_LONG).show();
        //Array of student Objects to store list of student details
        students = new ArrayList<Student>();
        //Function to all Student Details from Server
        getStudentDetails();
        //Error Check
        if(students == null){
            Log.e("Null Value Returned","Student List is Null");
        }

        RelativeLayout stochastic = (RelativeLayout) findViewById(R.id.relativeLayout3);

        stochastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherFrontPage.this,Uploader.class);
                //passing a subject code to each activity to specify which subject to display
                intent.putExtra("subCode","stochastic");
                //passing the entire array of students as Patch/Put request needs to be completed from Uploader.class
                intent.putParcelableArrayListExtra("studentDetails",(ArrayList<? extends Parcelable>) students);
                startActivity(intent);
            }
        });

        RelativeLayout os = (RelativeLayout) findViewById(R.id.relativeLayout2);

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherFrontPage.this,Uploader.class);
                intent.putExtra("subCode","os");
                intent.putParcelableArrayListExtra("studentDetails",(ArrayList<? extends Parcelable>) students);
                startActivity(intent);            }
        });

        RelativeLayout se = (RelativeLayout) findViewById(R.id.relativeLayout4);

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherFrontPage.this,Uploader.class);
                intent.putExtra("subCode","se");
                intent.putParcelableArrayListExtra("studentDetails",(ArrayList<? extends Parcelable>) students);
                startActivity(intent);
            }
        });

        RelativeLayout ds = (RelativeLayout) findViewById(R.id.relativeLayout5);

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherFrontPage.this,Uploader.class);
                intent.putExtra("subCode","ds");
                intent.putParcelableArrayListExtra("studentDetails",(ArrayList<? extends Parcelable>) students);
                startActivity(intent);
            }
        });

        RelativeLayout dcn = (RelativeLayout) findViewById(R.id.relativeLayout6);

        dcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherFrontPage.this,Uploader.class);
                intent.putExtra("subCode","dcn");
                intent.putParcelableArrayListExtra("studentDetails",(ArrayList<? extends Parcelable>) students);
                startActivity(intent);
            }
        });

        RelativeLayout java = (RelativeLayout) findViewById(R.id.relativeLayout8);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherFrontPage.this,Uploader.class);
                intent.putExtra("subCode","java");
                intent.putParcelableArrayListExtra("studentDetails",(ArrayList<? extends Parcelable>) students);
                startActivity(intent);
            }
        });

    }

    private void getStudentDetails(){
            SIRequestApi apiService = ApiClient.getClient().create(SIRequestApi.class);
            Call<List<Student>> call = apiService.getStudentDetails("json");
            call.enqueue(new Callback<List<Student>>() {
                @Override
                public void onResponse(Call<List<Student>> call, Response<List<Student>> response) {
                    if(response.isSuccessful()){
                        Log.d("Successful","Received Students "+response.body());
                        students = response.body();
                    }
                    else{
                        students = null;
                        Log.d("Failure","did not receive students");
                        // Snackbar.make(signInLayout,"cant receive students",Snackbar.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<List<Student>> call, Throwable t) {
                    students = null;
                    //Snackbar.make(signInLayout,"network error",Snackbar.LENGTH_LONG).show();
                    Log.e("Network Failure",t.getMessage());
                }
            });
        }

    @Override
    protected void onResume() {
        super.onResume();
        getStudentDetails();
    }
}
