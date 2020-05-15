package com.resume.mapper;

import com.resume.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SysUserMapper
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 15:45
 * @Version V1.0
 **/
@Mapper
public interface SysPowerMapper {

    List<SysUserEntity> findAll();

}
