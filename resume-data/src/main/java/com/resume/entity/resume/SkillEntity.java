package com.resume.entity.resume;

/**
 * @ClassName SkillEntity
 * @Description 技能
 * @Author yellow Machine
 * @Date2020/5/20 16:34
 * @Version V1.0
 **/
public class SkillEntity {
    //技能名称
    private String skillName;
    //技能熟练度
    private String skillLevel;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}
