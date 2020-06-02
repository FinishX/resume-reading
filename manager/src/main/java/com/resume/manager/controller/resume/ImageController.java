package com.resume.manager.controller.resume;

import com.resume.common.util.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName ImageController
 * @Description
 * @Author yellow Machine
 * @Date2020/5/22 13:58
 * @Version V1.0
 **/
@RestController
@RequestMapping("image")
public class ImageController {

//    @RequestMapping(value = "/policy", method = RequestMethod.GET)
//    @ResponseBody
//    public ResultData policy() {
//        OssPolicyResult result = ossService.policy();
//        return CommonResult.success(result);
//    }


    @Value("${upload.product.images}")
    private String uploadBasePath;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @CrossOrigin
    @ResponseBody
    public ResultData importData(@RequestParam("file") MultipartFile multiFile, HttpServletRequest req) throws IOException {
        String staticPath = req.getSession().getServletContext().getRealPath("/static");;
//        String staticPath = ClassUtils.getDefaultClassLoader().getResource("static").getPath();
        SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
        String format = sdf.format(new Date());
        /*
         * 按日期分类
         */
        String realPath = staticPath+"/"+uploadBasePath + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String oldName = multiFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));

        multiFile.transferTo(new File(folder,newName));
        //String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/upload" + format + newName;
        String httpBasePath = "/upload/product/images" + format + newName;

        return ResultData.successData(httpBasePath);
    }
}
