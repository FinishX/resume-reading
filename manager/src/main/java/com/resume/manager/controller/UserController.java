package com.resume.manager.controller;


import com.alibaba.fastjson.JSONObject;
import com.resume.entity.SysUserEntity;
import com.resume.mapper.SysUserMapper;
import com.resume.service.SysUserService;
import com.resume.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName UserController
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 15:38
 * @Version V1.0
 **/
@RestController
@RequestMapping("user")
public class UserController {

//
    @Autowired(required = false)
    private SysUserService sysUserService;

    @Autowired(required = false)
    private SysUserMapper sysUserMapper;

    @RequestMapping("findAll")
    public Object findAll(){
        return sysUserService.findAll();
    }
    @GetMapping("findByUserName")
    public Object findByUserName(String UserName){
        return sysUserService.findUserByName(UserName);
    }

    @PostMapping("saveUser")
    public Object saveUser(@RequestBody JSONObject json){
        if(json.getString("userName")!=null){
            List<SysUserEntity> userList = sysUserService.findUserByName(json.getString("userName"));
            if(userList.size()>0){
                return "存在同名账户";
            }
            if(json.getString("passWord")!=null){
                SysUserEntity sysUserEntity = new SysUserEntity();
                sysUserEntity.setUserName(json.getString("userName"));
                sysUserEntity.setPassWord(json.getString("passWord"));
                sysUserEntity.setRealName(json.getString("realName"));
                sysUserEntity.setPhone(json.getString("phone"));
                sysUserEntity.setEmail(json.getString("email"));
                sysUserEntity.setAddress(json.getString("address"));
                sysUserEntity.setCreatedAt(new Date());
                sysUserService.saveUser(sysUserEntity);
            }
            return "未传入密码";

        }
        return "未传入账号";
    }

    @PostMapping("updateUser")
    public void updateUser(@RequestBody JSONObject json){
//        sysUserService.updateUser(sysUserEntity);
    }

    @PostMapping("updatePassWord")
    public void updatePassWord(@RequestBody JSONObject json){
        sysUserService.updatePassWord(json.getString("id"),json.getString("passWord"));
    }

    @PostMapping("deleteUserById")
    public void deleteUserById(@RequestBody JSONObject json){
        sysUserService.deleteUserById(json.getString("id"));
    }
}
