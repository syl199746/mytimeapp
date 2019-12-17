package com.project.myapp.entity;

public class publish {
    private int publishid;
    private int like;
    private  int collect;
    public publish() {
        like=0;
        collect=0;
    }

    public publish(int publishid) {
        this.publishid = publishid;
        like=0;
        collect=0;
    }

    public publish(int publishid, int like, int collect) {
        this.publishid = publishid;
        this.like = like;
        this.collect = collect;
    }

    public int getPublishid() {
        return publishid;
    }

    public void setPublishid(int publishid) {
        this.publishid = publishid;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }
}
