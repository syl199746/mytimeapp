package com.project.myapp.entity;

import java.util.Date;

public class news {
    private int newsid;
    private String newstitle;
    private String newspic;
    private Date newstime;
    private int newsread;
    private String newsfrom;

    public news() {
        newsread=0;
    }

    public news(int newsid, String newstitle, String newspic, Date newstime, int newsread, String newsfrom) {
        this.newsid = newsid;
        this.newstitle = newstitle;
        this.newspic = newspic;
        this.newstime = newstime;
        this.newsread = newsread;
        this.newsfrom = newsfrom;
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewspic() {
        return newspic;
    }

    public void setNewspic(String newspic) {
        this.newspic = newspic;
    }

    public Date getNewstime() {
        return newstime;
    }

    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }

    public int getNewsread() {
        return newsread;
    }

    public void setNewsread(int newsread) {
        this.newsread = newsread;
    }

    public String getNewsfrom() {
        return newsfrom;
    }

    public void setNewsfrom(String newsfrom) {
        this.newsfrom = newsfrom;
    }
}
