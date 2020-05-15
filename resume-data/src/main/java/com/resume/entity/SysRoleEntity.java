package com.resume.entity;

import com.resume.base.BaseEntity;

import java.io.Serializable;

/**
 * @ClassName SysRoleEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/14 14:36
 * @Version V1.0
 **/
public class SysRoleEntity extends BaseEntity implements Serializable {

    private String roleName;
    private String roleCode;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
