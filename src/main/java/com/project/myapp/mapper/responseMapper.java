package com.project.myapp.mapper;

import com.project.myapp.entity.response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class responseMapper {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    public int addResponse(response res){
        String sql="insert into response(userid responseid,responsedetail,responsetime)"+"value(:userid,:responseid,:responsedetail,:responsetime)";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",res.getUserid());
        param.put("responseid",res.getResponseid());
        param.put("responsedetail",res.getResponsedetail());
        param.put("responsetime",res.getResponsetime());
        return  jdbcTemplate.update(sql,param);
    }
}
