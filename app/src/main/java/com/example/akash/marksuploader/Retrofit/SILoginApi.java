package com.example.akash.marksuploader.Retrofit;


import com.example.akash.marksuploader.Student;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SILoginApi {

    @GET("SubjectInformer/MarksView/")
    Call<Student> getStudent(@Query("format") String format, @Query("regdNo") String regdNo,
                             @Query("password") String password);
}
