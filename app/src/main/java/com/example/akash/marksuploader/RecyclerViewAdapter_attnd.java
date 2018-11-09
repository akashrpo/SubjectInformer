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

public class RecyclerViewAdapter_attnd extends RecyclerView.Adapter<RecyclerViewAdapter_attnd.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mconducted = new ArrayList<>();
    private ArrayList<String> mattended = new ArrayList<>();
    private ArrayList<String> mpercentage = new ArrayList<>();
    private Context mcontext;


    public RecyclerViewAdapter_attnd(Context context, ArrayList<String> conducted, ArrayList<String> attended,
                                     ArrayList<String> percentage) {
        mcontext = context;
        mconducted = conducted;
        mattended = attended;
        mpercentage = percentage;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_attend, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: called");

//-----------------------------------------
        viewHolder.t1.setText(mconducted.get(i));
        viewHolder.t2.setText(mattended.get(i));
        viewHolder.t3.setText(mpercentage.get(i));

    }

    @Override
    public int getItemCount() {

        return mconducted.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {         // Holds the views or data in the memory for displaying

        TextView t1, t2, t3;
        RelativeLayout parent_lay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            t1 = itemView.findViewById(R.id.CLC);
            t2 = itemView.findViewById(R.id.CLP);
            t3 = itemView.findViewById(R.id.PER);

        }
    }
}
