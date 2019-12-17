package com.project.myapp.entity;

public class commentresponse {
    private int responseid;
    private String key;
    private int value;
    public commentresponse() {
    }

    public commentresponse(int responseid, String key, int value) {
        this.responseid = responseid;
        this.key = key;
        this.value = value;
    }

    public int getResponseid() {
        return responseid;
    }

    public void setResponseid(int responseid) {
        this.responseid = responseid;
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
