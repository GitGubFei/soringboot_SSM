package com.itfei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfei.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserinfoDao  extends BaseMapper<UserInfo> {
}
