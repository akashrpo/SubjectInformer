package com.example.akash.marksuploader.Retrofit;


import com.example.akash.marksuploader.Student;

import java.util.Calendar;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SIRequestApi {

    @GET("SubjectInformer/Login/")
    Call<Student> getStudent(@Query("format") String format, @Query("regdNo") String regdNo,
                             @Query("password") String password);


    @GET("SubjectInformer/MarksView/")
    Call<List<Student>> getStudentDetails(@Query("format") String format);

    @PUT("SubjectInformer/MarksUpdate/{id}/")
    Call<ResponseBody> updateStudentDetails(@Path("id") String regdNo, @Body Student student);

    @POST("SubjectInformer/Register/")
    Call<ResponseBody> registerStudent(@Body Student student);
}
