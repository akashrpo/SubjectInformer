package com.example.akash.marksuploader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ScrollView;

import java.util.ArrayList;

public class InternalMarks extends AppCompatActivity {


    private static final String TAG = "studentMarks";

    private ArrayList<String> msub_code = new ArrayList<>();
    private ArrayList<String> msubjects = new ArrayList<>();
    private ArrayList<String> mquiz_I = new ArrayList<>();
    private ArrayList<String> msess_I_50 = new ArrayList<>();
    private ArrayList<String> msess_I_15 = new ArrayList<>();
    private ArrayList<String> mquiz_II = new ArrayList<>();
    private ArrayList<String> msess_II_50 = new ArrayList<>();
    private ArrayList<String> msess_II_15 = new ArrayList<>();
    private ArrayList<String> massign = new ArrayList<>();
    private ArrayList<String> mattnd = new ArrayList<>();
    private ArrayList<String> mtotal = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_marks);

        ScrollView scvMain = (ScrollView) findViewById(R.id.scrollview_IM);
        scvMain.fullScroll(ScrollView.FOCUS_UP);
        scvMain.smoothScrollTo(0, 0);

        select();
    }

    private void select() {
        Log.d(TAG, "initalizing the databases");
        //--------------------------------------
        //--------------Take Values From the databases and add in the list;

        //---Example---

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");
        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");

        msub_code.add("MA1401");
        msubjects.add("ENGINEERING MATHEMATICS IV(T)");
        mquiz_I.add("4");
        msess_I_50.add("33");
        msess_I_15.add("9.9");
        mquiz_II.add("2");
        msess_II_50.add("40");
        msess_II_15.add("12");
        massign.add("5");
        mattnd.add("5");
        mtotal.add("40");


        //------------------------------------
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recyclerID_IM);
        RecyclerViewAdapter_IM adapter = new RecyclerViewAdapter_IM(this, msub_code, msubjects,
                mquiz_I, msess_I_50, msess_I_15, mquiz_II, msess_II_50, msess_II_15, massign, mattnd, mtotal);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
