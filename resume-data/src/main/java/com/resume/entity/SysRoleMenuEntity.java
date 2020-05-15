package com.resume.entity;

import java.io.Serializable;

/**
 * @ClassName SysRoleMenuEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/14 14:47
 * @Version V1.0
 **/
public class SysRoleMenuEntity implements Serializable {

    private Integer id;
    private Integer roleId;
    private Integer menuId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
