package com.itfei.config;

import com.itfei.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
       // InterceptorRegistration registration = registry.addInterceptor(new UserInterceptor());
//        registration.addPathPatterns("/**");                      //所有路径都被拦截
//        registration.excludePathPatterns("/css/**","/images/**","/js/**","/jquery/**","/fonts/**","/admin/login.html",
//                "/favicon.ico","/user/login","/index.html","/getVerify?r=**","/login.html","/","/userallnewstype","/userallnews/**");

        //String [] addPathPatterns={"/**"};
//        String [] excludePathPatterns={"/js/*","/css/*","/font/*"};
//        registry.addInterceptor(new UserInterceptor()).addPathPatterns().excludePathPatterns(excludePathPatterns);
    }
}
