package com.itfei.mapper;

import com.itfei.model.LinkMan;

public interface LinkManMapper {
    int deleteByPrimaryKey(Integer lkmId);

    int insert(LinkMan record);

    int insertSelective(LinkMan record);

    LinkMan selectByPrimaryKey(Integer lkmId);

    int updateByPrimaryKeySelective(LinkMan record);

    int updateByPrimaryKey(LinkMan record);
}