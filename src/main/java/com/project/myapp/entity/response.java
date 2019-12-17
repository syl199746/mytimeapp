package com.project.myapp.entity;

import java.util.Date;

public class response {
    private int userid;
    private int responseid;
    private String responsedetail;
    private Date responsetime;

    public response() {
    }

    public response(int userid, int responseid, String responsedetail, Date responsetime) {
        this.userid = userid;
        this.responseid = responseid;
        this.responsedetail = responsedetail;
        this.responsetime = responsetime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getResponseid() {
        return responseid;
    }

    public void setResponseid(int responseid) {
        this.responseid = responseid;
    }

    public String getResponsedetail() {
        return responsedetail;
    }

    public void setResponsedetail(String responsedetail) {
        this.responsedetail = responsedetail;
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }
}
