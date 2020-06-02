package com.resume.entity.resume;

import com.resume.base.BaseEntity;

import java.util.Date;

/**
 * @ClassName WorkEntity
 * @Description 工作历史
 * @Author yellow Machine
 * @Date2020/5/20 16:25
 * @Version V1.0
 **/
public class WorkEntity  {
    private int id;
    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //公司名
    private String companyName;
    //联系人
    private String contactName;
    //联系方式
    private String contactPhone;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
