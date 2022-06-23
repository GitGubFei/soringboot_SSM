package com.itfei.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itfei.dao.UserinfoDao;
import com.itfei.domain.UserInfo;
import com.itfei.services.UserinfoService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServicesImpl extends ServiceImpl<UserinfoDao, UserInfo> implements UserinfoService {
    @Autowired
    private UserinfoDao userinfoDao;
    @Override
    public UserInfo getByid(Integer id) {
        return userinfoDao.selectById(id);
    }

    @Override
    public UserInfo userLogin(UserInfo userinfo) {
        LambdaQueryWrapper<UserInfo> newsLambdaQueryWrapper=new LambdaQueryWrapper<>();
        newsLambdaQueryWrapper.eq(Strings.isNotEmpty(userinfo.getUserName()), UserInfo::getUserName,userinfo.getUserName());
        newsLambdaQueryWrapper.eq(Strings.isNotEmpty(userinfo.getUserPwd()), UserInfo::getUserPwd,userinfo.getUserPwd());
        UserInfo newuserinfo= userinfoDao.selectOne(newsLambdaQueryWrapper);
        //userinfoDao.selectPage(newsLambdaQueryWrapper);
        return newuserinfo;
    }

}
