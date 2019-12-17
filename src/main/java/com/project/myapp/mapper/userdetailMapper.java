package com.project.myapp.mapper;

import com.project.myapp.entity.user;
import com.project.myapp.entity.userdetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
@Repository
public class userdetailMapper {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    public int addUserdetail(userdetail user){
        String sql="insert into userdetail(username,password,userintroduction,phonenum,userpic)"+"values(:username,:password,:userintroduction,:phonenum,:userpic)";
        Map<String,Object> param=new HashMap<>();
        param.put("username",user.getUsername());
        param.put("password",user.getPassword());
        param.put("userintroduction",user.getUserintroduction());
        param.put("phonenum",user.getPhonenum());
        param.put("userpic",user.getUserpic());
        return jdbcTemplate.update(sql,param);
    }
    public int deleteUserdetail(int userid){
        String sql="delete from userdetail where userid = :userid";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",userid);
        return jdbcTemplate.update(sql,param);
    }
    public ArrayList<userdetail> getUserdetail(int userid){
        String sql="select * from userdetail where userid=:userid";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",userid);
        RowMapper<userdetail> rowMapper=new BeanPropertyRowMapper<> (userdetail.class);
        return (ArrayList<userdetail>)jdbcTemplate.query(sql,param,rowMapper);
    }
    public int updateUserdetail(userdetail user){
        String sql="update userdetail set username=:username,password=:password,userintroduction=:userintroduction,phonenum=:phonenum,userpic=:userpic where username=:username";
        Map<String,Object> param=new HashMap<>();
        param.put("username",user.getUsername());
        param.put("password",user.getPassword());
        param.put("userintroduction",user.getUserintroduction());
        param.put("phonenum",user.getPhonenum());
        param.put("userpic",user.getUserpic());
        return jdbcTemplate.update(sql,param);
    }
    public ArrayList<userdetail>  getUserbypassword(String username){
        String sql="select * from userdetail where username=:username";
        Map<String,Object> param=new HashMap<>();
        param.put("username",username);
        RowMapper<userdetail> rowMapper=new BeanPropertyRowMapper<> (userdetail.class);
        return (ArrayList<userdetail>) jdbcTemplate.query(sql,param,rowMapper);
    }
    public ArrayList<userdetail>  getUserbyphonenum(String phonenum){
        String sql="select * from userdetail where phonenum=:phonenum";
        Map<String,Object> param=new HashMap<>();
        param.put("phonenum",phonenum);
        RowMapper<userdetail> rowMapper=new BeanPropertyRowMapper<> (userdetail.class);
        return (ArrayList<userdetail>) jdbcTemplate.query(sql,param,rowMapper);
    }
    public int updateUserstate(userdetail user,int num){
        String sql="update userdetail set userstate=:num where username=:username";
        Map<String,Object> param=new HashMap<>();
        param.put("username",user.getUsername());
        param.put("num",num);
        return jdbcTemplate.update(sql,param);
    }
    public ArrayList<userdetail> getUsernamebyUserid(int userid){
        String sql="select * from userdetail where userid = :userid";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",userid);
        RowMapper<userdetail> rowMapper=new BeanPropertyRowMapper<> (userdetail.class);
        return (ArrayList<userdetail>)jdbcTemplate.query(sql,param,rowMapper);
    }
}
