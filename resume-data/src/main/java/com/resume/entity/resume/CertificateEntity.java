package com.resume.entity.resume;

import com.resume.base.BaseEntity;

import java.util.Date;

/**
 * @ClassName CertificateEntity
 * @Description 证书信息
 * @Author yellow Machine
 * @Date2020/5/20 16:31
 * @Version V1.0
 **/

public class CertificateEntity extends BaseEntity {
    //获得证书时间
    private Date certificateTime;
    //证书名称
    private String certificateName;
    //证书机构
    private String certificationBody;

    public Date getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Date certificateTime) {
        this.certificateTime = certificateTime;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificationBody() {
        return certificationBody;
    }

    public void setCertificationBody(String certificationBody) {
        this.certificationBody = certificationBody;
    }
}
