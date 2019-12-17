package com.project.myapp.entity;

public class newsdetail {
    private  int newsid;
    private  String newsdetail;
    private  String newswriter;

    public newsdetail() {
    }

    public newsdetail(int newsid, String newsdetail, String newswriter) {
        this.newsid = newsid;
        this.newsdetail = newsdetail;
        this.newswriter = newswriter;
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getNewsdetail() {
        return newsdetail;
    }

    public void setNewsdetail(String newsdetail) {
        this.newsdetail = newsdetail;
    }

    public String getNewswriter() {
        return newswriter;
    }

    public void setNewswriter(String newswriter) {
        this.newswriter = newswriter;
    }
}
