package com.example.pablo.legitpay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class profileScreen extends AppCompatActivity {

    String hello = LoginActivity.actualEmail;
    String hi = LoginActivity.actualPw;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        //in your OnCreate() method
        info  = (TextView)findViewById(R.id.info);
        info.setText(hello+"/n"+hi);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
    }




}
