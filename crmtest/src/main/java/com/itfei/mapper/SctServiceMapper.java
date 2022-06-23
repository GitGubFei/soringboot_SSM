package com.itfei.mapper;

import com.itfei.model.SctService;

public interface SctServiceMapper {
    int deleteByPrimaryKey(Integer svrId);

    int insert(SctService record);

    int insertSelective(SctService record);

    SctService selectByPrimaryKey(Integer svrId);

    int updateByPrimaryKeySelective(SctService record);

    int updateByPrimaryKey(SctService record);
}