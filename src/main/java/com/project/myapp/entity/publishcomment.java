package com.project.myapp.entity;

public class publishcomment {
    private int commentid;
    private String key;
    private int value;

    public publishcomment() {
    }

    public publishcomment(int commentid, String key, int value) {
        this.commentid = commentid;
        this.key = key;
        this.value = value;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
