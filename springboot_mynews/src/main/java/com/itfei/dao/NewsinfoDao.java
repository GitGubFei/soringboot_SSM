package com.itfei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfei.domain.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsinfoDao  extends BaseMapper<News> {
}
