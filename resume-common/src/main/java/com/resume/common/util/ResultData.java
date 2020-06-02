package com.resume.common.util;

/**
 * @ClassName ResultData
 * @Description
 * @Author yellow Machine
 * @Date2020/5/15 15:59
 * @Version V1.0
 **/
public class ResultData {

    private Integer code;
    private Object data;

    public static Integer SUCCESS_CODE= 200;
    public static Integer ERROR_CODE= 500;
    public static Integer WARING_CODE= 403;

    public static ResultData successData(Object data){
        ResultData resultData = new ResultData();
        resultData.data=data;
        resultData.code=SUCCESS_CODE;
        return resultData;
    }

    public static ResultData waringData(Object data){
        ResultData resultData = new ResultData();
        resultData.data=data;
        resultData.code=WARING_CODE;
        return resultData;
    }

    public static ResultData errorData(String data){
        ResultData resultData = new ResultData();
        resultData.data=data;
        resultData.code=ERROR_CODE;
        return resultData;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
