package com.project.myapp.entity;

import java.util.Date;

public class user {
      private int userid;
      private Date logintime;
      private String location;
      private String device;
      private int logintype;
      public user(int userid, Date logintime, String location, String device, int logintype) {
        this.userid = userid;
        this.logintime = logintime;
        this.location = location;
        this.device = device;
        this.logintype = logintype;
    }
    public user() {
    }
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public int getLogintype() {
        return logintype;
    }

    public void setLogintype(int logintype) {
        this.logintype = logintype;
    }
}
