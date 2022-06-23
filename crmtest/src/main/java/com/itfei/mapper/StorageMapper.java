package com.itfei.mapper;

import com.itfei.model.Storage;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer stkId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer stkId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}