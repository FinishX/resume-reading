package com.resume.manager.controller;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSONObject;
import com.resume.common.util.ResultData;
import com.resume.entity.SysUserEntity;
import com.resume.service.log.LogService;
import com.resume.service.system.SysUserService;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName LoginController
 * @Description
 * @Author yellow Machine
 * @Date2020/5/18 10:36
 * @Version V1.0
 **/
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private LogService logService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ResultData login(HttpServletRequest request,@RequestBody JSONObject json){
        logService.saveLog();
        String userName = json.getString("userName");
        String passWord = json.getString("passWord");
        if(userName!=null){
            if(passWord!=null){
                String sqlPassWord = SecureUtil.md5(passWord);
                List<SysUserEntity> userList = sysUserService.findUserByName(userName);
                if(userList.size()>1){

                    return ResultData.waringData("账号数量异常，请联系管理员");
                }else if(userList.size()==0){
                    return ResultData.waringData("未找到对应账户");
                }else{
                    SysUserEntity sysUserEntity = userList.get(0);
                    if(sqlPassWord.equals(sysUserEntity.getPassWord())){
                        stringRedisTemplate.opsForValue().set("userEntity--"+request.getSession().getId(),JSONObject.toJSONString(sysUserEntity),30, TimeUnit.MINUTES);
                        sysUserService.updateLastLoginTime(sysUserEntity.getId().toString(),new Date());
//                        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                        request.getSession().setAttribute("userName",userName);
                        return ResultData.successData(JSONObject.toJSONString(sysUserEntity));
                    }
                    return ResultData.waringData("密码错误");
                }
            }

            return ResultData.waringData("密码为空");
        }
        return ResultData.waringData("账户名为空");
//        return ResultData.successData("登录成功");
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public ResultData getAdminInfo(HttpServletRequest request) {
        String userName = String.valueOf(request.getSession().getAttribute("userName"));
        List<SysUserEntity> userList = sysUserService.findUserByName(userName);
        if(userList.size()>0){
            SysUserEntity sysUserEntity = userList.get(0);
            Map<String, Object> data = new HashMap<>();
            data.put("username", sysUserEntity.getUserName());
            data.put("roles", new String[]{"TEST"});
//        data.put("icon", umsAdmin.getIcon());
            return ResultData.successData(data);
        }else{
            return ResultData.successData(null);
        }

    }

    @PostMapping("logout")
    public ResultData logout(HttpServletRequest request){
        String sessionId = request.getSession().getId();
        stringRedisTemplate.delete("userEntity--"+sessionId);
        return ResultData.successData(null);
    }


}
