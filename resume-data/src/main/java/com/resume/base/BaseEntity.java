package com.resume.base;

import java.util.Date;

/**
 * @ClassName BaseEntity
 * @Description
 * @Author yellow Machine
 * @Date2020/5/13 15:32
 * @Version V1.0
 **/
public class BaseEntity {

    private Integer id;
    private Date createdAt;
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
