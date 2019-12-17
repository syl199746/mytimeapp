package com.project.myapp.controller;


import com.project.myapp.entity.user;
import com.project.myapp.entity.userdetail;
import com.project.myapp.modle.UserModle;
import com.project.myapp.service.loginSignService;
import com.project.myapp.util.mysign;
import com.project.myapp.util.mysignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
public class LoginController {
    @Autowired
    private loginSignService myService;
    @RequestMapping("/mysign")
    public UserModle mySign (@RequestBody mysign youdata){
        UserModle userModle = new UserModle();
        ArrayList<userdetail> mydata=new ArrayList<>();
        if (youdata.getLogintype()==1) mydata=myService.getUser(youdata.getUsername(),youdata.getPassword());
        else if (youdata.getLogintype()==2) mydata=myService.getUser2(youdata.getUsername(),youdata.getPassword());
        if (mydata==null){
            userModle.data=null;
            userModle.msg="用户名或密码错误";
            return userModle;
        }
        if (mydata.get(0).getUserstate()==1){
            userModle.data=null;
            userModle.msg="该用户已登陆";
            return userModle;
        }
        if (mydata.get(0).getUserstate()==2){
            userModle.data=null;
            userModle.msg="该用户已被封号";
            userModle.code=4;
            return userModle;
        }
        Date day=new Date();
        user myneed=new user(mydata.get(0).getUserid(),day,youdata.getLocation(),youdata.getDevice(),youdata.getLogintype());
        if (myService.adduser(myneed)&&myService.login(mydata.get(0))) {
            userModle.code = 1;
            userModle.msg="成功登录";
            userModle.data=mydata.get(0);
            return userModle;
        }
        else {
            userModle.code=2;
            userModle.msg="请重试";
            userModle.data=null;
            return userModle;
        }
    }
    @RequestMapping("/mysignup")
    public  UserModle mysignup (@RequestBody mysignup youdata){
        UserModle userModle=new UserModle();
        if (myService.checkusername(youdata.getUsername(),youdata.getPhonenum())){
            userModle.msg="用户名手机号已被占用";
            userModle.data=null;
            userModle.code=2;
            return userModle;
        }
        userdetail detail=new userdetail(youdata.getUsername(),youdata.getPassword(),youdata.getUserintroduction(),youdata.getPhonenum(),youdata.getUserpic());
        if(myService.adduserdetail(detail)){
            userModle.msg="注册成功";
            userModle.code=1;
            userModle.data=myService.getUser(detail.getUsername(),detail.getPassword()).get(0);
            Date day=new Date();
            user myneed=new user(myService.getUser(detail.getUsername(),detail.getPassword()).get(0).getUserid(),day,youdata.getLocation(),youdata.getDevice(),1);
            myService.adduser(myneed);
            return userModle;
        }
            userModle.msg="注册失败";
            userModle.code=3;
            userModle.data=null;
            return userModle;
    }
    @RequestMapping("/mysignout")
    public UserModle mysignout(@RequestParam("userid")int  userid){
        UserModle userModle=new UserModle();
        if (myService.exit(myService.getit(userid))){
            userModle.data=null;
            userModle.msg="退出成功";
            userModle.code=1;
            return  userModle;
        }
        userModle.data=null;
        userModle.msg="请重试";
        userModle.code=2;
        return userModle;
    }
}
