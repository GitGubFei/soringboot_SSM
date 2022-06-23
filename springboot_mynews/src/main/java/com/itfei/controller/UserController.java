package com.itfei.controller;

import com.itfei.domain.UserInfo;
import com.itfei.services.UserinfoService;
import com.itfei.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserinfoService userinfoService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public R userLogin(@RequestBody UserInfo userinfo, HttpServletRequest request){
        System.out.println(userinfo);
        UserInfo newuserinfo= userinfoService.userLogin(userinfo);
        userinfo.setUserPwd("");
        request.getSession().setAttribute("userinfo",newuserinfo);
        System.out.println(newuserinfo);
        return new R(newuserinfo!=null);
    }
    @RequestMapping(value = "/logininfo",method = RequestMethod.GET)
    public R getUserLoginInfo(HttpServletRequest request){
        UserInfo userInfo=(UserInfo) request.getSession().getAttribute("userinfo");
        return new R(true,userInfo.getUserNickName());
    }
}
