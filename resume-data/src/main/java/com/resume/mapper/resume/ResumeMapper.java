package com.resume.mapper.resume;

import com.resume.entity.resume.ResumeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ResumeMapper
 * @Description
 * @Author yellow Machine
 * @Date2020/5/20 16:40
 * @Version V1.0
 **/
@Mapper
public interface ResumeMapper {

    List<ResumeEntity> findResume(@Param("userId") String userId);

    ResumeEntity findOneResume(@Param("resumeId")String resumeId);
}
