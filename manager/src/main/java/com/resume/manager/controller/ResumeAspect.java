//package com.resume.manager.controller;
//
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
///**
// * @ClassName testqq
// * @Description
// * @Author yellow Machine
// * @Date2020/5/25 10:06
// * @Version V1.0
// **/
//@Aspect
//@Component
//public class ResumeAspect {
//
////    @Pointcut("execution(* com.resume.manager.controller.LoginController.*(..))")
//    @Pointcut("execution(* com.resume.service.*.*Service.*(..)))")
//    public void pointCut(){
//    }
//    @Before(value="pointCut()")
//    public void before(){
//        System.out.println("前置處理");
//    }
//    @After(value="pointCut()")
//    public void After(){
//        System.out.println("後置處理");
//    }
//
//    @Around(value = "pointCut()")
//    public Object Around(){
//        System.out.println("处理中");
//        return null;
//    }
//    @AfterThrowing(value="pointCut()")
//    public void AfterThrowing(){
//        System.out.println("后置返回");
//    }
//    @AfterReturning(value="pointCut()")
//    public void AfterReturning(){
//        System.out.println("异常返回");
//    }
//}
