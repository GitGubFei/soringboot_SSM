package com.itfei.mapper;

import com.itfei.model.Cstactity;

public interface CstactityMapper {
    int deleteByPrimaryKey(Integer atvId);

    int insert(Cstactity record);

    int insertSelective(Cstactity record);

    Cstactity selectByPrimaryKey(Integer atvId);

    int updateByPrimaryKeySelective(Cstactity record);

    int updateByPrimaryKey(Cstactity record);
}