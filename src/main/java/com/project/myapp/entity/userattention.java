package com.project.myapp.entity;

public class userattention {
    private  int userid;
    private  String mykey;
    private  int myvalue;

    public userattention() {
    }

    public userattention(int userid, String mykey, int myvalue) {
        this.userid = userid;
        this.mykey = mykey;
        this.myvalue = myvalue;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMykey() {
        return mykey;
    }

    public void setMykey(String mykey) {
        this.mykey = mykey;
    }

    public int getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(int myvalue) {
        this.myvalue = myvalue;
    }
}
