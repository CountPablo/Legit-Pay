package com.example.pablo.legitpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowroomActivity extends AppCompatActivity {

    ArrayList<PostData> postDatas;
    ListView listView;
    private static ShowroomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom);

        listView = (ListView) findViewById(R.id.itemList);
        postDatas = new ArrayList<PostData>();

        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        postDatas.add(new PostData("Glitterboots", "2 seconds ago", "Milan", "1", "2", "3", "PLATINUM", 25, 10));
        adapter = new ShowroomAdapter(postDatas, this);
        listView.setAdapter(adapter);
    }

    public void openPost(View view) {
        Intent intent = new Intent(this, profileScreen.class);
        startActivity(intent);

        }



    }
