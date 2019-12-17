package com.project.myapp.mapper;

import com.project.myapp.entity.userattention;
import com.project.myapp.entity.userdetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class userattentionMapper {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    public int addUserattention(userattention user){
        String  sql="insert into userattention(userid,mykey,myvalue)"+"values(:userid,:mykey,:myvalue)";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",user.getUserid());
        param.put("mykey",user.getMykey());
        param.put("myvalue",user.getMyvalue());
        return  jdbcTemplate.update(sql,param);
    }
    public int deleteUserattention(userattention user){
        String sql="delete from userattention where userid=:userid and mykey=:mykey and myvalue=:myvalue";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",user.getUserid());
        param.put("mykey",user.getMykey());
        param.put("myvalue",user.getMyvalue());
        return jdbcTemplate.update(sql,param);
    }
    public ArrayList<userattention> getUserattention(int userid ,String key){
        String sql="select * from userattention where userid=:userid and mykey=:mykey";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",userid);
        param.put("mykey",key);
        RowMapper<userattention> rowMapper=new BeanPropertyRowMapper<> (userattention.class);
        return (ArrayList<userattention>)jdbcTemplate.query(sql,param,rowMapper);
    }
}
