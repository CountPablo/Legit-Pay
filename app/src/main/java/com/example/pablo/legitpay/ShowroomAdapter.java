package com.example.pablo.legitpay;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Milan on 3/19/2017.
 */

public class ShowroomAdapter extends ArrayAdapter<PostData> implements View.OnClickListener {

    private ArrayList<PostData> dataSet;
    Context myContext;

    private static class ViewHolder {
        TextView prodD;
        TextView prodT;
        TextView postU;
        TextView postR;
        TextView numF;
        TextView numL;
        TextView showButt;
        ImageView img1;
        ImageView img2;
        ImageView img3;
        Button legitButt;
        Button fakeButt;
    }

    public ShowroomAdapter(ArrayList<PostData> data, Context context) {
        super(context, R.layout.showroom_item, data);
        this.dataSet = data;
        this.myContext = context;
    }



    @Override
    public void onClick(View v) {

        int position = (Integer) v.getTag();
        Object object = getItem(position);
        PostData postData = (PostData) object;

        switch (v.getId()) {
            case R.id.legit_butt:
                postData.legitNum+=1;
                View parentLegit = (View)v.getParent();
                TextView legitText = (TextView)parentLegit.findViewById(R.id.legit_num);
                legitText.setText(postData.getLegitNumAsStr());
                break;
            case R.id.fake_butt:
                postData.fakeNum+=1;
                View parentFake = (View)v.getParent();
                TextView fakeText = (TextView)parentFake.findViewById(R.id.fake_Num);
                fakeText.setText(postData.getFakeNumAsStr());
                break;
            case R.id.show_butt:
                Intent intent = new Intent(myContext,PostViewActivity.class);
                intent.putExtra("data",postData.getBundle());
                myContext.startActivity(intent);
                break;
            case R.id.image1:
                break;
            case R.id.image2:
                break;
            case R.id.image3:
                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PostData postData = getItem(position);

        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.showroom_item, parent, false);
            viewHolder.prodD = (TextView) convertView.findViewById(R.id.prod_description);
            viewHolder.prodT = (TextView) convertView.findViewById(R.id.prod_time);
            viewHolder.postU = (TextView) convertView.findViewById(R.id.prod_poster);
            viewHolder.postR = (TextView) convertView.findViewById(R.id.poster_rank);
            viewHolder.numF = (TextView) convertView.findViewById(R.id.fake_Num);
            viewHolder.numL = (TextView) convertView.findViewById(R.id.legit_num);

            viewHolder.img1 = (ImageView) convertView.findViewById(R.id.image1);
            viewHolder.img2 = (ImageView) convertView.findViewById(R.id.image2);
            viewHolder.img3 = (ImageView) convertView.findViewById(R.id.image3);

            viewHolder.fakeButt = (Button) convertView.findViewById(R.id.fake_butt);
            viewHolder.legitButt = (Button) convertView.findViewById(R.id.legit_butt);
            viewHolder.showButt = (TextView) convertView.findViewById(R.id.show_butt);

            result = convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        Animation animation = AnimationUtils.loadAnimation(myContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.prodD.setText(postData.getProdDescrip());
        viewHolder.prodT.setText(postData.getProdTime());
        viewHolder.postR.setText(postData.getRank());
        viewHolder.postU.setText(postData.getPoster());
        viewHolder.numF.setText(postData.getFakeNumAsStr());
        viewHolder.numL.setText(postData.getLegitNumAsStr());
        viewHolder.img1.setImageResource(postData.getImgSource1());
        viewHolder.img2.setImageResource(postData.getImgSource2());
        viewHolder.img3.setImageResource(postData.getImgSource3());

        viewHolder.fakeButt.setOnClickListener(this);
        viewHolder.fakeButt.setTag(position);
        viewHolder.legitButt.setOnClickListener(this);
        viewHolder.legitButt.setTag(position);
        viewHolder.showButt.setOnClickListener(this);
        viewHolder.showButt.setTag(position);

        return convertView;
    }

}
