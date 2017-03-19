package com.example.pablo.legitpay;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
        ImageView img1;
        ImageView img2;
        ImageView img3;
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
                break;
            case R.id.fake_butt:
                break;
            case R.id.show_butt:
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
        viewHolder.numF.setText(postData.getFakeNum());
        viewHolder.numL.setText(postData.getLegitNum());

        return convertView;
    }

}
