package com.project.myapp.entity;

import java.util.Date;

public class publishdetail {
    private int publishid;
    private int userid;
    private int type;
    private String title;
    private String detail;
    private Date publishtime;

    public publishdetail() {
    }

    public publishdetail(int publishid, int userid, int type, String title, String detail, Date publishtime) {
        this.publishid = publishid;
        this.userid = userid;
        this.type = type;
        this.title = title;
        this.detail = detail;
        this.publishtime = publishtime;
    }
}
