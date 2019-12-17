package com.project.myapp.entity;

public class userdetail {
    private int userid;
    private String username;
    private String password;
    private String userintroduction;
    private String phonenum;
    private String userpic;
    private int userstate;
    public userdetail() {
    }

    public userdetail(int userid, String username, String password, String userintroduction, String phonenum, String userpic) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userintroduction = userintroduction;
        this.phonenum = phonenum;
        this.userpic = userpic;
    }

    public userdetail(String username, String password, String userintroduction, String phonenum, String userpic) {
        this.username = username;
        this.password = password;
        this.userintroduction = userintroduction;
        this.phonenum = phonenum;
        this.userpic = userpic;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserintroduction() {
        return userintroduction;
    }

    public void setUserintroduction(String userintroduction) {
        this.userintroduction = userintroduction;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public int getUserstate() {
        return userstate;
    }

    public void setUserstate(int userstate) {
        this.userstate = userstate;
    }
}
