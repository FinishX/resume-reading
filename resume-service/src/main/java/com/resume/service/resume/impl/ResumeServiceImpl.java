package com.resume.service.resume.impl;

import com.resume.entity.resume.ResumeEntity;
import com.resume.mapper.resume.ResumeMapper;
import com.resume.service.resume.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ResumeServiceImpl
 * @Description
 * @Author yellow Machine
 * @Date2020/5/21 9:17
 * @Version V1.0
 **/
@Service
@Repository
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;
    @Override
    public List<ResumeEntity> findResume(String userId) {
        return resumeMapper.findResume(userId);
    }

    @Override
    public ResumeEntity findOneResume(String resumeId) {
        return resumeMapper.findOneResume(resumeId);
    }
}
