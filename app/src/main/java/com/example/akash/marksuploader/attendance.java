package com.example.akash.marksuploader;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;

import java.util.ArrayList;

public class attendance extends AppCompatActivity {
    private static final String TAG = "attendance";

    private ArrayList<String> mconducted = new ArrayList<>();
    private ArrayList<String> mattended = new ArrayList<>();
    private ArrayList<String> mpercentage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        setTitle("Attendance Record");

        select();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.att:
                    startActivity(new Intent(getApplicationContext(), attendance.class));
                    return true;
                case R.id.IM:
                    startActivity(new Intent(getApplicationContext(), InternalMarks.class));
                    return true;

            }
            return false;
        }
    };

    private void select() {
        Log.d(TAG, "initalizing the databases");
        //--------------------------------------
        //--------------Take Values From the databases and add in the list;

        //---Example---

        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");

        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");

        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");

        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");
        mconducted.add("50");
        mattended.add("50");
        mpercentage.add("100");


        //------------------------------------
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_attendance);
        RecyclerViewAdapter_attnd adapter = new RecyclerViewAdapter_attnd(this, mconducted, mattended, mpercentage);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
