package com.itfei.mapper;

import com.itfei.model.OrderLine;

public interface OrderLineMapper {
    int deleteByPrimaryKey(Integer oddId);

    int insert(OrderLine record);

    int insertSelective(OrderLine record);

    OrderLine selectByPrimaryKey(Integer oddId);

    int updateByPrimaryKeySelective(OrderLine record);

    int updateByPrimaryKey(OrderLine record);
}