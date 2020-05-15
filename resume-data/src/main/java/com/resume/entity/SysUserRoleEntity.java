package com.resume.entity;

import java.io.Serializable;

/**
 * @ClassName SysUserRoleEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/14 14:46
 * @Version V1.0
 **/
public class SysUserRoleEntity implements Serializable {

    private Integer id;
    private Integer userId;
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
