package com.resume.entity;

import com.resume.base.BaseEntity;

import java.io.Serializable;

/**
 * @ClassName SysPermissionEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/14 14:38
 * @Version V1.0
 **/
public class SysMenuPowerEntity extends BaseEntity implements Serializable {

    private String menuName;
    private String menuUrl;
    private String menuLevel;
    private String parentMenuId;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }
}
