package com.example.akash.marksuploader.Retrofit;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.util.Log;

import com.example.akash.marksuploader.Student;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetStudents {

    private Student student;
    private ConstraintLayout signInLayout;

    public GetStudents(){

    }

    public Student getStudent(String regdNo, String password) {
        SIRequestApi apiService = ApiClient.getClient().create(SIRequestApi.class);
        Call<Student> call = apiService.getStudent("json",regdNo,password);
        call.enqueue(new Callback<Student>() {
            @Override
            public void onResponse(Call<Student> call, Response<Student> response) {
                if(response.isSuccessful()){
                    Log.d("Successful","Received Student "+response.body());
                    student = response.body();
                }
                else{
                    student = null;
                    Log.d("Failure","did not receive student");
                   // Snackbar.make(signInLayout,"cant receive student",Snackbar.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Student> call, Throwable t) {
                student = null;
                Snackbar.make(signInLayout,"network error",Snackbar.LENGTH_LONG).show();
                Log.e("Network Failure",t.getMessage());
            }
        });
        return student;
    }
}