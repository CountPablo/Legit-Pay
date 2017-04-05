package com.example.pablo.legitpay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PostViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postview);

        Bundle bundle = getIntent().getExtras();
        PostData data = new PostData(bundle);
    }
}
