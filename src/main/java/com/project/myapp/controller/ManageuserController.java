package com.project.myapp.controller;

import com.project.myapp.entity.userdetail;
import com.project.myapp.modle.BaseModle;
import com.project.myapp.service.userManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageuserController {
    @Autowired
    private userManageService myService;
    @RequestMapping("/updateuser")
    public BaseModle updateuser(@RequestBody userdetail myuser){
        BaseModle baseModle=new BaseModle();
        if (myService.Alteruser(myuser)){
            baseModle.msg="更新成功";
            baseModle.code=1;
            return baseModle;
        }
        baseModle.msg="更新失败";
        return baseModle;
    }
}
