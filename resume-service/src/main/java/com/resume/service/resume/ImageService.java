package com.resume.service.resume;

import com.resume.common.util.OssCallbackResult;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @ClassName ImageService
 * @Description
 * @Author yellow Machine
 * @Date2020/5/22 15:15
 * @Version V1.0
 **/
public interface ImageService {

    /**
     * oss上传策略生成
     */
    Map policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
