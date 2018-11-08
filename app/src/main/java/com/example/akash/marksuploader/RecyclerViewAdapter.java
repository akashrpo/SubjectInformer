package com.example.akash.marksuploader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private List<Student> students;
    private Context mcontext;
    private String subCode;


    public RecyclerViewAdapter(Context context, List<Student> students,String subCode) {
        mcontext = context;
        this.students = students;
        this.subCode = subCode;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layoutsss, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: called");

//-----------------------------------------
        viewHolder.t1.setText(students.get(i).rollNo);
        viewHolder.t2.setText(students.get(i).name);
        viewHolder.t3.setText(students.get(i).regdNo);
        //Set marks based on Subject Code
        if(subCode.equals("stochastic"))
            viewHolder.marks.setText(students.get(i).Stochastic_Processes);
        else if(subCode.equals("os"))
            viewHolder.marks.setText(students.get(i).Operating_Systems);
        else if(subCode.equals("se"))
            viewHolder.marks.setText(students.get(i).Software_Engineering);
        else if(subCode.equals("ds"))
            viewHolder.marks.setText(students.get(i).Discrete_Structures);
        else if(subCode.equals("java"))
            viewHolder.marks.setText(students.get(i).Advanced_Java);
        else if(subCode.equals("dcn"))
            viewHolder.marks.setText(students.get(i).Data_Communications);

    }

    @Override
    public int getItemCount() {

        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {         // Holds the views or data in the memory for displaying

        TextView t1, t2, t3;
        EditText marks;
        RelativeLayout parent_lay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.textView100);
            t2 = itemView.findViewById(R.id.textView101);
            t3 = itemView.findViewById(R.id.editText168);
            marks = itemView.findViewById(R.id.editText167);
        }
    }
}
