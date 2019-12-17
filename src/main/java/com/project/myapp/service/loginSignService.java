package com.project.myapp.service;


import com.project.myapp.entity.user;
import com.project.myapp.entity.userdetail;
import com.project.myapp.mapper.userMapper;
import com.project.myapp.mapper.userdetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class loginSignService {
    @Autowired
    private userMapper myuserMapper;
    @Autowired
    private userdetailMapper myuser;
    public ArrayList<userdetail> getUser(String username, String password){
        ArrayList<userdetail> test= myuser.getUserbypassword(username);
        if (test.isEmpty())
            return null;
        if (test.get(0).getPassword().equals(password))
            return test;
        return null;
    }
    public ArrayList<userdetail> getUser2(String phonenum,String password){
        ArrayList<userdetail> test= myuser.getUserbyphonenum(phonenum);
        if (test.isEmpty())
            return null;
        if (test.get(0).getPassword().equals(password))
            return test;
        return null;
    }
    public boolean adduser(user userneed){
        return !(myuserMapper.addUser(userneed)==0);
    }
    public boolean checkusername(String username,String phonenum){
        ArrayList<userdetail> mydata=myuser.getUserbypassword(username);
        ArrayList<userdetail> myneed=myuser.getUserbyphonenum(phonenum);
        if((!mydata.isEmpty())||(!myneed.isEmpty()))
            return true;
        return false;
    }
    public  boolean adduserdetail(userdetail need){
        return !(myuser.addUserdetail(need)==0);
    }
    public  boolean deleteuser(String username){
        return ((!(myuser.deleteUserdetail(myuser.getUserbypassword(username).get(0).getUserid())==0))&&(!(myuserMapper.deleteUserbyuserid(myuser.getUserbypassword(username).get(0).getUserid())==0)));
    }
    public  boolean exit(userdetail detail){
        return !(myuser.updateUserstate(detail,0)==0);
    }
    public  boolean fubi(userdetail detail){
        return !(myuser.updateUserstate(detail,2)==0);
    }
    public  boolean login(userdetail detail) {return !(myuser.updateUserstate(detail,1)==0);}
    public userdetail getit(int userid){
        return myuser.getUsernamebyUserid(userid).get(0);
    }
}
