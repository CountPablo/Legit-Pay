package com.example.pablo.legitpay;

import android.os.Bundle;

/**
 * Created by Milan on 3/19/2017.
 */

public class PostData {

    String prodDescrip;
    String prodTime;
    String poster;
    int ImgSource1;
    int ImgSource2;
    int ImgSource3;
    String Rank;
    int legitNum;
    int fakeNum;

    public PostData(String prodDescrip, String prodTime, String poster, int ImgSource1, int ImgSource2, int ImgSource3, String Rank, int legitNum, int fakeNum){
        this.prodDescrip = prodDescrip;
        this.prodTime = prodTime;
        this.poster = poster;
        this.ImgSource1 = ImgSource1;
        this.ImgSource2 = ImgSource2;
        this.ImgSource3 = ImgSource3;
        this.Rank = Rank;
        this.legitNum = legitNum;
        this.fakeNum = fakeNum;
    }

    public PostData(Bundle bundle){
        this.prodDescrip = bundle.getString("prodDescrip");
        this.prodTime =bundle.getString("prodTime");
        this.poster =bundle.getString("poster");
        this.Rank =bundle.getString("Rank");
        this.ImgSource1 = bundle.getInt("Img1");
        this.ImgSource2 =bundle.getInt("Img2");
        this.ImgSource3 =bundle.getInt("Img3");
        this.legitNum =bundle.getInt("legitNum");
        this.fakeNum =bundle.getInt("fakeNum");
    }

    public String getProdDescrip(){
        return this.prodDescrip;
    }

    public String getProdTime(){
        return this.prodTime;
    }

    public String getPoster(){
        return this.poster;
    }

    public int getImgSource1(){
        return this.ImgSource1;
    }

    public int getImgSource2(){
        return this.ImgSource2;
    }

    public int getImgSource3(){
        return this.ImgSource3;
    }

    public String getRank(){
        return this.Rank;
    }


    public int getLegitNum(){
        return this.legitNum;
    }

    public int getFakeNum(){
        return this.fakeNum;
    }

    public String getFakeNumAsStr(){
        return Integer.toString(this.fakeNum);
    }

    public String getLegitNumAsStr(){
        return Integer.toString(this.legitNum);
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("prodDescrip", prodDescrip);
        bundle.putString("prodTime", prodTime);
        bundle.putString("poster", poster);
        bundle.putString("Rank", Rank);
        bundle.putInt("Img1", ImgSource1);
        bundle.putInt("Img2", ImgSource1);
        bundle.putInt("Img3", ImgSource1);
        bundle.putInt("legitNum", legitNum);
        bundle.putInt("fakeNum", fakeNum);
        return bundle;
    }

}
