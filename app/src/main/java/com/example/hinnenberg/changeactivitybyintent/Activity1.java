package com.example.hinnenberg.changeactivitybyintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void onClick1(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

}
