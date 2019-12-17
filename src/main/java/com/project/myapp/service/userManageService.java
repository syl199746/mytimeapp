package com.project.myapp.service;

import com.project.myapp.entity.userdetail;
import com.project.myapp.mapper.userdetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userManageService {
    @Autowired
    private userdetailMapper myuser;
    public boolean Alteruser(userdetail user){
        return !(myuser.updateUserdetail(user)==0);
    }
}
