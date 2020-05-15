package com.resume.entity;

import java.io.Serializable;

/**
 * @ClassName SysMenuBtnEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/14 14:48
 * @Version V1.0
 **/
public class SysMenuBtnEntity implements Serializable {

    private Integer id;
    private Integer menuId;
    private Integer btnId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getBtnId() {
        return btnId;
    }

    public void setBtnId(Integer btnId) {
        this.btnId = btnId;
    }
}
