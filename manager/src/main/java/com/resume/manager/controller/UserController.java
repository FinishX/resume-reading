package com.resume.manager.controller;


import com.resume.mapper.SysUserMapper;
import com.resume.service.SysUserService;
import com.resume.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 15:38
 * @Version V1.0
 **/
@RestController
public class UserController {

//
    @Autowired(required = false)
    private SysUserService sysUserService;

    @Autowired(required = false)
    private SysUserMapper sysUserMapper;

    @RequestMapping("findAll")
    public Object findAll(){
        return sysUserService.findAllqq();
    }
}
