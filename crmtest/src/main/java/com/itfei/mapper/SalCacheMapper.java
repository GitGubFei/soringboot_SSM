package com.itfei.mapper;

import com.itfei.model.SalCache;

public interface SalCacheMapper {
    int deleteByPrimaryKey(Integer chcId);

    int insert(SalCache record);

    int insertSelective(SalCache record);

    SalCache selectByPrimaryKey(Integer chcId);

    int updateByPrimaryKeySelective(SalCache record);

    int updateByPrimaryKey(SalCache record);
}