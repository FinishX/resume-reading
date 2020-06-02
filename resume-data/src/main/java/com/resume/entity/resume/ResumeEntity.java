package com.resume.entity.resume;

import com.resume.base.BaseEntity;
import org.springframework.data.annotation.Transient;

import java.util.List;


/**
 * @ClassName ResumeEntity
 * @Description 简历表
 * @Author yellow Machine
 * @Date2020/5/20 16:13
 * @Version V1.0
 **/
public class ResumeEntity extends BaseEntity {

    private String resumeName;
    private String name;
    private String phone;
    private String sex;
    private String birthday;
    private String address;
    //政治面貌
    private String political;
    //婚姻状况
    private String marital;
    //身体状况
    private String health;
    //兴趣爱好
    private String hobby;
    //性格
    private String characters;
    //照片
    private String picture;
    //教育历史
    @Transient
    private List<EducationEntity> educations;
    //工作历史
    @Transient
    private List<WorkEntity> works;
    //证书
    @Transient
    private List<CertificateEntity> certificates;
    //技能
    @Transient
    private List<SkillEntity> skills;
    //个人自评
    private String selfEvaluation;
    //其他信息
    private String other;
    //家庭联系人
    private List<FamilyEntity> familys;

    private Integer belong;
    //头像地址
    private String pic;


    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<EducationEntity> getEducations() {
        return educations;
    }

    public void setEducations(List<EducationEntity> educations) {
        this.educations = educations;
    }

    public List<WorkEntity> getWorks() {
        return works;
    }

    public void setWorks(List<WorkEntity> works) {
        this.works = works;
    }

    public List<CertificateEntity> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificateEntity> certificates) {
        this.certificates = certificates;
    }

    public List<SkillEntity> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillEntity> skills) {
        this.skills = skills;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        other = other;
    }

    public List<FamilyEntity> getFamilys() {
        return familys;
    }

    public void setFamilys(List<FamilyEntity> familys) {
        this.familys = familys;
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
