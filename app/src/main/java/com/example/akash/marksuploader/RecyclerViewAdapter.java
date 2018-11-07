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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mroll_no = new ArrayList<>();
    private ArrayList<String> mname = new ArrayList<>();
    private ArrayList<String> mreg_no = new ArrayList<>();
    private Context mcontext;


    public RecyclerViewAdapter(Context context, ArrayList<String> roll_no, ArrayList<String> name,
                               ArrayList<String> reg_no) {
        mcontext = context;
        mroll_no = roll_no;
        mname = name;
        mreg_no = reg_no;
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
        viewHolder.t1.setText(mroll_no.get(i));
        viewHolder.t2.setText(mname.get(i));
        viewHolder.t3.setText(mreg_no.get(i));

    }

    @Override
    public int getItemCount() {

        return mroll_no.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {         // Holds the views or data in the memory for displaying

        TextView t1, t2, t3;
        RelativeLayout parent_lay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.textView100);
            t2 = itemView.findViewById(R.id.textView101);
            t3 = itemView.findViewById(R.id.editText168);

        }
    }
}
