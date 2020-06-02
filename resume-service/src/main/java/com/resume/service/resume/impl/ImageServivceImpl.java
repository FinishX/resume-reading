package com.resume.service.resume.impl;

import com.resume.common.util.OssCallbackResult;
import com.resume.service.resume.ImageService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @ClassName ImageServivceImpl
 * @Description
 * @Author yellow Machine
 * @Date2020/5/22 15:15
 * @Version V1.0
 **/
@Service
@Repository
public class ImageServivceImpl implements ImageService {
    @Override
    public Map policy() {
        return null;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        return null;
    }
}
