package com.itfei.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itfei.domain.UserInfo;

public interface UserinfoService extends IService<UserInfo> {
    UserInfo getByid(Integer id);
    UserInfo userLogin(UserInfo userinfo);
}
