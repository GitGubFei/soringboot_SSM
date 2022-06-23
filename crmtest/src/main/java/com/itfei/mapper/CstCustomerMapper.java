package com.itfei.mapper;

import com.itfei.model.CstCustomer;

public interface CstCustomerMapper {
    int deleteByPrimaryKey(Integer custNoId);

    int insert(CstCustomer record);

    int insertSelective(CstCustomer record);

    CstCustomer selectByPrimaryKey(Integer custNoId);

    int updateByPrimaryKeySelective(CstCustomer record);

    int updateByPrimaryKey(CstCustomer record);
}