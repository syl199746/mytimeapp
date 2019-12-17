package com.project.myapp.service;

import com.project.myapp.entity.userattention;
import com.project.myapp.mapper.userattentionMapper;
import com.project.myapp.mapper.userdetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class collectionService {
    @Autowired
    private userattentionMapper myattentionMapper;
    @Autowired
    private userdetailMapper mydetail;
    public boolean addattention(userattention myuser){
        return !(myattentionMapper.addUserattention(myuser)==0);
    }
    public boolean deleteattention(userattention myuser){
        return  !(myattentionMapper.deleteUserattention(myuser)==0);
    }
    public HashMap<Integer,String> getAttention(int userid , String key){
        ArrayList<userattention> mydata=myattentionMapper.getUserattention(userid,key);
        HashMap<Integer,String> hashMap=new HashMap<>();
        for(userattention mytest:mydata){
            hashMap.put(mytest.getMyvalue(),mydetail.getUsernamebyUserid(mytest.getMyvalue()).get(0).getUsername());
        }
        return hashMap;

    }
}
