package com.project.myapp.mapper;
import com.project.myapp.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@Repository
public class userMapper {
      @Autowired
      private NamedParameterJdbcTemplate jdbcTemplate;
      public int addUser(user myuser){
          String sql="insert into user(userid,logintime,location,device,logintype)"+"values(:userid,:logintime,:location,:device,:logintype)";
          Map<String,Object> param=new HashMap<>();
          param.put("userid",myuser.getUserid());
          param.put("logintime",myuser.getLogintime());
          param.put("location",myuser.getLocation());
          param.put("device",myuser.getDevice());
          param.put("logintype",myuser.getLogintype());
          return jdbcTemplate.update(sql,param);
      }
      public int deleteUser(user myuser){
          String sql="delete from user where userid = :userid and logintime = :logintime ";
          Map<String,Object> param=new HashMap<>();
          param.put("userid",myuser.getUserid());
          param.put("logintime",myuser.getLogintime());
          return  jdbcTemplate.update(sql,param);
      }
    public int deleteUserbyuserid(int userid){
        String sql="delete from user where userid = :userid";
        Map<String,Object> param=new HashMap<>();
        param.put("userid",userid);
        return  jdbcTemplate.update(sql,param);
    }
      public ArrayList<user> getUser(int userid){
          String sql="select * from user where userid = :userid ";
          Map<String,Object> param=new HashMap<>();
          param.put("userid",userid);
          RowMapper<user> rowMapper=new BeanPropertyRowMapper<> (user.class);
          return (ArrayList<user>)jdbcTemplate.query(sql,param,rowMapper);
      }
      public int updateUser(user myuser){
          String sql = "update user set location = :location ,device=: device ,logintype=:logintype where userid = :userid and logintime=:logintime";
          Map<String,Object> param=new HashMap<>();
          param.put("userid",myuser.getUserid());
          param.put("logintime",myuser.getLogintime());
          param.put("location",myuser.getLocation());
          param.put("device",myuser.getDevice());
          param.put("logintype",myuser.getLogintype());
          return jdbcTemplate.update(sql,param);
      }

}
