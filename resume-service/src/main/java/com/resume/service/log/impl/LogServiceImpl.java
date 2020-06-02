package com.resume.service.log.impl;

import com.resume.service.log.LogService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName LogServiceImpl
 * @Description
 * @Author yellow Machine
 * @Date2020/5/26 11:23
 * @Version V1.0
 **/
@Repository
@Service
public class LogServiceImpl implements LogService {
    @Override
    public void saveLog() {
        System.out.println("保存日志，日志吧");
    }
}
