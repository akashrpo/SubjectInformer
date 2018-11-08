package com.example.akash.marksuploader;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        final EditText ed2 = (EditText) findViewById(R.id.editTextx);

        Button btn = (Button) findViewById(R.id.buttonx);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isLimit(ed2)) {
                    ed2.setError("Max Limit 250 Characters!");
                } else {
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);

                    emailIntent.setData(Uri.parse("mailto:"));
                    emailIntent.setType("text/plain");
                    String[] recipients={"akashguptarpo@gmail.com","devesh.pradhan98@gmail.com"};
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback For \"Subject Informer\"");
                    emailIntent.putExtra(Intent.EXTRA_TEXT, ed2.getText().toString().trim());
                    emailIntent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(emailIntent, "Send Feedback"));
                }
            }
        });


    }
    boolean isLimit(EditText editText) {
        return editText.getText().toString().trim().length() > 250;
    }
}
