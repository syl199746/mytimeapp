package com.project.myapp.util;

import com.project.myapp.entity.userdetail;

public class mysignup extends userdetail {
    private String device;
    private String location;

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
}
