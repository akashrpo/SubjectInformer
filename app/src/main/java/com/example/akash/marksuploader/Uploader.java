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

public class Uploader extends AppCompatActivity {

    private static final String TAG = "Uploader";

    private ArrayList<String> mroll_no = new ArrayList<>();
    private ArrayList<String> mname = new ArrayList<>();
    private ArrayList<String> mreg_no = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploader);
        Log.d(TAG, "onCreate: started");


        select();

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

    private void select() {
        Log.d(TAG, "initalizing the databases");
        //--------------------------------------
        //--------------Take Values From the databases and add in the list;

        //---Example---

        mroll_no.add("15");
        mname.add("Akash Gupta");
        mreg_no.add("201600037");

        mroll_no.add("09");
        mname.add("Devesh Pradhan");
        mreg_no.add("201600037");

        mroll_no.add("15");
        mname.add("Akash Gupta");
        mreg_no.add("201600037");

        mroll_no.add("09");
        mname.add("Devesh Pradhan");
        mreg_no.add("201600037");

        mroll_no.add("15");
        mname.add("Akash Gupta");
        mreg_no.add("201600037");

        mroll_no.add("09");
        mname.add("Devesh Pradhan");
        mreg_no.add("201600037");

        mroll_no.add("15");
        mname.add("Akash Gupta");
        mreg_no.add("201600037");

        mroll_no.add("09");
        mname.add("Devesh Pradhan");
        mreg_no.add("201600037");

        mroll_no.add("15");
        mname.add("Akash Gupta");
        mreg_no.add("201600037");

        mroll_no.add("09");
        mname.add("Devesh Pradhan");
        mreg_no.add("201600037");


        //------------------------------------
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        ;
        RecyclerView recyclerView = findViewById(R.id.recyclerid);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mroll_no, mname, mreg_no);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
