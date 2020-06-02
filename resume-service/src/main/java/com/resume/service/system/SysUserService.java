package com.resume.service.system;

import com.resume.entity.SysUserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName SysUserService
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 16:10
 * @Version V1.0
 **/
public interface SysUserService {

    List<SysUserEntity> findAll();

    List<SysUserEntity> findUserByName(String userName);

    List<SysUserEntity> findUser(String userName,String passWord);

    SysUserEntity findUserById(String id);

    void saveUser(SysUserEntity sysUserEntity);

    void updateUser(SysUserEntity sysUserEntity);

    void updatePassWord(String id, String passWord);

    void updateLastLoginTime(String id,  Date lastLoginTime);

    void deleteUserById(String id);

}
