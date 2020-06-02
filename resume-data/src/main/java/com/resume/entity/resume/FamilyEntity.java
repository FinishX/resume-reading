package com.resume.entity.resume;

/**
 * @ClassName FamilyEntity
 * @Description 家庭信息
 * @Author yellow Machine
 * @Date2020/5/20 16:35
 * @Version V1.0
 **/
public class FamilyEntity {

    //关系
    private String relation;
    //姓名
    private String name;
    //电话
    private String phone;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
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
}
