package com.project.myapp.util;

public class mysign {
    private String username;
    private String password;
    private String device;
    private String location;
    private int logintype;

    public mysign() {
    }

    public mysign(String username, String password, String device, String location, int logintype) {
        this.username = username;
        this.password = password;
        this.device = device;
        this.location = location;
        this.logintype = logintype;
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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLogintype() {
        return logintype;
    }

    public void setLogintype(int logintype) {
        this.logintype = logintype;
    }
}
