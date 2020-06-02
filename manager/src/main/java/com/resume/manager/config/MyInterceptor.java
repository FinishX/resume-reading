package com.resume.manager.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.resume.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MyInterceptor
 * @Description
 * @Author yellow Machine
 * @Date2020/5/18 14:52
 * @Version V1.0
 **/
@Component
public class MyInterceptor extends HandlerInterceptorAdapter {

    private static final Set<String> NOT_INTERCEPT_URI = new HashSet<>();//不拦截的URI

    static {
        NOT_INTERCEPT_URI.add("/login/login");
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public MyInterceptor() {
        super();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        System.out.println(request.getSession().getId());
        SysUserEntity sysUserEntity = JSON.parseObject(stringRedisTemplate.opsForValue().get("userEntity--"+request.getSession().getId()), new TypeReference<SysUserEntity>() {});
        String uri = request.getRequestURI();
        if (NOT_INTERCEPT_URI.contains(uri)) {
            return true;
        }
//        if (sysUserEntity == null) {
//            response.sendRedirect("http://localhost:8899/user/findAll");
////            throw new RuntimeException("用户未登陆");
//        }
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
