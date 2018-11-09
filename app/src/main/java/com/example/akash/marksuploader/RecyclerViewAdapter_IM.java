package com.example.akash.marksuploader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter_IM extends RecyclerView.Adapter<RecyclerViewAdapter_IM.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter_IM";

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
    private Context mcontext;


    public RecyclerViewAdapter_IM(Context context, ArrayList<String> sub_code, ArrayList<String> subjects,
                                  ArrayList<String> quiz_I, ArrayList<String> sess_I_50, ArrayList<String> sess_I_15,
                                  ArrayList<String> quiz_II, ArrayList<String> sess_II_50, ArrayList<String> sess_II_15,
                                  ArrayList<String> assign, ArrayList<String> attnd, ArrayList<String> total) {
        mcontext = context;
        msub_code = sub_code;
        msubjects = subjects;
        mquiz_I = quiz_I;
        msess_I_50 = sess_I_50;
        msess_I_15 = sess_I_15;
        mquiz_II = quiz_II;
        msess_II_50 = sess_II_50;
        msess_II_15 = sess_II_15;
        massign = assign;
        mattnd = attnd;
        mtotal = total;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_student_subjects, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: called");

//-----------------------------------------
        viewHolder.t1.setText(msub_code.get(i));
        viewHolder.t2.setText(msubjects.get(i));
        viewHolder.t3.setText(mquiz_I.get(i));
        viewHolder.t4.setText(msess_I_50.get(i));
        viewHolder.t5.setText(msess_I_15.get(i));
        viewHolder.t6.setText(mquiz_II.get(i));
        viewHolder.t7.setText(msess_II_50.get(i));
        viewHolder.t8.setText(msess_II_15.get(i));
        viewHolder.t9.setText(massign.get(i));
        viewHolder.t10.setText(mattnd.get(i));
        viewHolder.t11.setText(mtotal.get(i));

    }

    @Override
    public int getItemCount() {

        return mquiz_I.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {         // Holds the views or data in the memory for displaying

        TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
        RelativeLayout parent_lay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.subcode);
            t2 = itemView.findViewById(R.id.subject);
            t3 = itemView.findViewById(R.id.quiz1);
            t4 = itemView.findViewById(R.id.sess1_50);
            t5 = itemView.findViewById(R.id.sess1_15);
            t6 = itemView.findViewById(R.id.quiz2);
            t7 = itemView.findViewById(R.id.sess2_50);
            t8 = itemView.findViewById(R.id.sess2_15);
            t9 = itemView.findViewById(R.id.assignment);
            t10 = itemView.findViewById(R.id.attendance);
            t11 = itemView.findViewById(R.id.total);

        }
    }
}
