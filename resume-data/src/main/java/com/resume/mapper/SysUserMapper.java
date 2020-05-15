package com.resume.mapper;

import com.resume.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @ClassName SysUserMapper
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 15:45
 * @Version V1.0
 **/
@Mapper
public interface SysUserMapper {

    List<SysUserEntity> findAll();

    List<SysUserEntity> findUserByName(@Param("userName") String userName);

    void saveUser(SysUserEntity sysUserEntity);

    void updateUser(SysUserEntity sysUserEntity);

    void updatePassWord(@Param("id") String id, @Param("passWord") String passWord);

    void updateLastLoginTime(@Param("id") String id, @Param("lastLoginTime") Date lastLoginTime);

    void deleteUserById(@Param("id") String id);
}
