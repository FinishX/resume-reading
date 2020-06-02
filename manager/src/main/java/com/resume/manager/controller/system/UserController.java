package com.resume.manager.controller.system;


import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSONObject;
import com.resume.common.util.ResultData;
import com.resume.entity.SysUserEntity;
import com.resume.mapper.SysUserMapper;
import com.resume.service.system.SysUserService;
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
    @ResponseBody
    public ResultData saveUser(@RequestBody JSONObject json){

        if(json.getString("userName")!=null){
            List<SysUserEntity> userList = sysUserService.findUserByName(json.getString("userName"));
            if(userList.size()>0){
                return ResultData.waringData("存在同名账户");
            }
            if(json.getString("passWord")!=null){
                SysUserEntity sysUserEntity = new SysUserEntity();
                sysUserEntity.setUserName(json.getString("userName"));
                sysUserEntity.setPassWord(SecureUtil.md5(json.getString("passWord")));
                sysUserEntity.setRealName(json.getString("realName"));
                sysUserEntity.setPhone(json.getString("phone"));
                sysUserEntity.setEmail(json.getString("email"));
                sysUserEntity.setAddress(json.getString("address"));
                sysUserEntity.setCreatedAt(new Date());
                sysUserService.saveUser(sysUserEntity);
                return ResultData.successData("保存成功");
            }
            return ResultData.waringData("未传入密码");

        }
        return ResultData.waringData("未传入账号");
    }

    @PostMapping("updateUser")
    public ResultData updateUser(@RequestBody JSONObject json){
        String id = json.getString("id");
        if(id!=null){
            SysUserEntity sysUserEntity = sysUserService.findUserById(id);
            if(sysUserEntity!=null){
                if(json.getString("realName")!=null){
                    sysUserEntity.setRealName(json.getString("realName"));
                }
                if(json.getString("phone")!=null){
                    sysUserEntity.setPhone(json.getString("phone"));
                }
                if(json.getString("email")!=null){
                    sysUserEntity.setEmail(json.getString("email"));
                }
                if(json.getString("address")!=null){
                    sysUserEntity.setAddress(json.getString("address"));
                }
                sysUserEntity.setUpdatedAt(new Date());
                sysUserService.updateUser(sysUserEntity);
            }
            return ResultData.waringData("未找到可以更新的数据");
        }
        return ResultData.waringData("请传入需要更新的数据id");
    }

    @PostMapping("updatePassWord")
    public ResultData updatePassWord(@RequestBody JSONObject json){
        if(json.getString("id")!=null){
            if(json.getString("passWord")!=null){
                sysUserService.updatePassWord(json.getString("id"),SecureUtil.md5(json.getString("passWord")));
            }
            return ResultData.waringData("请传入需要修改的密码");
        }
        return ResultData.waringData("请传入需要修改密码的数据id");

    }

    @PostMapping("deleteUserById")
    public ResultData deleteUserById(@RequestBody JSONObject json){
        if(json.getString("id")!=null){
            sysUserService.deleteUserById(json.getString("id"));
        }
        return ResultData.waringData("请传入需要删除的数据id");
    }
}
