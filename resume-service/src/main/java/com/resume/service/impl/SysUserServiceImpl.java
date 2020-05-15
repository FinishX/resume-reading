package com.resume.service.impl;

import com.resume.entity.SysUserEntity;
import com.resume.mapper.SysUserMapper;
import com.resume.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysUserServiceImpl
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 16:12
 * @Version V1.0
 **/
@Service
@Repository
public class SysUserServiceImpl implements SysUserService {

    @Autowired(required = false)
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUserEntity> findAllqq() {
        return sysUserMapper.findAll();
    }

}
