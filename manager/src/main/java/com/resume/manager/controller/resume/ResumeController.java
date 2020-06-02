package com.resume.manager.controller.resume;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.resume.common.util.ResultData;
import com.resume.entity.SysUserEntity;
import com.resume.entity.resume.ResumeEntity;
import com.resume.service.resume.ResumeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @ClassName ResumeController
 * @Description
 * @Author yellow Machine
 * @Date2020/5/21 9:23
 * @Version V1.0
 **/
@RequestMapping("resume")
@RestController
public class ResumeController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private ResumeService resumeService;

    @GetMapping("findResume")
    public ResultData findResume(HttpServletRequest request){
        String sessionId = request.getSession().getId();
        SysUserEntity sysUserEntity = JSON.parseObject(redisTemplate.opsForValue().get("userEntity--"+sessionId), new TypeReference<SysUserEntity>() {});
        if(sysUserEntity!=null){
            List<ResumeEntity> list = resumeService.findResume(sysUserEntity.getId().toString());
            Map<String,Object> map = new HashMap<>();
            map.put("list",list);
            map.put("total",list.size());
            return  ResultData.successData(map);
        }
        return ResultData.waringData("登录超时");
    }

    @GetMapping("findOneResume/{id}")
    public ResultData findOneResume(HttpServletRequest request,@PathVariable("id") String id){
        String sessionId = request.getSession().getId();
        SysUserEntity sysUserEntity = JSON.parseObject(redisTemplate.opsForValue().get("userEntity--"+sessionId), new TypeReference<SysUserEntity>() {});
        if(sysUserEntity!=null){
            ResumeEntity resumeEntity = resumeService.findOneResume(id);
            Map<String,Object> map = new HashMap<>();
//            map.put("list",list);
//            map.put("total",list.size());
            return  ResultData.successData(resumeEntity);
        }
        return ResultData.waringData("登录超时");
    }




    @PostMapping("createResume")
    public ResultData createResume(@RequestBody JSONObject json){

        return ResultData.successData(null);
    }

    @PostMapping("updateResume/{id}")
    public ResultData updateResume(@PathVariable("id") String id, @RequestBody JSONObject json){
        return ResultData.successData(null);
    }

}
