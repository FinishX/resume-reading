package com.resume.entity;

import com.resume.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysUserEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 15:30
 * @Version V1.0
 **/
public class SysUserEntity extends BaseEntity implements Serializable {

    private String userName;
    private String passWord;
    private String realName;
    private String address;
    private Date lastLoginTime;
    private String phone;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
