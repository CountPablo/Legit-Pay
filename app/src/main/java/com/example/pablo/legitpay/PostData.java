package com.example.pablo.legitpay;

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


}
