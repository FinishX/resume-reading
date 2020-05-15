package com.resume.common.util;

/**
 * @ClassName ResultData
 * @Description
 * @Author yellow Machine
 * @Date2020/5/15 15:59
 * @Version V1.0
 **/
public class ResultData {

    private String code;
    private String msg;

    public static String SUCCESS_CODE="200";
    public static String ERROR_CODE="500";
    public static String WARING_CODE="403";

    public static ResultData successData(String msg){
        ResultData resultData = new ResultData();
        resultData.msg=msg;
        resultData.code=SUCCESS_CODE;
        return resultData;
    }

    public static ResultData waringData(String msg){
        ResultData resultData = new ResultData();
        resultData.msg=msg;
        resultData.code=WARING_CODE;
        return resultData;
    }

    public static ResultData errorData(String msg){
        ResultData resultData = new ResultData();
        resultData.msg=msg;
        resultData.code=ERROR_CODE;
        return resultData;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
