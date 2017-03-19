package com.example.pablo.legitpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowroomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);
    }

    public void openPost(View view) {
        Intent intent = new Intent(this, profileScreen.class);
        startActivity(intent);
    }
}