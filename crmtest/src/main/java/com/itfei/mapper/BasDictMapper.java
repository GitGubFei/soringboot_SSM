package com.itfei.mapper;

import com.itfei.model.BasDict;

public interface BasDictMapper {
    int deleteByPrimaryKey(Integer dictId);

    int insert(BasDict record);

    int insertSelective(BasDict record);

    BasDict selectByPrimaryKey(Integer dictId);

    int updateByPrimaryKeySelective(BasDict record);

    int updateByPrimaryKey(BasDict record);
}