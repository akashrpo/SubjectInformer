package com.example.akash.marksuploader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;

public class student extends AppCompatActivity {

    private Student thisStudent;
    private TextView studentName;
    private TextView StochasticProcessView;
    private TextView DataCommunicationView;
    private TextView OperatingSystemsView;
    private TextView SoftwareEngineeringView;
    private TextView DiscreteStructuresView;
    private TextView AdvancedJavaView;
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        //Text View References
        thisStudent = getIntent().getParcelableExtra("studentParcel");
        studentName = findViewById(R.id.textView3);
        StochasticProcessView = findViewById(R.id.textView6);
        DataCommunicationView = findViewById(R.id.textView10);
        OperatingSystemsView = findViewById(R.id.textView7);
        SoftwareEngineeringView = findViewById(R.id.textView8);
        DiscreteStructuresView = findViewById(R.id.textView9);
        AdvancedJavaView = findViewById(R.id.textView11);
        //Set Text Methods
        studentName.setText(thisStudent.name+"("+thisStudent.regdNo+")");
        StochasticProcessView.setText(thisStudent.Stochastic_Processes);
        DataCommunicationView.setText(thisStudent.Data_Communications);
        OperatingSystemsView.setText(thisStudent.Operating_Systems);
        SoftwareEngineeringView.setText(thisStudent.Software_Engineering);
        DiscreteStructuresView.setText(thisStudent.Discrete_Structures);
        AdvancedJavaView.setText(thisStudent.Advanced_Java);
        String user=thisStudent.name;
        setTitle("Hello, "+user+"!");
    }
}
