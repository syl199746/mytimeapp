package com.project.myapp.entity;

import java.util.Date;

public class comment {
    private int userid;
    private int commentid;


    private String commentdetail;
    private int like;
    private Date commenttime;
    public comment() {
        like=0;
    }
    public comment(int userid, int commentid, String commentdetail, int like, Date commenttime) {
        this.userid = userid;
        this.commentid = commentid;
        this.commentdetail = commentdetail;
        this.like = like;
        this.commenttime = commenttime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public String getCommentdetail() {
        return commentdetail;
    }

    public void setCommentdetail(String commentdetail) {
        this.commentdetail = commentdetail;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}
