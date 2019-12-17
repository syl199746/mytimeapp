package com.project.myapp.controller;

import com.project.myapp.entity.userattention;
import com.project.myapp.modle.BaseModle;
import com.project.myapp.modle.CollectionModle;
import com.project.myapp.modle.UserModle;
import com.project.myapp.service.collectionService;
import com.project.myapp.service.loginSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class collectionController {
    @Autowired
    private collectionService myService;
    @Autowired
    private loginSignService youService;
    @RequestMapping("/addcollection")
    public UserModle addcollection(@RequestBody userattention myuser){
         UserModle userModle=new UserModle();
         if(youService.getit(myuser.getMyvalue())==null){
             userModle.data=null;
             userModle.msg="关注失败";
             userModle.code=0;
             return userModle;
         }
         if(myService.addattention(myuser)){
             userModle.data=null;
             userModle.msg="关注成功";
             userModle.code=1;
             return userModle;
         }
        userModle.data=null;
        userModle.msg="操作失败";
        userModle.code=2;
        return userModle;
    }
    @RequestMapping("/deletecollection")
    public BaseModle deletecollection(@RequestBody userattention myuser){
        BaseModle baseModle=new BaseModle();
        if(myService.deleteattention(myuser)){
            baseModle.msg="取消关注成功";
            baseModle.code=1;
            return baseModle;
        }
        baseModle.msg="操作失败";
        baseModle.code=2;
        return baseModle;
    }
    @RequestMapping("/showcollection")
    public CollectionModle showcollection(@RequestParam("userid")int userid, @RequestParam("mykey")String mykey){
        CollectionModle collectionModle=new CollectionModle();
        collectionModle.data=myService.getAttention(userid,mykey);
        collectionModle.msg="关注列表";
        collectionModle.code=1;
        return collectionModle;
    }
}
