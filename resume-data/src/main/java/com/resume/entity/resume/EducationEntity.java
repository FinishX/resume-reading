package com.resume.entity.resume;

import com.resume.base.BaseEntity;

import java.util.Date;

/**
 * @ClassName EducationEntity
 * @Description 教育信息
 * @Author yellow Machine
 * @Date2020/5/20 16:20
 * @Version V1.0
 **/
public class EducationEntity extends BaseEntity {

    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //教育机构名称
    private String educationalServicesName;
    //学历等级（一本，二本，三本，大专，高中，博士）
    private String educationLevel;

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



    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationalServicesName() {
        return educationalServicesName;
    }

    public void setEducationalServicesName(String educationalServicesName) {
        this.educationalServicesName = educationalServicesName;
    }
}
