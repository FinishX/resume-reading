package com.resume.service.resume;

import com.resume.entity.resume.ResumeEntity;

import java.util.List;

/**
 * @ClassName ResumeService
 * @Description
 * @Author yellow Machine
 * @Date2020/5/21 9:17
 * @Version V1.0
 **/
public interface ResumeService {

    List<ResumeEntity> findResume(String userId);

    ResumeEntity findOneResume(String resumeId);
}
