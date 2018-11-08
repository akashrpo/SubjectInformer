package com.example.akash.marksuploader.Retrofit;


import com.example.akash.marksuploader.Student;

import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SIRequestApi {

    @GET("SubjectInformer/Login/")
    Call<Student> getStudent(@Query("format") String format, @Query("regdNo") String regdNo,
                             @Query("password") String password);


    @GET("SubjectInformer/MarksView/")
    Call<List<Student>> getStudentDetails(@Query("format") String format);
}
