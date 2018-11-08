package com.example.akash.marksuploader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Uploader extends AppCompatActivity {

    private static final String TAG = "Uploader";

   /* private ArrayList<String> mroll_no = new ArrayList<>();
    private ArrayList<String> mname = new ArrayList<>();
    private ArrayList<String> mreg_no = new ArrayList<>();*/

    private List<Student> students;
    private String subCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploader);
        Log.d(TAG, "onCreate: started");

        //Retreive subCode and List of Students
        students = getIntent().getParcelableArrayListExtra("studentDetails");
        subCode = getIntent().getStringExtra("subCode");
        //Error Check
        if(students == null){
            Log.e("PutExtra Failure","Students not passed through intent");
        }



        //select();

        initRecyclerView();
        final String str = "Success";
        Button btn = (Button) findViewById(R.id.button1234);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("Success"))
                    Toast.makeText(Uploader.this,"Upload Success!",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Uploader.this,"Upload Failed.",Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recyclerid);
        //passing subcode to adapter since the view values are set in the adapter
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,students,subCode);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
